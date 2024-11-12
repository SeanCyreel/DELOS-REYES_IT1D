import java.util.Scanner;

public class CovidSymptomChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String checkAgain;

        do {
            
            System.out.println("Do you have a fever?");
            boolean hasFever = scanner.nextLine().equalsIgnoreCase("Yes");

            System.out.println("Do you have a cough?");
            boolean hasCough = scanner.nextLine().equalsIgnoreCase("Yes");

            System.out.println("Do you have difficulty in breathing?");
            boolean hasDifficultyBreathing = scanner.nextLine().equalsIgnoreCase("Yes");

            
            if (!hasFever && !hasCough && !hasDifficultyBreathing) {
                System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
            } else {
                System.out.println("You may have COVID-19 symptoms. Please consult a healthcare professional.");
            }

           
            System.out.println("Do you want to check symptoms again? (Yes or No)");
            checkAgain = scanner.nextLine();
            
        } while (checkAgain.equalsIgnoreCase("Yes"));

        scanner.close();
    }
}