import java.util.Scanner;
public class TwoTriangles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=sc.nextInt();
    //for inverted triangle 
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
    //for straight triangle
		for(int i=2;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}


/* Output

Enter the number of rows:
5
12345
1234
123
12
1
12
123
1234
12345

*/
