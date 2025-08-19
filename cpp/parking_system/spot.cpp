#include "spot.h"
#include <string>

using namespace std;

Spot::Spot(const string& spotId) : spotId(spotId), vehicle(nullptr) {}

string Spot::to_string() const {
    string res = spotId;
    res += " ";
    res += (!vehicle) ? "NULL" : vehicle->to_string();
    return res;
}

bool Spot::isVacant() const {
    return vehicle == nullptr;
}

void Spot::setOccupied(Vehicle* v) {
    vehicle = v;
}

void Spot::setFree() {
    vehicle = nullptr;
}
