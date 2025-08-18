#include "parking_lot.h"
#include "vehicle.h"
#include <vector>
#include <thread>
#include <iostream>

using namespace std;

int main() {
    ParkingLot parking(10);

    cout << "Initial parking status:" << endl;
    parking.printStatus();

    Vehicle* my_car = new Vehicle("MP17GJ123");
    Ticket* ticket = parking.fileTicket(my_car);

    cout << "\nAfter filing ticket:" << endl;
    parking.printStatus();

    cout << "Wait for 3 seconds..." << std::endl;
    this_thread::sleep_for(chrono::seconds(5));
    cout << "Done!" << std::endl;

    int amount = parking.paymentProcess(ticket);
    cout << "\nPayment due: " << amount << " units" << endl;

    delete my_car;

    return 0;
}
