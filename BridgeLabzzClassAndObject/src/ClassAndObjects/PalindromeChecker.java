package ClassAndObjects;

import java.util.Scanner;

class Palindrome {
	private String text;
	
	public Palindrome (String text) {
		this.text = text;
	}
	
	public boolean isPalindrome() {
		
		
		String cleanedText = text.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		if(cleanedText.length() <=1) {
			return true;
		}
		
		
		int left  = 0;
		int right = cleanedText.length()-1;
		
		
		while (left < right) {
			if(cleanedText.charAt(left) != cleanedText.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public void displayResult() {
		System.out.println("original text- ttt" + text);
		if(isPalindrome()) {
			System.out.println("is Plaindorme");
		} else {
			System.out.println("is not");
		}
	}
}

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		String userInput = sc.nextLine();
		Palindrome check = new Palindrome(userInput);
		check.displayResult();
		sc.close();
		
	}
}
