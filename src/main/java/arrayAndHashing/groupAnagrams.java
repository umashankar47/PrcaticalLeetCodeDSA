package arrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {


		
		public static List<List<String>> groupAnagram(String[] strs){
			
			HashMap< String ,List<String>> hm = new HashMap<>();
			
			
			
			for(String str : strs) {
				
				//Create a signature , Which will remain same for anagrams (refer to validAnagram.java)
				int[] sig  = new int[26];
		
				for(char c : str.toCharArray()) 
					sig[c - 'a']++;
				
				
		
				
//				Arrays.stream(sig).forEach(System.out::print);
//				System.out.println();
				
				//If the signature is not present in the hashmap , then add it
				
				hm.putIfAbsent(Arrays.toString(sig),new ArrayList<>());
					
				
				hm.get(Arrays.toString(sig)).add(str);		
				
			}
				
			return new ArrayList<>(hm.values());
			
		}
}
