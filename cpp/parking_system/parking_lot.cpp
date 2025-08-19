#include "parking_lot.h"
#include <iostream>

using namespace std;
using namespace chrono;

ParkingLot::ParkingLot(int floorSize) {
    for (int i = static_cast<int>(Floors::BASEMENT); i <= static_cast<int>(Floors::SECOND); i++) {
        string floorName = floorTypeToString(static_cast<Floors>(i)) + '-' + static_cast<char>('0' + i);
        Floor* floor = new Floor(floorName, floorSize);
        floors.emplace_back(floor);
    }
}

Ticket* ParkingLot::fileTicket(Vehicle* vehicle) {
    Spot* spot = nullptr;
    for (Floor* floor : floors) {
        Spot* temp = floor->getFirstVacantSpot();
        if (temp) {
            spot = temp;
            break;
        }
    }

    if (!spot) throw runtime_error("Parking full");

    string ticketId = generateUUID();
    Ticket* ticket = new Ticket(vehicle, ticketId, system_clock::now(), spot, 30);
    tickets.emplace_back(ticket);
    spot->setOccupied(vehicle);
    return ticket;
}

int ParkingLot::paymentProcess(Ticket* ticket) {
    auto durationSec = duration_cast<seconds>(system_clock::now() - ticket->entryTime).count();
    ticket->spot->setFree();
    return static_cast<int>(durationSec) * ticket->hourlyRate;
}

void ParkingLot::printStatus() const {
    for (const Floor* floor : floors) {
        cout << floor->to_string();
    }
}

const vector<Floor*>& ParkingLot::getFloors() const {
    return floors;
}

const vector<Ticket*>& ParkingLot::getTickets() const {
    return tickets;
}

ParkingLot::~ParkingLot() {
    for (Floor* floor : floors) delete floor;
    for (Ticket* ticket : tickets) delete ticket;
}
