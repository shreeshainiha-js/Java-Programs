
public class lcm {

	public static void main(String[] args) {
		int a=2;
		int b=15;
		int ans= Math.max(a,b);// to get max number from the given two numbers
		while(true)
		{
			if(ans%a==0 && ans%b==0) //check remainders of zero with max value
				break;
				ans++; //increment if factors available
			
		}
		System.out.println(ans);

	}

}

//Output:- 30

