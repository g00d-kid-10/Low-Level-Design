#ifndef FLOOR_H
#define FLOOR_H

#include <string>
#include <vector>
#include "spot.h"

class Floor {
private:
    std::string floorId;
    std::vector<Spot> spots;

public:
    explicit Floor(const std::string& floorId, int size);
    const std::vector<Spot>& getSpots() const;
    Spot* getFirstVacantSpot();
    std::string to_string() const;
};

#endif