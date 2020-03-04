package pl.javastart.library.model;

public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    public Book(String title, String author, int releaseDate,
         int pages, String publisher, String isbn) {
        this(title, author, releaseDate, pages, publisher);
        this.isbn = isbn;
        System.out.println("Konstruktor 1");
    }

    public Book(String title, String author, int releaseDate, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages = pages;
        this.publisher = publisher;
        System.out.println("Konstruktor 2");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
