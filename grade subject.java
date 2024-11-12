import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade for subject 1: ");
        double grade1 = scanner.nextDouble();
        System.out.print("Enter grade for subject 2: ");
        double grade2 = scanner.nextDouble();
        System.out.print("Enter grade for subject 3: ");
        double grade3 = scanner.nextDouble();

        double average = calculateAverage(grade1, grade2, grade3);

        if (average >= 85) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        scanner.close();
    }

    public static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }
}
