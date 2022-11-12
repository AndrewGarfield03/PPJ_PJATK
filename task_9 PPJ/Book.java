public class Book {
    private String title;
    private String author;
    private String body;


    public Book(String author, String title ,String body) {
        this.title = title;
        this.author = author;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

}
