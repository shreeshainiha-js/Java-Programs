
public class PrimeEx2 {

	public static boolean isPrime(int num)
	{
	if(num<2) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(num);i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
	}

	public static void main(String[] args) {
		int number=17;
		if(isPrime(number)) //check by function
		{
			System.out.println(number + " is a prime number.");
		}
		else {
			System.out.println(number + " is not a prime number");
		}

	}

}


/* Output
17 is a prime number.
*/
