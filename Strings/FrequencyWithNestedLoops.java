import java.util.Scanner;

public class FrequencyWithNestedLoops {

    public static String[] getCharacterFrequencies(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            freq[i] = 1;
            
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; 
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " => " + freq[i];
            }
        }

        return result;
    }

    public static void displayFrequencies(String[] data) {
        System.out.println("Character Frequencies:");
        for (String entry : data) {
            System.out.println(entry);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = getCharacterFrequencies(input);
        displayFrequencies(frequencies);
    }
}
