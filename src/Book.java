public class Book {
    private String title;
    private String author;
    private boolean isFinished;

    // Constructor: This is called when you add a new book
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isFinished = false; // Defaults to currently reading
    }

    // Getters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isFinished() {
        return isFinished;
    }

    // Setters
    public void markAsFinished() {
        this.isFinished = true;
    }

    // How the book prints out in the console
    @Override
    public String toString() {
        String status = isFinished ? "[Completed]" : "[Reading]";
        return status + " " + title + " by " + author;
    }
}