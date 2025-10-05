import java.util.Scanner;

public class DistanceConverter {
    private static final double MILE_TO_KM = 1.60935;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getMenuChoice(scanner);

            switch (choice) {
                case 1:
                    double miles = getDistance(scanner, "miles");
                    double kilometers = milesToKilometers(miles);
                    printConversionResult(miles, "Miles", kilometers, "Kilometers");
                    break;
                case 2:
                    double kms = getDistance(scanner, "kilometers");
                    double mils = kilometersToMiles(kms);
                    printConversionResult(kms, "Kilometers", mils, "Miles");
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
        System.out.println("1. Convert Miles to Kilometers");
        System.out.println("2. Convert Kilometers to Miles");
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

    private static double getDistance(Scanner scanner, String unit) {
        while (true) {
            System.out.print("Enter distance in " + unit + ": ");
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Distance cannot be negative. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }

    private static double milesToKilometers(double miles) {
        return miles * MILE_TO_KM;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers / MILE_TO_KM;
    }

    private static void printConversionResult(double input, String inputUnit, double output, String outputUnit) {
        System.out.println("\nConversion Results:");
        System.out.printf("%s: %.5f\n", inputUnit, input);
        System.out.printf("%s: %.5f\n", outputUnit, output);
    }
}