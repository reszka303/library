package pl.javastart.library.app;

import pl.javastart.library.exception.NoSuchOptionException;

enum Option {
    EXIT(0, "Exit the program"),
    ADD_BOOK(1, "Book addition"),
    ADD_MAGAZINE(2,"Addition of a magazine / newspaper"),
    PRINT_BOOKS(3, "Display available books"),
    PRINT_MAGAZINES(4, "Display of available magazines / newspapers");

    private int value;
    private String description;

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    Option(int value, String desc) {
        this.value = value;
        this.description = desc;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("No option with id " + option);
        }
    }
}