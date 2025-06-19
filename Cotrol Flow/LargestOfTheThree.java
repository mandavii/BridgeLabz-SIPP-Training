package ControlFlow;

import java.util.Scanner;

public class LargestOfTheThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		input.close();
		
		boolean is1largest = (num1>=num2) && (num1 >=num3);
		System.out.println("Is the 1st number the largest?" + is1largest);
		
		boolean is2largest = (num2>=num3 && num2 >= num1 );
		System.out.println("Is the 2nd number the largest?" + is2largest);
		
		boolean is3largest =(num3>=num2 && num3>=num1);
		System.out.println("Is the 3rd number the largest?" + is3largest);
	

	}

}
