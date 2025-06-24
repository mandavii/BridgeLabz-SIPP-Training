import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateNumberFormatException(String text) {
        System.out.println("\nGenerating NumberFormatException...");
        
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    public static void handleNumberFormatException(String text) {
        System.out.println("\nHandling NumberFormatException safely...");
        
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a number (as text): ");
        String input = sc.nextLine();

        handleNumberFormatException(input);
    }
}
