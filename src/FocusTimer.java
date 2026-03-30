import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FocusTimer {

    public static void startSession(Scanner scanner) {
        System.out.println("\n=== DEEP WORK FOCUS SESSION ===");
        System.out.println("How many minutes would you like to focus?");
        System.out.print("Enter minutes (e.g., 25): ");
        
        int minutes;
        try {
            // Read input as a string and parse to integer to prevent scanner skipping line issues
            minutes = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Defaulting to 25 minutes.");
            minutes = 25;
        }

        System.out.println("\n[System]: Starting " + minutes + "-minute focus session.");
        System.out.println("[Tip]: Put on your japanese songs playlist and zone in!\n");

        int totalSeconds = minutes * 60;

        try {
            for (int i = totalSeconds; i > 0; i--) {
                int minsLeft = i / 60;
                int secsLeft = i % 60;
                
                // \r overwrites the current console line to make a smooth clock!
                // %02d ensures single digits have a leading zero (e.g., 09 instead of 9)
                System.out.printf("\rTime Remaining: %02d:%02d", minsLeft, secsLeft);
                
                // Pause the thread for exactly 1 second
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("\nTimer was interrupted!");
        }

        // Print a couple of blank lines to clear the \r formatting
        System.out.println("\n\nDING! DING! Session Complete.");
        System.out.println("Great job staying focused.");
    }
}