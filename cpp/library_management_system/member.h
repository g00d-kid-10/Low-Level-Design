#ifndef MEMBER_H
#define MEMBER_H

#include "user.h"
#include "library.h"
#include "librarian.h"
#include "bookcopy.h"
#include "book.h"
#include <string>
#include <vector>

class User;
class Librarian;
class BookCopy;
class Book;

class Member : public User {
    private:
        Library* library;
        int totalBooks;
        std::vector<BookCopy*> issuedBooks;

    public:
        Member(std::string name, Library* lib);
        void borrow_book(Librarian* librarian, Book* book);
        Book* checkout_book(std::string title);
        void return_book();
        const std::vector<BookCopy*>& issued_books();
        ~Member() = default;
};

#endif