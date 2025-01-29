import java.util.Scanner;
public class Palindrome2 {

	public static void main(String[] args) {
		String original,reverse="";
		Scanner in=new Scanner(System.in);
		System.out.println("enter a input:");
		original=in.nextLine();
		StringBuilder sb=new StringBuilder(original); //use string builder to modify the input string as string is immutable in java by default.
		String reversee =sb.reverse().toString(); //use reverse() method to reverse the input string.
		if(original.equals(reversee)) // check if original and reversed strings are equal.
			System.out.println("Palindrome.");
		else
			System.out.println("Not palindrome.");

	}

}


/* Output

enter a input:
mom
Palindrome.

enter a input:
string
Not palindrome.

*/