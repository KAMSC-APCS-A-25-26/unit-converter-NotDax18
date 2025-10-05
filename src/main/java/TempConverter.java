import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getMenuChoice(scanner);

            switch (choice) {
                case 1:
                    double fahrenheit = getTemperature(scanner, "Fahrenheit");
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    printConversionResult(fahrenheit, "Fahrenheit", celsius, "Celsius");
                    break;
                case 2:
                    double cels = getTemperature(scanner, "Celsius");
                    double fahr = celsiusToFahrenheit(cels);
                    printConversionResult(cels, "Celsius", fahr, "Fahrenheit");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("Choose conversion direction:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Exit");
        System.out.print("\nEnter your choice (1, 2, or 3): ");
    }

    private static int getMenuChoice(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 3) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // Ignore, will print error below
            }
            System.out.print("Invalid choice. Please enter 1, 2, or 3: ");
        }
    }

    private static double getTemperature(Scanner scanner, String unit) {
        while (true) {
            System.out.print("Enter temperature in " + unit + ": ");
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    private static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    private static void printConversionResult(double input, String inputUnit, double output, String outputUnit) {
        System.out.println("\nConversion Results:");
        System.out.printf("%s: %.2f\n", inputUnit, input);
        System.out.printf("%s: %.2f\n", outputUnit, output);
    }
}