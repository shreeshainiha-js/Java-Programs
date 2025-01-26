import java.util.Scanner;

public class CompareTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        if (number1 > number2) {
            System.out.println("The first number (" + number1 + ") is greater.");
        } else if (number2 > number1) {
            System.out.println("The second number (" + number2 + ") is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}

/* Output
Enter the first number: 12
Enter the second number: 34
The second number (34.0) is greater.
*/
