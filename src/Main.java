import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=====================================");
        System.out.println("  Welcome to the Focus & Growth Ledger ");
        System.out.println("=====================================");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Log a new Book or Insight (Coming Soon)");
            System.out.println("2. Start Focus Session (Coming Soon)");
            System.out.println("3. View Growth Dashboard (Coming Soon)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("[System]: Insight logger module will be integrated here.");
                    break;
                case "2":
                    System.out.println("[System]: Pomodoro timer module will be integrated here.");
                    break;
                case "3":
                    System.out.println("[System]: Analytics and search module will go here.");
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