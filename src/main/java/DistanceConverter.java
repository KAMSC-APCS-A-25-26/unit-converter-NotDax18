import java.util.Scanner;


public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        while (menu) {


            System.out.println("Choose conversion direction:");
            System.out.println("1. Miles to Kilometers:");
            System.out.println("2. Kilometers to Miles:");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your distance in miles: ");
                    double miles = scan.nextDouble();
                    double kilometers = miles * 1.60935;
                    if (miles <= 0)
                {
                    System.out.println("Invalid distance input, put values greater than 0");
                }
                else {
                        System.out.println("Conversion results: ");
                        System.out.println("Miles:" + miles);
                        System.out.println("Kilometers:" + kilometers);
                    }
                break;
                case 2:
                    System.out.print("Enter your distance in kilometers: ");
                    double kilos = scan.nextDouble();
                    double mile = kilos / 1.60935;
                    if (kilos <= 0)
                {
                    System.out.println("Invalid distance input, put values greater than 0");
                }
                else {
                        System.out.println("Conversion results: ");
                        System.out.println("Kilometers:" + kilos);
                        System.out.println("Miles:" + mile);
                    }
                    break;
                case 3:
                    menu = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
                    // Requirements:
                    // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
                    // - Loop until user chooses to exit
                    // - Use conversion factor: 1 mile = 1.60935 kilometers
                    // - Display conversion results
            }
        }// - Handle invalid menu choices
    }
}