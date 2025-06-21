package CoreJavaMethods;


import java.util.Scanner;
public class PositiveNegativeOrZero {

	public static int IntegerValue(int n) {
		if(n>0) {
			return 1;
		}
		else if (n<0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Value");
		
		int userInput = input.nextInt();
		
		int result = IntegerValue(userInput);
		
		if(result == 1) {
			System.out.println("very positive");
		}
		else if (result == -1) {
			System.out.println("Why so Negative?");
		}
		else {
			System.out.println("Very Neutral");
		}
		
		input.close();
	}
	

}
