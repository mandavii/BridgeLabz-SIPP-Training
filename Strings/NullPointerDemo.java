public class NullPointerDemo {

    public static void generateNullPointer() {
        String text = null;
        System.out.println("Generating NullPointerException...");
       
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointer() {
        String text = null;
        System.out.println("\nHandling NullPointerException safely...");

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        handleNullPointer();
    }
}
