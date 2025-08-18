#ifndef SPOT_H
#define SPOT_H

#include <string>
#include "vehicle.h"

class Spot {
private:
    std::string spotId;
    Vehicle* vehicle;

public:
    explicit Spot(const std::string& spotId);
    std::string to_string() const;
    bool isVacant() const;
    void setOccupied(Vehicle* v);
    void setFree();
};

#endif