import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.println("Convert to: \n1. Fahrenheit \n2. Celsius");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double fahrenheit = (temperature * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            double celsius = (temperature - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}

/* Output 
Temperature Converter
Enter temperature: 12
Convert to:
1. Fahrenheit
2. Celsius
1
Temperature in Fahrenheit: 53.6

Temperature Converter
Enter temperature: 133
Convert to:
1. Fahrenheit
2. Celsius
2
Temperature in Celsius: 56.111111111111114 */
