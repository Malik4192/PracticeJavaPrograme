package javaClass;

public class Day1_Palindrome {


	public static void main(String[] args) {
		
		String text = "malayalam";

		String revtex = "";
		
		for (int i = text.length()-1; i >=0; i--) {		
			revtex += text.charAt(i);
		}

		
		if(text.equals(revtex)) {
			System.out.println("Yes, Palindrome");
		}else {
			System.out.println("No, Not Palindrome");
		}
		
	}
	
}
