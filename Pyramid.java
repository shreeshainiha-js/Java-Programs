
public class Pyramid {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<=n;i++) // rows
		{
			for(int s=0;s<=n-i-1;s++)// for empty spaces 
		        {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2+1;j++) // for columns
			{
				System.out.print("*");
			}
		System.out.println();
		}

	}

}


/* Output

    *
   ***
  *****
 *******
*********

*/