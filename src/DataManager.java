import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    // We now have two separate files for the two different lists
    private static final String INSIGHT_FILE = "insights_database.dat";
    private static final String BOOK_FILE = "books_database.dat";

    public static void saveInsights(List<Insight> insights) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(INSIGHT_FILE))) {
            oos.writeObject(insights); 
            System.out.println("[System]: Insights saved successfully.");
        } catch (IOException e) {
            System.out.println("[System Error]: Could not save insights - " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Insight> loadInsights() {
        File file = new File(INSIGHT_FILE);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Insight>) ois.readObject(); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("[System Error]: Could not load insights - " + e.getMessage());
            return new ArrayList<>();
        }
    }


    public static void saveBooks(List<Book> books) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOOK_FILE))) {
            oos.writeObject(books);
            System.out.println("[System]: Library saved successfully.");
        } catch (IOException e) {
            System.out.println("[System Error]: Could not save books - " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Book> loadBooks() {
        File file = new File(BOOK_FILE);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("[System Error]: Could not load books - " + e.getMessage());
            return new ArrayList<>();
        }
    }
}