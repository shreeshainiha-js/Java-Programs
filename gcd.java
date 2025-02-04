
public class gcd {
	public static int GCD(int x,int y) {
		int res=Math.min(x, y);
		for(int i=res;i>1;i--)//iterate from the min element.
			{
			if(x%i==0 && y%i==0) //check if 'i' divides both numbers.
				return i;
			}
		return 1;
			}

	public static void main(String[] args) {
		int a=30,b=20;
		int ans=GCD(a,b);// call the function.
		System.out.println(ans);
		

	}

}


// Output:- 10
