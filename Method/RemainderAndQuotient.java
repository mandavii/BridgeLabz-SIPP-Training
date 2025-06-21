package CoreJavaMethods;

import java.util.Scanner;
import java.util.InputMismatchException;
public class RemainderAndQuotient {

	public static int[] RemainderAndQuotient(int number, int divisor) {
		if (divisor==0) {
			System.out.println("error 404");
		}
		int[] result = new int[2];
		result[0]= number/divisor;
		result[1] = number % divisor;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter dividend");
			int number = input.nextInt();
			System.out.println("Enter divison");
			int divisor = input.nextInt();
			
			int[] result = 	RemainderAndQuotient(number, divisor);
			
			if(result != null) {
				System.out.println("Quotient" + result[0]);
				System.out.println("Remainder"+ result[1]);
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid");
		}
		finally {
			input.close();
		}

	}

}
