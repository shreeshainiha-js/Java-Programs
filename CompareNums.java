import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nComparison Results:");
        System.out.println(num1 + " > " + num2 + " is " + (num1 > num2));
        System.out.println(num1 + " >= " + num2 + " is " + (num1 >= num2));
        System.out.println(num1 + " < " + num2 + " is " + (num1 < num2));
        System.out.println(num1 + " <= " + num2 + " is " + (num1 <= num2));
        System.out.println(num1 + " == " + num2 + " is " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " is " + (num1 != num2));
        scanner.close();
    }
}

/* Output
Enter the first number: 23
Enter the second number: 34

Comparison Results:
23.0 > 34.0 is false
23.0 >= 34.0 is false
23.0 < 34.0 is true
23.0 <= 34.0 is true
23.0 == 34.0 is false
23.0 != 34.0 is true
*/
