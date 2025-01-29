
public class Primeex1 {

	public static void main(String[] args) {
		int n,i,count=0;
		n=18;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				count++; //increment the count value for each factor.
		}
		if(count==2) //check if the number of factors is only 2.
			System.out.println("Its a prime number.");
		else
			System.out.println("Not a prime.");
		

	}

}



/* Output
Not a prime.
*/