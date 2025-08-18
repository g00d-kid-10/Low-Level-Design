#include "user.h"
#include <string>
using namespace std;

User::User(const string& name) : name(name) {}
string User::to_string() {
    return name;
}