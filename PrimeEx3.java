
public class PrimeEx3 {

	public static boolean Prime2(int j) {
		for(int k=2;k*k<=j;k++) {
			if(j%k==0) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n=5;
		int num=2;
		int count=0; //initialize position.
		while(num<n) {
			if(Prime2(num))
				count++; 
			if(count==n);
				System.out.println(num+" is in position:" + count);
				num++;
		}

	}

}


