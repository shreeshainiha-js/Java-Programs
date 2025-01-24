import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 5000.00; 
        int choice;

        System.out.println("Welcome to the ATM!");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f\n", balance);//print current balance amount
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;//add deposited amount with current bank balance
                    System.out.printf("You have deposited $%.2f. New balance: $%.2f\n", deposit, balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > balance)//check if the amount to be withdrawn exceeds the balance
                    {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;//deduct the withdrawn amount from balance
                        System.out.printf("You have withdrawn $%.2f. New balance: $%.2f\n", withdraw, balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
}

/* Output:
Welcome to the ATM!

Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 1
Your current balance is: 5000.00

Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 2
Enter amount to deposit:
200
You have deposited 200.00. New balance: 5200.00

Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 3
Enter amount to withdraw: 200
You have withdrawn 200.00. New balance: 5000.00

Menu:
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Choose an option: 4
Thank you for using the ATM. Goodbye! */
