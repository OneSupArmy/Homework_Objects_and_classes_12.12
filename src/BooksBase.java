public class BooksBase {
    public static void main(String[] args) {
        Author jkRowling = new Author("Joanne", "Rowling");
        Book harryPotterPartFive = new Book("Harry Potter and the Order of the Phoenix", jkRowling, 2003);
        Author jrTolkien = new Author("John-Ronald", "Tolkien");
        Book lordOfTheRings = new Book("The Fellowship of the Ring", jrTolkien, 1954);
        lordOfTheRings.setYearOfPublishing(2000);
        Library firstLibrary = new Library(5);
        firstLibrary.addBookInBase(harryPotterPartFive);
        firstLibrary.addBookInBase(lordOfTheRings);
    }
}

