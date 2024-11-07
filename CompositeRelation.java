// Book class
class Book {
    private String title;         // Title of the book
    private String author;        // Author of the book
    private String isbn;          // ISBN number
    private int pages;            // Number of pages
    private int publicationYear;  // Year of publication

    public Book(String title, String author, String isbn, int pages, int publicationYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public void describeBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn +
                           ", Pages: " + pages + ", Publication Year: " + publicationYear);
    }

    // Getters for Book attributes
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPages() { return pages; }
    public int getPublicationYear() { return publicationYear; }
}

// Library class (Composition relationship with Book)
class Library {
    private String name;          // Name of the library
    private String address;       // Address of the library
    private int totalBooks;       // Total number of books in the library
    private String librarian;     // Librarian's name
    private Book featuredBook;    // The featured book in the library (Composition)

    public Library(String name, String address, int totalBooks, String librarian, Book featuredBook) {
        this.name = name;
        this.address = address;
        this.totalBooks = totalBooks;
        this.librarian = librarian;
        this.featuredBook = featuredBook; // Library "has-a" Book (Composition)
    }

    public void describeLibrary() {
        System.out.println("Library Name: " + name + ", Address: " + address + 
                           ", Total Books: " + totalBooks + ", Librarian: " + librarian);
        System.out.println("Featured Book:");
        featuredBook.describeBook();  // Describe the featured book
    }

    // Getters for Library attributes
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getTotalBooks() { return totalBooks; }
    public String getLibrarian() { return librarian; }
}
class CompositeRelation {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 180, 1925);

        // Create a Library object (composition relationship with Book)
        Library library = new Library("Central Library", "456 Elm Street", 10000, "Jane Doe", book);

        // Describe the library and its featured book
        library.describeLibrary();
    }
}
