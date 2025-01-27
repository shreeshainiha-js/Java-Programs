import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
	    // Check if the positive number is even or odd.
              if (number % 2 == 0) {
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
        } else if (number < 0) {
            System.out.println("The number is negative.");

            // Check if the negative number is even or odd
            if (number % 2 == 0) {
                System.out.println("It is an even number.");
            } else {
                System.out.println("It is an odd number.");
            }
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}



/* Output

Enter a number: 34
The number is positive.
It is an even number.

Enter a number: -11
The number is negative.
It is an odd number.

*/
