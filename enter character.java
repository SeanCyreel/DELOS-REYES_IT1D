import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter character: ");
        char input = scanner.next().charAt(0);

        if ((input>='a'&&input<='z')||(input>='A'&& input<='Z')){
            System.out.println(input + " is a letter.");
        }else if ((input>='0'&&input<='9'))   {
            System.out.println(input + " is a digit.");
        }else{
        	System.out.print(input+ "is not a number or letter");
        }

        scanner.close();
    }
}
