import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //check if the year module 4 and 400(for century) gives zero as leap year occur once in 4 years.
	{
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
	scanner.close();
    }
}


/* Output

Enter a year: 2005
2005 is not a leap year.
Enter a year: 2012
2012 is a leap year.

*/
