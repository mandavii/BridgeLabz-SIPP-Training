package CoreJavaMethods;

import java.util.Scanner;

public class MaxHandshakes {

	public static int NumberOfHanshakes(int numberOfStudent) {
		
		if(numberOfStudent <=1) {
			return 0;
		}
		int handshakes = (numberOfStudent*(numberOfStudent-1))/2;
		
		return handshakes;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int numberOfStudent = input.nextInt();
		
		if(numberOfStudent <0) {
			System.out.println("be real for this!!");
		}
		else {
			int MaxHandshakes = NumberOfHanshakes(numberOfStudent);
			
			System.out.println("total Handshakes "+MaxHandshakes);
		}
		
		input.close();

	}

}
