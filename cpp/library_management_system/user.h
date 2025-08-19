#ifndef USER_H
#define USER_H
#include <string>

class User {
    private:
        std::string name;
    
    public:
        User(const std::string& name);
        std::string to_string();
        virtual ~User() = default;
};

#endif