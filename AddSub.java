import java.util.Scanner;

public class AddSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int addResult = num1 + num2;
        int absoluteAdd = Math.abs(addResult); //using abs to convert negative results into positive values
        int subResult = num1 - num2;
        int absoluteSub = Math.abs(subResult);

        System.out.println("Addition of 2 values: " + num1 + " + " + num2 + " = " + absoluteAdd);
        System.out.println("Subtraction of 2 values: " + num1 + " - " + num2 + " = " + absoluteSub);

        scanner.close();
    }
}


/* Output

Enter the first number: 23
Enter the second number: 34
Addition of 2 values: 23 + 34 = 57
Subtraction of 2 values: 23 - 34 = 11

Enter the first number: -90
Enter the second number: -5
Addition of 2 values: -90 + -5 = 95
Subtraction of 2 values: -90 - -5 = 85
*/

