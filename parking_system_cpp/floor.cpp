#include "floor.h"
#include <string>
#include <vector>

Floor::Floor(const std::string& floorId, int size) : floorId(floorId) {
    for (int i = 0; i < size; i++) {
        std::string str = floorId + static_cast<char>('0' + i);
        spots.emplace_back(str);
    }
}

const std::vector<Spot>& Floor::getSpots() const {
    return spots;
}

Spot* Floor::getFirstVacantSpot() {
    for (Spot& spot : spots) {
        if (spot.isVacant()) return &spot;
    }
    return nullptr;
}

std::string Floor::to_string() const {
    std::string res = "Floor ID: " + floorId + "\nSpots:\n";
    for (const auto& spot : spots) {
        res += "  - " + spot.to_string() + "\n";
    }
    return res;
}
