
public class InvTriangle {
public static void main(String [] args){
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++) //decrement the number of stars to print inverted pattern
			// for(int j=0;j<i+1;j++
			{
				System.out.print("*");
			}
			System.out.println();
	}
	}}



/* Output

******
*****
****
***
**
*


*/


