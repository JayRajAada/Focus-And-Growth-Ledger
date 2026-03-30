import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        List<Book> library = DataManager.loadBooks();
        List<Insight> insights = DataManager.loadInsights();

        System.out.println("=====================================");
        System.out.println("  Welcome to the Growth Journal ");
        System.out.println("=====================================");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Log a new Book or Insight");
            System.out.println("2. Start Focus Session (Pomodoro Timer)");
            System.out.println("3. View Growth Dashboard");
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
                    // Start the timer
                    FocusTimer.startSession(scanner);
                    
                    // Immediately ask to log an insight after the session ends
                    System.out.println("\nWould you like to log an insight from this session? (Y/N)");
                    String logChoice = scanner.nextLine().toUpperCase();
                    
                    if (logChoice.equals("Y")) {
                        System.out.print("Enter the book or topic you were studying: ");
                        String sessionBook = scanner.nextLine();
                        System.out.print("Enter your biggest takeaway/insight: ");
                        String sessionContent = scanner.nextLine();
                        System.out.print("Enter a tag: ");
                        String sessionTag = scanner.nextLine();
                        
                        insights.add(new Insight(sessionBook, sessionContent, sessionTag));
                        System.out.println("Success! Session insight logged.");
                    }
                    break;
                    
                case "3":
                    System.out.println("\n--- Growth Dashboard ---");
                    System.out.println("A. View My Library (Books)");
                    System.out.println("B. View My Insights (Quotes)");
                    System.out.print("What would you like to view? ");
                    String viewChoice = scanner.nextLine().toUpperCase();

                    if (viewChoice.equals("A")) {
                        if (library.isEmpty()) {
                            System.out.println("Your library is empty. Go add a book!");
                        } else {
                            System.out.println("\n=== MY LIBRARY ===");
                            for (Book b : library) {
                                System.out.println(b.toString());
                            }
                        }
                    } else if (viewChoice.equals("B")) {
                        if (insights.isEmpty()) {
                            System.out.println("No insights logged yet.");
                        } else {
                            System.out.println("\n=== MY INSIGHTS ===");
                            for (Insight i : insights) {
                                System.out.println(i.toString());
                            }
                        }
                    } else {
                        System.out.println("Invalid choice. Returning to menu.");
                    }
                    break;
                    
                case "4":
                    System.out.println("Saving data... Exiting. Keep growing!");
                    DataManager.saveInsights(insights);
                    DataManager.saveBooks(library);
                    running = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
        
        scanner.close();
    }
}