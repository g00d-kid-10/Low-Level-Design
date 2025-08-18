#ifndef ENTRANCE_H
#define ENTRANCE_H

#include "vehicle.h"
#include "ticket.h"

class Entrance {
public:
    virtual Ticket* fileTicket(Vehicle* vehicle) = 0;
    virtual ~Entrance() = default;
};

#endif
