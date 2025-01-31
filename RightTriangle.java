
public class RightTriangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)//rows
		{
			for(int j=0;j<=i;j++)//columns (if row=3,then col=3)
			// for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}


/* Output

*
**
***
****
*****

*/