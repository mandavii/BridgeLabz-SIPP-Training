package ControlFlow;

import java.util.Scanner;

public class SmallestOf3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		input.close();
		
		boolean is1smallest = (num1<=num2) && (num1 <=num3);
		System.out.println("Is the 1st number the largest?" + is1smallest);
		
		boolean is2smallest = (num2<=num3 && num2 <= num1 );
		System.out.println("Is the 2nd number the largest?" + is2smallest);
		
		boolean is3smallest =(num3<=num2 && num3<=num1);
		System.out.println("Is the 3rd number the largest?" + is3smallest);
	}

}
