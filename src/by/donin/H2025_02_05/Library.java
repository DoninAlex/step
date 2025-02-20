package by.donin.H2025_02_05;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        Book[] books1 = new Book[size + 1];
        for (int i = 0; i < size; i++) {
            books1[i] = books[i];
        }
        books1[size++] = book;
        books = books1;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + 1 + ". " + books[i].getDescription());
        }
    }

    public Book findBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Поиск по названию среди электронных книг
    public Book findEBook(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title) && books[i] instanceof EBook) {
                return books[i];
            }
        }
        return null;
    }

    public Book getBook(int bookIndex) {
        return books[bookIndex];
    }

    public int getSize() {
        return size;
    }

    public void sortBooksByYear() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (books[j].getYear() < books[j + 1].getYear()) {
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }

    public void sortBooksByAuthorBirthYear() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (books[j].getAuthor().getBirthYear() < books[j + 1].getAuthor().getBirthYear()) {
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }

    public void sortBooksByTitle() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (books[j].getTitle().compareTo(books[j + 1].getTitle()) > 0) {
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }
}
