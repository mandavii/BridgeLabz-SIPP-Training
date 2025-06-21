package CoreJavaStrings;


import java.util.*;
public class NullPointerExceptionTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		handleException();

	}
	public static void generateException() {
		System.out.println("Generate Exception..");
		String str = null;
		System.out.println("len of text" + str.length());
	}
	public static void handleException() {
		String str = null;
		try {
			System.out.println("Trying to access");
			int len = str.length();
			System.out.println("lenght of input" + len);
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException Occured"+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Runtime Exception Occured" + e.getLocalizedMessage());
		}
	}

}
