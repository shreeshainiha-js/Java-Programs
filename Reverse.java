public class ReverseString{
	public static void main(String [] args)
	{
	String input="Hello";
	String reversed=reverseString(input);
	System.out.println("Reversed string:" + reversed);
	}
	public static String reverseString(String str)
	{
		String reversed="";
		for(int i=str.length()-1;i>=0;i--){
			reversed+=str.charAt(i); //append char each at end.
		}
	return reversed;
	}
}