package arrayAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {


		
		public static List<List<String>> groupAnagram(String[] strs){
			
			HashMap< String ,List<String>> hm = new HashMap<>();
			
			
			
			for(String str : strs) {
				
				int[] sig  = new int[26];
		
				for(char c : str.toCharArray()) 
					sig[c - 'a']++;
		
				
//				Arrays.stream(sig).forEach(System.out::print);
//				System.out.println();
				
				
				hm.putIfAbsent(Arrays.toString(sig),new ArrayList<>());
					
				hm.get(Arrays.toString(sig)).add(str);		
				
			}
				
			return new ArrayList<>(hm.values());
			
		}
}
