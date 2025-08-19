#include <iostream>
#include "user.h"
#include "book.h"
#include "bookcopy.h"
#include "member.h"
#include "library.h"
#include "librarian.h"
using namespace std;

int main() {

    Library* janta_library = new Library();
    
    Librarian* suraj = new Librarian("Suraj", janta_library);
    Librarian* manoj = new Librarian("Manoj", janta_library);

    Member* shubham = new Member("Shubham", janta_library);
    Member* animesh = new Member("Animesh", janta_library);

    vector<User*> users = {suraj, manoj, shubham, animesh};
    for(User* user : users) janta_library->register_user(user);

    Book* fast_and_slow = new Book("ISBN11111", "Fast and Slow Thinking", {});
    Book* sapiens = new Book("ISBN22222", "Sapiens", {});

    fast_and_slow->add_copy("BARCODE1");
    fast_and_slow->add_copy("BARCODE2");
    fast_and_slow->add_copy("BARCODE3");

    sapiens->add_copy("BARCODE9");
    sapiens->add_copy("BARCODE10");

    suraj->add_book(fast_and_slow);
    manoj->add_book(sapiens);

    // shubham->borrow_book(suraj, fast_and_slow);
    // animesh->borrow_book(manoj, sapiens);
    // animesh->borrow_book(manoj, sapiens);

    suraj->issue_copy(fast_and_slow, shubham);
    suraj->issue_copy(fast_and_slow, shubham);
    // animesh->borrow_book(manoj, sapiens);
    // shubham->return_book();

    // cout << suraj->print_tracker();
    vector<BookCopy*> issues = shubham->issued_books();
    for(BookCopy* issue : issues) {
        cout << issue->to_string() << endl;
    }
    // cout << manoj->print_tracker();

    return 0;
}