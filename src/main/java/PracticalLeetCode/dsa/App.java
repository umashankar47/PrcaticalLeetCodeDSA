package PracticalLeetCode.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Hello world!
 *
 */





public class App {
	
public static void main( String[] args )
    {
       
    	
    	
    	int[] nums = {1,45,32,43,51,62,71,5,6,6,32};
    	
    
    	
    	arrayAndHashing.LongestCommonPrefix.longestCommonPrefix1(new String[] {"flower","flow","flight"});
    	
    	String s ="uma";
    	String k = new String("uma");
    	
    	System.out.println(s == k);
    	System.out.println(s.equals(k));
    	
    	Map<String , Integer>  hm= new HashMap<>();
    	
    	hm.put("umashankar", 1);
    	
    	hm.put(new String("umashankar"), 2);
    	
    	
    	for(Entry<String, Integer> entry : hm.entrySet()) {
    		
    		System.out.println("entry key : "+entry.getKey() +" entry value : "+entry.getValue());	
    		
    		
    	}
    	
    	
    	
    }
    
}



