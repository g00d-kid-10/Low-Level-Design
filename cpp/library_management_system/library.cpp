#include "user.h"
#include "library.h"
#include "book.h"
#include "librarian.h"
#include "member.h"
#include <string>
#include <vector>

using namespace std;

Library::Library() {}

const vector<Book*>& Library::get_books() const {
    return books;
}

const vector<Librarian*>& Library::get_librarians() const {
    return librarians;
}

const vector<Member*>& Library::get_members() const {
    return members;
}

void Library::add_book(Book* book) {
    books.push_back(book);
}

Book* Library::searchByTitle(string title) {
    for(Book* book : books) {
        if(title == book->get_name()) {
            return book;
        }
    }

    return nullptr;
}

void Library::register_user(User* user) {
    if(Librarian* l = dynamic_cast<Librarian*>(user)) {
        librarians.push_back(l);
    } else if(Member* m = dynamic_cast<Member*>(user)) {
        members.push_back(m);
    }
}