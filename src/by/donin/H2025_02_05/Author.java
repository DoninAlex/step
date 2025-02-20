package by.donin.H2025_02_05;

public class Author {
    private  String name;
    private String surname;
    private int birthYear;

    public Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public String toString() {
        return surname + " " + name + " - " + birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
