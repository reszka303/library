package pl.javastart.library.io.file;

import pl.javastart.library.model.Library;

public interface FileManager {
    Library importData();//read
    void exportData(Library library);//write
}