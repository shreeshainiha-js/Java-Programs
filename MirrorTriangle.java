import java.util.Scanner;
public class MirrorTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)//rows
		{
			for(int j=i;j<rows;j++) //align stars spaces on right
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)//print stars
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--) {
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
			System.out.print("* ");
			}
			System.out.println();
			}
		sc.close();
	}

}

/* Output

enter the number of rows:
4
   * 
  * * 
 * * * 
* * * * 
 * * * 
  * * 
   * 

*/
