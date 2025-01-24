import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Menu:");
        System.out.println("1. Coffee - $3.00");
        System.out.println("2. Tea - $2.50");
        System.out.println("3. Sandwich - $5.00");

        System.out.print("\nEnter the quantity of Coffee: ");
        int coffeeQty = scanner.nextInt();

        System.out.print("Enter the quantity of Tea: ");
        int teaQty = scanner.nextInt();

        System.out.print("Enter the quantity of Sandwiches: ");
        int sandwichQty = scanner.nextInt();
        //set cost values for menu items
        double coffeePrice = 3.00;
        double teaPrice = 2.50;
        double sandwichPrice = 5.00;
        double totalCost = (coffeeQty * coffeePrice) + (teaQty * teaPrice) + (sandwichQty * sandwichPrice); //Calculate the total by the sum of multiplication of quantity with price alloted
        System.out.printf("\nYour total is: $%.2f\n", totalCost);
        System.out.println("Thank you for visiting the Coffee Shop!");

        scanner.close();
    }
}

//Output:

//Welcome to the Coffee Shop!
//Menu:
//1. Coffee - $3.00
//2. Tea - $2.50
//3. Sandwich - $5.00//

//Enter the quantity of Coffee: 2
//Enter the quantity of Tea: 1
//Enter the quantity of Sandwiches: 1//

//Your total is: $13.50
//Thank you for visiting the Coffee Shop!
//
