#include "helpers.h"
#include <string>

using namespace std;

string floorTypeToString(Floors type) {
    switch (type) {
        case Floors::BASEMENT: return "BASEMENT";
        case Floors::GROUND:   return "GROUND";
        case Floors::FIRST:    return "FIRST";
        case Floors::SECOND:   return "SECOND";
    }
    return "";
}

string generateUUID() {
    static int counter = 1;
    return "TICKET_" + to_string(counter++);
}
