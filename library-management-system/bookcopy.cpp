#include "book.h"
#include "bookcopy.h"
#include <string>
using namespace std;
using namespace chrono;

BookCopy::BookCopy(const string& barCode, Book* bookInfo) : bookInfo(bookInfo), barCode(barCode), available(true), issued_at(0) {}

void BookCopy::set_available(bool value) {
    available = value;
}

bool BookCopy::is_available() const {
    return available == true;
}

void BookCopy::set_issued_at(system_clock::time_point time) {
    issued_at = system_clock::to_time_t(time);
}

string BookCopy::to_string() {
    return barCode + "->" + bookInfo->get_name();
}