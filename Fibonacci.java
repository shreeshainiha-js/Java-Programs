import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second; //Add previous(first) and next(second) number
            first = second;
            second = next;
        }
    }
}

/* Output
Enter the number of terms: 4
Fibonacci Series:
0 1 1 2
*/
