#include "bookcopy.h"
#include "book.h"
#include <string>
#include <vector>
using namespace std;

Book::Book(const string& isbn, const string& name, vector<BookCopy*> copies) : isbn(isbn), name(name), copies(copies) {}

const string& Book::get_name() const {
    return name;
}

void Book::add_copy(const string& barcode) {
    BookCopy* copy = new BookCopy(barcode, this);
    copies.push_back(copy);
}

BookCopy* Book::pick_copy() {
    for (BookCopy* copy : copies) {
        if (copy->is_available()) {
            copy->set_available(false);
            return copy;
        }
    }
    return nullptr;
}

const vector<BookCopy*>& Book::get_copies() const {
    return copies;
}

string Book::to_string() const {
    return isbn + "_" + name + "_" + "copies:" + std::to_string(copies.size());
}