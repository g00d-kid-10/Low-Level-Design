#ifndef BOOKCOPY_H
#define BOOKCOPY_H
#include <string>
#include <chrono>
#include <ctime>

class Book;
class BookCopy {
    private:
        std::string barCode;
        Book* bookInfo;
        bool available;
        time_t issued_at;

    public:
        BookCopy(const std::string& barCode, Book* bookInfo);
        void set_available(bool value);
        bool is_available() const;
        void set_issued_at(std::chrono::system_clock::time_point time);
        std::string to_string();
        ~BookCopy() = default;
};

#endif