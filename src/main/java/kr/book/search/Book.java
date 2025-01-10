package kr.book.search;

public class Book {
    private String title;
    private String authors;
    private String publisher;
    private String thumnail;

    public Book(String title, String authors, String publisher, String thumnail) {
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.thumnail = thumnail;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getThumnail() {
        return thumnail;
    }

    public void setThumnail(String thumnail) {
        this.thumnail = thumnail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", thumnail='" + thumnail + '\'' +
                '}';
    }
}
