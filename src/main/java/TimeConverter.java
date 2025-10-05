import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("\nConvert time to total seconds\n");

            int hours = getComponent(scanner, "hours");
            int minutes = getComponent(scanner, "minutes");
            int seconds = getComponent(scanner, "seconds");

            int totalSeconds = hours * 3600 + minutes * 60 + seconds;

            System.out.println("\nTime Conversion:");
            System.out.printf("Input: %d hour%s, %d minute%s, and %d second%s\n",
                    hours, plural(hours), minutes, plural(minutes), seconds, plural(seconds));
            System.out.printf("Total seconds: %d seconds\n", totalSeconds);

            System.out.println("\nCalculation:");
            System.out.printf("%d hours × 3600 = %d seconds\n", hours, hours * 3600);
            System.out.printf("%d minutes × 60 = %d seconds\n", minutes, minutes * 60);
            System.out.printf("%d seconds = %d seconds\n", seconds, seconds);
            System.out.printf("Total: %d seconds\n", totalSeconds);

            keepGoing = askToContinue(scanner);
        }
        System.out.println("Goodbye!");
        scanner.close();
    }

    private static int getComponent(Scanner scanner, String name) {
        while (true) {
            System.out.printf("Enter %s: ", name);
            String input = scanner.nextLine().trim();
            try {
                int val = Integer.parseInt(input);
                if (val >= 0) {
                    return val;
                } else {
                    System.out.println("Please enter a non-negative integer value.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer value.");
            }
        }
    }

    private static boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.print("\nDo you want to convert another time? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y")) return true;
            if (input.equals("n")) return false;
            System.out.println("Please enter 'y' for yes or 'n' for no.");
        }
    }

    private static String plural(int val) {
        return (val == 1) ? "" : "s";
    }
}