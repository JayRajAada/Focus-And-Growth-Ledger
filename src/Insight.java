import java.io.Serializable;

public class Insight implements Serializable {
    private static final long serialVersionUID = 1L; 

    private String bookTitle;
    private String content;
    private String tag;

    public Insight(String bookTitle, String content, String tag) {
        this.bookTitle = bookTitle;
        this.content = content;
        this.tag = tag;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getContent() {
        return content;
    }

    public String getTag() {
        return tag;
    }

    // Formats the insight nicely for the console
    @Override
    public String toString() {
        return "Tag: [" + tag.toUpperCase() + "]\n" +
               "\"" + content + "\"\n" +
               "— From: " + bookTitle + "\n" +
               "-----------------------------------";
    }
}