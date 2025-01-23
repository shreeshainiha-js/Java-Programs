import java.util.Scanner;
public class AgeCalculator {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your birth year:");

  int birthYear = input.nextInt();
  int age = 2025 - birthYear;//subtract birth year from current year
  System.out.println("You are " + age + " years old.");
 }
}
