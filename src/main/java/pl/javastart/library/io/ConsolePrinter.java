package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

import java.util.Collection;
import java.util.function.Function;

public class ConsolePrinter {
    //zmiana typu parametru
    public void printBooks(Collection<Publication> publications) {
//  Przeglądanie za pomocą pętli foreach
//        int counter = 0;
//   1     for (Publication publication : publications) {
//   2        if(publication instanceof Book) {
//   3            printLine(publication.toString());
//   4            counter++;
//            }
//        }

/*1*/   long count = publications.stream()
/*2*/           .filter(p -> p instanceof Book)
/*3*/           .map(Publication::toString)
/*3*/           .peek(this::printLine)
/*4*/           .count();
        if (count == 0)
            printLine("Brak książek w bibliotece");
    }

    //zmiana typu parametru
    public void printMagazines(Collection<Publication> publications) {
       long count =  publications.stream()
               .filter(p -> p instanceof Magazine)
               .map(Publication::toString)
               .peek(this::printLine)
               .count();
        if (count == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
        long count = users.stream()
                .map(LibraryUser::toString)
                .peek(this::printLine)
                .count();
        if (count == 0)
            printLine("Brak użytkowników w bibliotece");
    }

    public void printLine(String text) {
        System.out.println(text);
    }

}