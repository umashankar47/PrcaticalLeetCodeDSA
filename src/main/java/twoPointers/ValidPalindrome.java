package twoPointers;


public class ValidPalindrome {
	
	
	
	public static void main(String[] args) {	
		
		
		String s1="A man, a plan, a canal: Panama";
		
		System.out.println(isPalindromeV2(s1));	
		
		
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
	
	public static boolean isPalindromeV2(String s1) {	
		
		
		if(s1.isEmpty())
			return false;
        
        s1 = s1.toLowerCase();
        
        int i =0 ;
        int j = s1.length()-1;	
        
		while(i < j){
			
			System.out.println("i : "+s1.charAt(i)+" j : "+s1.charAt(j));		
			
			while(!Character.isLetterOrDigit(s1.charAt(i))) {
				
				
				System.out.println("Skipped i"+s1.charAt(i));	
				i++;
				
			}
				
            
            while(!Character.isLetterOrDigit(s1.charAt(j))) {
            	
            	
            	System.out.println("Skipped j "+s1.charAt(j));
            	j--;
            }
            
            
            
            
			
			if(s1.charAt(i) != s1.charAt(j)) {
				
				System.out.println("Not Palindrome i=" + s1.charAt(i) +" j="+ s1.charAt(j)  );	
				return false;
				
				
			}
				
			
			i++;
			j--;
			
			
		}
		
		
		
		return true;
	}
	
	
}
