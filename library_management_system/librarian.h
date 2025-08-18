#ifndef LIBRARIAN_H
#define LIBRARIAN_H
#include "user.h"
#include "librarian.h"
#include "library.h"
#include "member.h"
#include "bookcopy.h"
#include "book.h"
#include <string>
#include <vector>
#include <unordered_map>

class Librarian : public User {
    private:
        Library* library;
        std::unordered_map<Member*, std::vector<BookCopy*>> member_tracker;
    
    public:
        Librarian(std::string name, Library* lib);
        Book* checkout_book(std::string title);
        void add_book(Book* book);
        void update_book(Book* book);
        void remove_book(Book* book);
        BookCopy* issue_copy(Book* book, Member* member);
        const std::string print_tracker() const;
        ~Librarian() = default;
};

#endif
