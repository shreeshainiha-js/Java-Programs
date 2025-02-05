
public class Wrwp {

	//With return and with parameter
	static int display(int x,int y) {
		int res=x+y;
		return res;
	}
	
	public static void main(String[] args) {
		int a=180;
		int b=90;
		int ans=display(a,b);//call the function
		System.out.println(ans);	

	}

}


//Output: 270
