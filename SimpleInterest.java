import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;//calculate by formula of simple interest

        System.out.println("The simple interest is: " + interest);
        System.out.println("The total amount is: " + (principal + interest));//add principal and interest to calculate total amount
    }
}

/* Output

Enter the principal amount: 12000
Enter the annual interest rate (in %): 4
Enter the time (in years): 3
The simple interest is: 1440.0
The total amount is: 13440.0

*/
