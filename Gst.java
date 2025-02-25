import java.util.Scanner;

class GSTCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original amount: ");
        double originalAmount = scanner.nextDouble();

        System.out.print("Enter the GST percentage: ");
        double gstPercentage = scanner.nextDouble();

        double sgst = (originalAmount * gstPercentage) / 200;
        double cgst = sgst; // SGST and CGST are equal

        // Calculating total amount
        double totalAmount = originalAmount + sgst + cgst;

        System.out.println("Original Amount: " + originalAmount);
        System.out.println("SGST: " + sgst);
        System.out.println("CGST: " + cgst);
        System.out.println("Total Amount (including GST): " + totalAmount);

        scanner.close();
    }
}

/*
Enter the original amount: 12000
Enter the GST percentage: 90
Original Amount: 12000.0
SGST: 5400.0
CGST: 5400.0
Total Amount (including GST): 22800.0
*/
