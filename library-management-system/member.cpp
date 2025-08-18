#include "member.h"
#include "library.h"
#include "librarian.h"
#include "book.h"
#include "bookcopy.h"
#include <iostream>
#include <string>
using namespace std;

Member::Member(string name, Library* lib) : User(name), library(lib) {}

void Member::borrow_book(Librarian* librarian, Book* book) {
    try {
        BookCopy* issued_copy = librarian->issue_copy(book, this);
        issuedBooks.push_back(issued_copy);
        cout << "Book borrowed successfully: " << book->get_name() << endl;
    } catch(const std::runtime_error e) {
        cout << "Failed to borrow book: " << e.what() << endl;
    }
}

Book* Member::checkout_book(string title) {
    return library->searchByTitle(title);
}

void Member::return_book() {}

const vector<BookCopy*>& Member::issued_books() {
    return issuedBooks;
} 