import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println("\nGenerating StringIndexOutOfBoundsException...");
       
        char ch = text.charAt(text.length()); 
        System.out.println("Character at invalid index: " + ch);
    }
    public static void handleStringIndexOutOfBounds(String text) {
        System.out.println("\nHandling StringIndexOutOfBoundsException safely...");

        try {
            
            char ch = text.charAt(text.length()); 
            System.out.println("Character at invalid index: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        
        handleStringIndexOutOfBounds(userInput);
    }
}

