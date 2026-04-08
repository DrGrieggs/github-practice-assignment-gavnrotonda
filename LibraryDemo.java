public class LibraryDemo {
    public static void main(String[] args) {
        // Create a library
        Library myLibrary = new Library("City Public Library");
        
        System.out.println("Welcome to " + myLibrary.getLibraryName() + "!\n");
        
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        
        


        // Add books to the library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        
        // Display all books
        myLibrary.displayAllBooks();
        
        // Check out a book
        System.out.println("\n--- Checking out a book ---");
        book1.checkOut();
        
        // Try to check out the same book again
        book1.checkOut();
        
        // Display available books
        myLibrary.displayAvailableBooks();
        
        // Return the book
        System.out.println("\n--- Returning a book ---");
        book1.returnBook();
        
        // Display available books again
        myLibrary.displayAvailableBooks();
        
        // Find a book by title
        System.out.println("\n--- Searching for a book ---");
        Book foundBook = myLibrary.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found book:\n" + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}
