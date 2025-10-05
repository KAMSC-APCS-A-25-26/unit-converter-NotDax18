import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println();
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice (1, 2, or 3): ");
            String choiceStr = scanner.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
                continue;
            }

            switch (choice) {
                case 1:
                    Double fahrenheit = promptForTemperature(scanner, "Fahrenheit");
                    if (fahrenheit == null) continue;
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("\nConversion Results:\nFahrenheit: %.2f\nCelsius: %.2f\n", fahrenheit, celsius);
                    break;
                case 2:
                    Double celsiusInput = promptForTemperature(scanner, "Celsius");
                    if (celsiusInput == null) continue;
                    double fahrenheitResult = celsiusInput * 9 / 5 + 32;
                    System.out.printf("\nConversion Results:\nCelsius: %.2f\nFahrenheit: %.2f\n", celsiusInput, fahrenheitResult);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        scanner.close();
    }

    private static Double promptForTemperature(Scanner scanner, String scale) {
        System.out.print("Enter temperature in " + scale + ": ");
        String tempStr = scanner.nextLine().trim();
        try {
            return Double.parseDouble(tempStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature input. Please enter a valid number.");
            return null;
        }
    }
}