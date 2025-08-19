#ifndef BOOK_H
#define BOOK_H
#include <string>
#include <vector>

class BookCopy;
class Book {
    private:
        std::string isbn;
        std::string name;
        std::vector<BookCopy*> copies;

    public:
        Book(const std::string& isbn, const std::string& name, std::vector<BookCopy*> copies);
        const std::string& get_name() const;
        void add_copy(const std::string& barcode);
        BookCopy* pick_copy();
        const std::vector<BookCopy*>& get_copies() const;
        std::string to_string() const; 
        virtual ~Book() = default;
};

#endif