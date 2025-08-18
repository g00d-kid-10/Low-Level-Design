#ifndef TICKET_H
#define TICKET_H

#include <string>
#include <chrono>
#include "vehicle.h"
#include "spot.h"

class Ticket {
private:
    Vehicle* vehicle;
    std::string ticketId;

public:
    std::chrono::system_clock::time_point entryTime;
    Spot* spot;
    int hourlyRate;

    explicit Ticket(Vehicle* v, const std::string& id, std::chrono::system_clock::time_point time, Spot* s, int rate);
    std::string to_string() const;
};

#endif
