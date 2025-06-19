package ControlFlow;

import java.util.Scanner;

public class SumOfnNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		Scanner input = new Scanner(System.in);
		n = input.nextLong();
		
		if(n >=0) {
			long sum = (long) n * (n+1) / 2;
			System.out.println("The sum of" + n + "natural numbers is" + sum);
		}
		else {
			System.out.println("The sum of" + n + "is not natural number");
		}
		
		input.close();
	}

}
