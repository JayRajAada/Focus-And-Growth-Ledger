import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        List<Book> library = new ArrayList<>();
        List<Insight> insights = new ArrayList<>();

        System.out.println("=====================================");
        System.out.println("  Welcome to the Growth Journal ");
        System.out.println("=====================================");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Log a new Book or Insight");
            System.out.println("2. Start Focus Session (Coming Soon)");
            System.out.println("3. View Growth Dashboard (View Insights)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nWhat would you like to log?");
                    System.out.println("A. A New Book");
                    System.out.println("B. A New Insight/Quote");
                    System.out.print("Choice: ");
                    String subChoice = scanner.nextLine().toUpperCase();

                    if (subChoice.equals("A")) {
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        
                        // Create a new Book object and add it to the list
                        library.add(new Book(title, author));
                        System.out.println("Success! Book added to your library.");
                        
                    } else if (subChoice.equals("B")) {
                        System.out.print("Enter the book this insight is from: ");
                        String bookTitle = scanner.nextLine();
                        System.out.print("Enter your insight or quote: ");
                        String content = scanner.nextLine();
                        System.out.print("Enter a tag (e.g., philosophy, habit): ");
                        String tag = scanner.nextLine();
                        
                        insights.add(new Insight(bookTitle, content, tag));
                        System.out.println("Success! Insight logged.");
                        
                    } else {
                        System.out.println("Invalid choice. Returning to main menu.");
                    }
                    break;
                    
                case "2":
                    System.out.println("[System]: Pomodoro timer module will be integrated here.");
                    break;
                    
                case "3":
                    System.out.println("\n--- Your Logged Insights ---");
                    if (insights.isEmpty()) {
                        System.out.println("No insights logged yet. Go read a book!");
                    } else {
                        for (Insight insight : insights) {
                            System.out.println(insight.toString());
                        }
                    }
                    break;
                    
                case "4":
                    System.out.println("Saving data... Exiting. Keep growing!");
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
        
        scanner.close();
    }
}