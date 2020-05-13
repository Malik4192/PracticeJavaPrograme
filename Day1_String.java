package javaClass;

public class Day1_String {

public static void main(String[] args) {
		
		String text = "you have no choice other than following me!";
		
		int count = 0;
		
		for(int i=0; i < text.length(); i++) {
			
			if(text.charAt(i)=='o') {
				count = count +1;				
			}	
		}
		
		System.out.println(count);
	}
	
}
