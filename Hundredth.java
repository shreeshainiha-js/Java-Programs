import java.util.Scanner;
public class Digit {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a 3-digit number: ");
		        int number = scanner.nextInt();

		        // Extracting the unit digit 
		        int unitDigit = number % 10;

		        // Extracting the hundredth digit 
		        int hundredthDigit = number / 100;

		        System.out.println("Hundredth Digit: " + hundredthDigit);
		        System.out.println("Unit Digit: " + unitDigit);

		        scanner.close();
		    }
	}

/*
Enter a 3-digit number: 123
Hundredth Digit: 1
Unit Digit: 3
*/

