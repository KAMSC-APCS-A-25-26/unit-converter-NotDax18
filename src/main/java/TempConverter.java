import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            displayMenu();
            int choice = getValidChoice(scanner);

            switch (choice) {
                case 1:
                    convertFahrenheitToCelsius(scanner);
                    break;
                case 2:
                    convertCelsiusToFahrenheit(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nChoose conversion direction:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1, 2, or 3): ");
    }

    private static int getValidChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            System.out.print("Enter your choice (1, 2, or 3): ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void convertFahrenheitToCelsius(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Enter temperature in Fahrenheit: ");
            scanner.next();
        }
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("Conversion Results:\nFahrenheit: %.1f\nCelsius: %.1f\n",
                fahrenheit, celsius);
    }

    private static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Enter temperature in Celsius: ");
            scanner.next();
        }
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.printf("Conversion Results:\nCelsius: %.1f\nFahrenheit: %.1f\n",
                celsius, fahrenheit);
    }
}