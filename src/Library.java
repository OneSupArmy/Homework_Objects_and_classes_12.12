import java.util.Scanner;

public class Library {
    private Book[] booksBase;
    public Library(int booksBaseLength) {
        this.booksBase = new Book[booksBaseLength];
    }
    public void printBookByTitle(String bookName) {
        for (int i = 0; i < booksBase.length; i++) {
            if (booksBase[i] != null && booksBase[i].getBookName().equals(bookName)) {//Нул на случай если потом сможем удалять книгу с первой позиции
                System.out.println(booksBase[i].getBookName() + " by " +
                        booksBase[i].getAuthor().getAuthorName() + " " +
                        booksBase[i].getAuthor().getAuthorSurname() + " was published in " +
                        booksBase[i].getYearOfPublishing());
                break;
            } else {
                System.out.println("This book is not found");
            }
        }
    }
    public void setYearByBookTitle(String bookName, int newYearOfPublishing) {
        for (int i = 0; i < booksBase.length; i++) {
            if (booksBase[i] != null && booksBase[i].getBookName().equals(bookName)){
                booksBase[i].setYearOfPublishing(newYearOfPublishing);
            }
        }
    }
    public void addBookInBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the author name");
        String newAuthorName = scanner.nextLine();
        System.out.println("Write the author surname");
        String newAuthorSurname = scanner.nextLine();
        System.out.println("Write the title of the book");
        String newTitle = scanner.nextLine();
        System.out.println("Set publication year");
        int newYearOfPublishing = scanner.nextInt();
        Author newAuthor = new Author(newAuthorName, newAuthorSurname);
        Book newBook = new Book(newTitle, newAuthor, newYearOfPublishing);
        for (int i = 0; i < booksBase.length; i++) {
            if (booksBase[i] == null) {
                booksBase[i] = newBook;
                break;
            }
        }
    }
    public void addBookInBase(Book newFullBook) {
        for (int i = 0; i < booksBase.length; i++) {
            if (booksBase[i] == null) {
                booksBase[i] = newFullBook;
                break;
            }
        }
    }
    public void printLibrary() {
        for (int i = 0; i < booksBase.length; i++) {
            if (!(booksBase[0] == null)) {
                if (!(booksBase[i] == null)) {
                    System.out.println(booksBase[i].getAuthor().getAuthorName() + " " +
                            booksBase[i].getAuthor().getAuthorSurname() + ": " +
                            booksBase[i].getBookName() + ": " +
                            booksBase[i].getYearOfPublishing());
                } else {
                    break;
                }
            } else {
                System.out.println("Library is empty");
                break;
            }
        }
    }
}
