import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater.");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is greater.");
        } else {
            System.out.println("both numbers are equal.");
        }        
        scanner.close();
    }
}