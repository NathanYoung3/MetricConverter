import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validValue = false;
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;

        do {
            System.out.println("Enter meter measurement:");
            if (scan.hasNextDouble()) {
                meters = scan.nextDouble();
                if (meters > 0) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again.");
                }

            }else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!validValue);

        miles = meters * METERS_TO_MILES;
        feet = meters * METERS_TO_FEET;
        inches = meters * METERS_TO_INCHES;

        System.out.printf("%-10s %10.2f", "Meters:", meters);
        System.out.printf("\n%-10s %10.2f", "Miles:", miles);
        System.out.printf("\n%-10s %10.2f", "Feet:", feet);
        System.out.printf("\n%-10s %10.2f", "Inches:", inches);
    }
}