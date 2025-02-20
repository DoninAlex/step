package by.donin.H2025_02_05;

public class EBook extends Book {
    private int fileSize;

    public EBook(String title, Author author, int year, int fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " filesize: " + fileSize + " Mb";
    }

    @Override
    public String getDescription() {
        return "[e] " + super.getDescription() + ", filesize: " + fileSize + " Mb";
    }
}
