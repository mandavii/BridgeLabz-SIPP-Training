package CoreJavaMethods;

import java.util.Scanner;

public class SmallestAndLargestOf3 {

	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int smallest;
		int largest;
		
		smallest = Math.min(number1, Math.min(number2, number3));
		
		largest = Math.max(number1, Math.max(number2, number3));
		
		int[] result = {smallest, largest};
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("1st number");
		int num1 = input.nextInt();
		System.out.println("2nd number");
		int num2 = input.nextInt();
		System.out.println("13rd number");
		int num3 = input.nextInt();
		
		
		int[] FinalResult = findSmallestAndLargest(num1, num2, num3);
		
		System.out.println("smallest" + FinalResult[0] + "largest" + FinalResult[1]);
		
		input.close();

	}

}
