import java.util.Scanner;
public class HalfDiamond {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=in.nextInt();
		//upper half
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//break after each iteration to start new iteration in next line.
			}
		//lower half
		for(int i=rows-1;i>=1;i--)//inverted form- from the last range
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();//break after each iteration to start new iteration in next line.
		}

	}

}

/* Output

Enter the number of rows:
5
*
**
***
****
*****
****
***
**
*

*/

