import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 
     Scanner scanner = new Scanner(System.in);
    
System.out.print("weight in kilograms: ");
        double weight = scanner.nextDouble();
      
 System.out.print("height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI Result:" + bmi);

        if (bmi < 18.5) {
  System.out.println("underweight.");
        } else if (bmi >= 18.5 && bmi < 25.0) {
 System.out.println("normal weight.");
        } else if (bmi >= 25.0 && bmi < 30.0) {
 System.out.println(" overweight.");
        } else {
         System.out.println("obese.");
        }
  
        scanner.close();
    }
}