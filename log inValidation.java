import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String correctUsername = "sean";
        String correctPassword = "1234";
        
        String inputUsername, inputPassword;
        
        while (true) {
            System.out.print("Enter username: ");
            inputUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            inputPassword = scanner.nextLine();
            
            if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; 
            } else {
                System.out.println("Incorrect username or password. Please try again.");
            }
        }        
        scanner.close();
    }
}