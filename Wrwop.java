import java.util.Scanner;
public class Wrwop {
	//With return and without parameter
	static int display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=sc.nextInt();
		System.out.println("Enter the second number:");
		int y=sc.nextInt();
		int res=x+y;
		System.out.println("The addition is:" +res);
		sc.close();
		return 1;
	}

	public static void main(String[] args) {
		display();//call the function
		

	}

}

/* Output
Enter the first number:
12
Enter the second number:
23
The addition is:35
*/
