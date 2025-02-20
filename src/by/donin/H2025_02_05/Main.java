package by.donin.H2025_02_05;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(1000000);
        Author author = new Author("Джон", "Толкин", 1892);
        library.addBook(new Book("Властелин колец", author, 1955));
        library.addBook(new Book("Хоббит, или Туда и обратно", author, 1937));
        library.addBook(new EBook("Дорога вдаль и вдаль идёт", author, 1967, 40));
        author = new Author("Гарри", "Гаррисон", 1925);
        library.addBook(new Book("Неукротимая планета", author, 1960));
        library.addBook(new Book("Специалист по этике", author, 1964));
        library.addBook(new Book("Конные Варвары", author, 1968));
        author = new Author("Роберт", "Шекли", 1928);
        library.addBook(new Book("Обмен разумов", author, 1965));
        library.addBook(new Book("Корпорация 'Бессмертие'", author, 1959));
        library.addBook(new Book("Координаты чудес", author, 1968));

        System.out.println("<<< Все книги:");
        library.printBooks();

        System.out.println("\n<<< Поиск книги 'Властелин колец':");
        Book findBook = library.findBook("Властелин колец");
        if (findBook != null) {
            System.out.println("НАЙДЕНО > " + findBook.toString());
        } else {
            System.out.println("Книга не найдена в библиотеке!");
        }

        System.out.println("\n<<< Книги после сортировки по году издания:");
        library.sortBooksByYear();
        library.printBooks();

        System.out.println("\n<<< Книги после сортировки по году рождения автора:");
        library.sortBooksByAuthorBirthYear();
        library.printBooks();

        System.out.println("\n<<< Книги после сортировки по названию:");
        library.sortBooksByTitle();
        library.printBooks();

        System.out.println("\n<<< Поиск книги 'Дорога вдаль и вдаль идёт':");
        System.out.println("НАЙДЕНО > " + library.findBook("Дорога вдаль и вдаль идёт").getDescription());
    }
}
