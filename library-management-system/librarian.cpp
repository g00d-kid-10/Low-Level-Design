#include "librarian.h"
#include "library.h"
#include "bookcopy.h"
#include "book.h"
#include "member.h"
#include <iostream>
#include <string>
#include <vector>
#include <chrono>

using namespace std;
using namespace chrono;

Librarian::Librarian(string name, Library* lib) : User(name), library(lib) {}

void Librarian::add_book(Book* book) {
    library->add_book(book);
}

Book* Librarian::checkout_book(string title) {
    return library->searchByTitle(title);
};

BookCopy* Librarian::issue_copy(Book* book, Member* member) {
    BookCopy* copy = book->pick_copy();
    if(!copy) {
        throw std::runtime_error("No available copies of the book: " + book->get_name());
        return nullptr;
    }

    copy->set_available(false);
    copy->set_issued_at(system_clock::now());
    member_tracker[member].push_back(copy);
    return copy;
}

void Librarian::update_book(Book* book) {}
void Librarian::remove_book(Book* book) {}

const string Librarian::print_tracker() const {
    string ans = "";
    for (const auto& entry : member_tracker) {
        Member* member = entry.first;
        ans += member->to_string() + ":\n";

        for (BookCopy* copy : entry.second) {
            ans += "  " + copy->to_string() + "\n";
        }
    }

    return ans;
};