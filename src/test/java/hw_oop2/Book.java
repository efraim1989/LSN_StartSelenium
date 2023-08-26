package hw_oop2;

public class Book {

    private String name;
    private String author;
    private String publisher;
    private int page;
    private long EAN;


    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public Book withName(String name) {
        this.name = name;
        return this;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public Book withAuthor(String author) {
        this.author = author;
        return this;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Book withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public Book withPage(int page) {
        if (page < 0) {return this;}
        this.page = page;
        return this;
    }

    public void setEAN(long EAN) {
        this.EAN = EAN;
    }
    public Book withEAN(long EAN) {
        if (EAN < 0) {return this;}
        this.EAN = EAN;
        return this;
    }



    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPage() {
        return page;
    }

    public long getEAN() {
        return EAN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", page=" + page +
                ", EAN=" + EAN +
                '}';
    }
}
