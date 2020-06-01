package pl.javastart.library.app;

public enum Option {
    EXIT(0, "Exit the program"),
    ADD_BOOK(1, "Book addition"),
    ADD_MAGAZINE(2, "Addition of a magazine / newspaper"),
    PRINT_BOOKS(3, "Display available books"),
    PRINT_MAGAZINES(4, "Display of available magazines / newspapers");

    private int value;
    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return value + "-" + description;
    }

    static Option createFromInt(int option) {
        return Option.values()[option];
    }
}
