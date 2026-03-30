public class Insight {
    private String bookTitle;
    private String content; // The actual quote or thought
    private String tag;     // e.g., "philosophy", "communication", "life-lesson"

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