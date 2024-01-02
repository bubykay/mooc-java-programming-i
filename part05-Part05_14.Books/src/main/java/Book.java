import java.util.Objects;

public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null) {
            return false;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        final Book comparedBook = (Book) o;
        if (this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        return false;
    }

}
