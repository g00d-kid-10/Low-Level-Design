#ifndef LIBRARY_H
#define LIBRARY_H
#include <string>
#include <vector>

class Book;
class Librarian;
class Member;
class Library {
    private:
        std::vector<Book*> books;
        std::vector<Librarian*> librarians;
        std::vector<Member*> members;

    public:
        Library();
        const std::vector<Book*>& get_books() const;
        const std::vector<Librarian*>& get_librarians() const;
        const std::vector<Member*>& get_members() const;
        void add_book(Book* book);
        Book* searchByTitle(std::string title);
        void register_user(User* user);
        ~Library() = default;
};

#endif