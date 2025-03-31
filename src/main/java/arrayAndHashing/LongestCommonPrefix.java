package arrayAndHashing;

public class LongestCommonPrefix {
	
	
	
	public static String longestCommonPrefix1(String[] strs) {
		
		
		if(strs.length == 0)
			return "";
		
		//Set Prefix as the first string
		String prefix = strs[0];
		
		
		for(int i = 1 ; i< strs.length ; i++) {
			
			//If the prefix is not present in the string , then remove the last character from the prefix
			while(strs[i].indexOf(prefix) != 0) {
				
//				System.out.println(strs[i].indexOf(prefix));
				
				prefix = prefix.substring(0, prefix.length() - 1);
				
				System.out.println(prefix);
				
				if(prefix.isEmpty())
					return "";
			}
		}
		
		return prefix;
	}
}
