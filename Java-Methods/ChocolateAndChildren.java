package CoreJavaMethods;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ChocolateAndChildren {

	
	public static int[] distributeChocolates(int totalChoco, int totalKids) {
		if(totalKids==0) {
			System.out.println("error 404");
			return null;
		}
		int[] Result = new int[2];
		
		Result[0] = totalChoco / totalKids;
		Result[1] = totalChoco % totalKids;
		return Result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter chocolate");
			int choco = input.nextInt();
			
			System.out.println("Enter Kids");
			int kids = input.nextInt();
			
			int[] result = distributeChocolates(choco, kids);
			
			if(result != null) {
				System.out.println("Each kids will get" + result[0]);
				
				System.out.println("Remaining" + result[1]);
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Error 404");
		}
		finally {
			input.close();
		}

	}

}
