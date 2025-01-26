import java.util.Scanner;
class Message{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if(num%4==0 && num%3!=0)
			System.out.println("Good afternoon");
		else if(num%3==0 && num%4!=0)
			System.out.println("Good evening");
		else
			System.out.println("Good morning");
	}
}
