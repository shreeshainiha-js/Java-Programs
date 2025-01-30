import java.util.Scanner;
class Scanner1{

		public static void main(String[] args) 
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter any integer:");
			int a=s1.nextInt();
			System.out.println("Entered integer:" + a);
			System.out.println("Enter a string:");
			String s=s1.nextLine();
			System.out.println("Entered string:"+s);
			System.out.println("Enter a double value:");
			double d1=s1.nextDouble();
			System.out.println("Entered double value:" + d1);
			System.out.println("Enter a float value:");
			float f1=s1.nextFloat();
			System.out.println("Entered float value:" + f1);
			System.out.println("Enter a character:");
			char c=s1.next().charAt(0);
			System.out.println("Entered character:" + c);
		}
}


/* Output

Enter any integer:
12
Entered integer:12
Enter a string:
shine
Entered string:shine
Enter a double value:
12.3
Entered double value:12.3
Enter a float value:
23.90
Entered float value:23.9
Enter a character:
a
Entered character:a

*/