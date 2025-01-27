import java.util.Scanner;

 class DivisibleBy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) //The modulus of number by 3 and 5 should return zero. 
	{
            System.out.println(number + " is divisible by both 3 and 5.");
        } else if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3 only.");
        } else if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5 only.");
        } else {
            System.out.println(number + " is not divisible by 3 or 5.");
        }

        scanner.close();
    }
}


/* Output

Enter a number: 23
23 is not divisible by 3 or 5.
*/
