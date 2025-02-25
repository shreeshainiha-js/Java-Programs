import java.util.Scanner;
public class MiddleDigit {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a 4-digit number: ");
		        int number = scanner.nextInt();
		        int secondDigit = (number / 100) % 10;  // Extracts the second digit
		        int thirdDigit = (number / 10) % 10;    // Extracts the third digit
		        System.out.println("Middle Digits: " + secondDigit + "" + thirdDigit);

		        scanner.close();
		    }

	}

/* 
Enter a 4-digit number: 1234
Middle Digits: 23
*/
