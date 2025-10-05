import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices

        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        double temp = 0.0;

        while (menu)
        {
            System.out.println("Choose conversion direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice (1, 2, or 3):  ");
            int choice = sc.nextInt();

            switch (choice)
            {
                default:
                {
                    System.out.println("Error");
                    break;
                }
                case 1:
                    System.out.print("\nEnter temperature in Fahrenheit: ");
                    temp = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Fahrenheit: " + temp);
                    temp = (temp - 32) * (5.0 / 9.0);
                    System.out.println("Celsius: " + temp + "\n\n");
                    break;
                case 2:
                    System.out.print("\nEnter temperature in Celsius: ");
                    temp = sc.nextDouble();
                    System.out.println("\nConversion Results:");
                    System.out.println("Celsius: " + temp);
                    temp = temp * (9.0 / 5.0) + 32;
                    System.out.println("Fahrenheit: " + temp + "\n\n");
                    break;
                case 3:
                {
                    System.out.println("Goodbye!");
                    menu = false;
                    break;
                }
            }
        }
    }
}
