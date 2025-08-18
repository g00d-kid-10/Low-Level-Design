#ifndef VEHICLE_H
#define VEHICLE_H

#include <string>

class Vehicle {
private:
    std::string lic;

public:
    explicit Vehicle(const std::string& lic);
    const std::string& to_string() const;
};

#endif