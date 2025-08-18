#ifndef PARKING_LOT_H
#define PARKING_LOT_H

#include <vector>
#include <string>
#include <chrono>
#include <stdexcept>
#include <iostream>

#include "entrance.h"
#include "egress.h"
#include "floor.h"
#include "ticket.h"
#include "vehicle.h"
#include "floors.h"
#include "helpers.h"

class ParkingLot : public Entrance, public Egress {
private:
    std::vector<Floor*> floors;
    std::vector<Ticket*> tickets;

public:
    explicit ParkingLot(int floorSize);
    Ticket* fileTicket(Vehicle* vehicle) override;
    int paymentProcess(Ticket* ticket) override;
    void printStatus() const;
    const std::vector<Floor*>& getFloors() const;
    const std::vector<Ticket*>& getTickets() const;
    ~ParkingLot();
};

#endif