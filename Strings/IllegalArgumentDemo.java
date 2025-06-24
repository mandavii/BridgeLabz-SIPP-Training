import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateIllegalArgument(String text) {
        System.out.println("\nGenerating IllegalArgumentException...");

        String sub = text.substring(5, 3);  
        System.out.println("Substring: " + sub);
    }

    public static void handleIllegalArgument(String text) {
        System.out.println("\nHandling IllegalArgumentException safely...");

        try {
            String sub = text.substring(5, 3);  
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        handleIllegalArgument(input);
    }
}
