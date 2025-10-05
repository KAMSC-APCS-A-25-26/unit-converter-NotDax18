import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        while (menu) {


            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius:");
            System.out.println("2. Convert Celsius to Fahrenheit:");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your temp in farenheit: ");
                    double farenheit = scan.nextDouble();
                    double celcius = (5*(farenheit - 32) )/9;
                    System.out.println("Conversion results: ");
                    System.out.println("Farenheit:" + farenheit);
                    System.out.println("Celcius:" + celcius);
                    break;
                case 2:
                    System.out.print("Enter your temp in celcius: ");
                    double cel = scan.nextDouble();
                    double faren = ((cel*9)/5)+32;
                    System.out.println("Conversion results: ");
                    System.out.println("Celcius:" + cel);
                    System.out.println("Farenheit:" + faren);
                    break;
                case 3:
                    menu = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
                // TODO: Implement temperature converter
                // Requirements:
                // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
                // - Loop until user chooses to exit
                // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
                // - Display conversion results
            }
        }    // - Handle invalid menu choices
    }
}