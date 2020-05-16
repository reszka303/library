package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {
    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOK = 2;

    private DataReader dataReader = new DataReader();

    private Library library = new Library();

    public void controlLoop() {
        int option;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOK:
                    printBooks();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("There is no option, input again");
            }
        } while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Choose an option");
        System.out.println(EXIT + " - Exit the program");
        System.out.println(ADD_BOOK + " - Add a new book");
        System.out.println(PRINT_BOOK + " - Display available books");
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
