package CoreJavaMethods;

import java.util.Scanner;
public class SumOfnNaturalNumber {

	public static int SumOfNaturalNumber(int n) {
		int sum = 0;
		for(int i = 0; i <=n; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter digit");
		
		int n = input.nextInt();
		
		if(n<=0) {
			System.out.println("enter positive nember");
		}
		else {
			int TotalSum = SumOfNaturalNumber(n);
			
			System.out.println("Final answer" + TotalSum);
		}
		input.close();


	}

}
