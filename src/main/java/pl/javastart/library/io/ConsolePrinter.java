package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

public class ConsolePrinter {
    public void printBooks(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Book) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("There are no books in the library");
    }

    public void printMagazines(Publication[] publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine) {
                printLine(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("No magazines in the library");
    }

    public void printLine(String text) {
        System.out.println(text);
    }
}

