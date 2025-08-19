#include "vehicle.h"
using namespace std;

Vehicle::Vehicle(const string& lic) : lic(lic) {}

const string& Vehicle::to_string() const {
    return lic;
}