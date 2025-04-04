package twoPointers;


public class ValidPalindrome {
	
	
	
	public static void main(String[] args) {	
		
		
		String s1="A man, a plan, a canal: Panama";
		
		System.out.println(isPalindrome(s1));	
		
		
	}
	
	
	public static boolean isPalindrome(String s1) {
		
	
		
		if(s1.isEmpty())
			return false;
		
		
		
		StringBuilder str = new StringBuilder();
		
		for(Character c : s1.toCharArray()) {
			
			if(Character.isLetterOrDigit(c))
				str.append(c);
	
			
		}
		
		System.out.println(str.toString());
		
		return str.toString().equalsIgnoreCase(str.reverse().toString());	
		
	
		
	
	}
	
	
	
	
}
