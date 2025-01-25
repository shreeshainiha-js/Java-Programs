public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this for a different input
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}


/* Output
Factorial of 5 is 120 */
    
