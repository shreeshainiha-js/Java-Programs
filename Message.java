import java.util.Scanner;
class Message{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num%4==0 && num%3!=0)//if a number divisible only by 4 but not 3
			System.out.println("Good afternoon");
		else if(num%3==0 && num%4!=0)//if a number divisible only by 3 but not 4
			System.out.println("Good evening");
		else
			System.out.println("Good morning");
	}
}

/* Output
Enter the number:
24
Good morning	
Enter the number:
33
Good evening
Enter the number:
4
Good afternoon
*/
