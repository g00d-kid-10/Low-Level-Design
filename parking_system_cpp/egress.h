#ifndef EGRESS_H
#define EGRESS_H

#include "ticket.h"

class Egress {
public:
    virtual int paymentProcess(Ticket* ticket) = 0;
    virtual ~Egress() = default;
};

#endif