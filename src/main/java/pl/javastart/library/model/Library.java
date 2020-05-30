package pl.javastart.library.model;

public class Library {
    private static final int MAX_PUBLICATION = 2000;
    private Publication[] publications = new Publication[MAX_PUBLICATION];
    private int publicationsNumber = 0;

    public void addBook(Book book) {
        if (publicationsNumber < MAX_PUBLICATION) {
            publications[publicationsNumber] = book;
            publicationsNumber++;
        } else {
            System.out.println("The maximum number of books has been reached");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Book) {
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("There is no book");
        }
    }

    public void addMagazine(Magazine magazine) {
        if(publicationsNumber < MAX_PUBLICATION) {
            publications[publicationsNumber] = magazine;
            publicationsNumber++;
        } else {
            System.out.println("The maximum number of warehouses has been reached");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        for (int i = 0; i < publicationsNumber; i++) {
            if (publications[i] instanceof Magazine) {
                System.out.println(publications[i]);
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
            System.out.println("There is no magazine");
        }
    }
}