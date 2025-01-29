import java.util.Scanner;
public class Palindrome1 {
	public static void main(String[] args) {
	      String original, reverse = "";   
	      Scanner in = new Scanner(System.in);     
	      System.out.println("Enter a string/number to check if it is a palindrome");    
	      original = in.nextLine();     
	      int length = original.length(); // get the length of original input string. 
   
	      for ( int i = length - 1; i >= 0; i-- )    
	         reverse = reverse + original.charAt(i); //append from the last character of string to reverse.   
	      if (original.equals(reverse))   // check if original and reversed strings are equal. 
	         System.out.println("Entered string/number is a palindrome.");    
	      else    
	         System.out.println("Entered string/number isn't a palindrome.");

	}

}


/* Output


Enter a string/number to check if it is a palindrome
malayalam
Entered string/number is a palindrome.

Enter a string/number to check if it is a palindrome
shine
Entered string/number isn't a palindrome.

*/