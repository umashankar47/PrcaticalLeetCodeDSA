package arrayAndHashing;

import java.util.Arrays;

public class validAnagram {
	
	
	
	public static boolean isAnagram1(String str1, String str2) {
		
		
		//Using Character Stream API to sort and compare
		  
		return Arrays.equals(
				
				str1.chars().sorted().toArray(),str2.chars().sorted().toArray()
				
				
				
				);
	
		
		
	}
	
	public static boolean isAnagram2(String s, String t) {
		
		
		
		//Just Using Array
		
		if(s.length() != t.length())
			return false;
		
		int[] arr = new int[26];
		
		for(int i = 0 ; i< s.length() ; i++) {
			
			
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
			
			
		}
		
		for(int x: arr)
			if(x != 0)
				return false;
		
		return true;
	}

}
