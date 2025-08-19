#include "ticket.h"
#include <ctime>
#include <string>

using namespace std;
using namespace std::chrono;

Ticket::Ticket(Vehicle* v, const string& id, system_clock::time_point time, Spot* s, int rate)
    : vehicle(v), ticketId(id), entryTime(time), spot(s), hourlyRate(rate) {}

string Ticket::to_string() const {
    time_t et = system_clock::to_time_t(entryTime);
    char* timeStr = ctime(&et);
    string entryTimeStr = timeStr ? string(timeStr) : "UNKNOWN_TIME";

    return "Ticket{vehicle=" + (vehicle ? vehicle->to_string() : "null") +
           ", ticketId='" + ticketId +
           "', entryTime=" + entryTimeStr +
           ", spot=" + (spot ? spot->to_string() : "null") +
           ", hourlyRate=" + std::to_string(hourlyRate) + "}";
}
