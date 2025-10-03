import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        while (menu)
        {
        System.out.println("Convert time to total seconds");
        System.out.println("\n");
        System.out.println("Enter hours:");
        int hours = scan.nextInt();
            System.out.println("Enter minutes:");
            int minutes = scan.nextInt();
            System.out.println("Enter seconds:");
            int seconds = scan.nextInt();
            System.out.println("Time Conversion:");
            System.out.println(hours+" hour,"+minutes+" minute, and "+seconds+" second");
            int totseconds = hours * 3600 + minutes * 60 + seconds;
            int a = hours * 3600;
            int b = minutes * 60;
            int c = seconds;
            System.out.println("Total seconds:" + totseconds);
            System.out.println("Calculation:");
            System.out.println(hours + "  x 3600 = "+a + "seconds");
            System.out.println(minutes + "  x 60 = "+b + "seconds");
            System.out.println(seconds + "seconds = "+c + "seconds");
            System.out.println("Total: " + totseconds + "seconds");
            System.out.print("Do you want to convert another time? y/n: ");
            String s = scan.next();
            if (s == "n")
                menu = false;
        }
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
    }
}