package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBook = 2;

    private DataReader dataReader = new DataReader();

    private Library library = new Library();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBook:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("There is no option, input again");
            }
        } while (option != exit);
    }

    private void printOptions() {
        System.out.println("Choose an option");
        System.out.println(exit + " - Exit the program");
        System.out.println(addBook + " - Add a new book");
        System.out.println(printBook + " - Display available books");
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void exit() {
        System.out.println("End the program, bye!");
        dataReader.close();
    }
}
