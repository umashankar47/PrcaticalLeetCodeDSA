package arrayAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
	
	
	
	public static boolean containsDuplicate1(int[] arr ) {
		
		// using Java 8 Stream API
		
		return Arrays.stream(arr).distinct().count() < arr.length;
	}
	
	
	public static boolean containsDuplicate2(int[] arr) {
		
		//Using Set
		Set<Integer> set1 = new HashSet<>();
		
		for(int x: arr) {
			
			if( set1.contains(x))
				return true;
			else
				set1.add(x);
		}
		
		return false;
	}
	
	
	public static boolean containsDuplicate3(int[] arr) {
		
		//using sort
		
		Arrays.sort(arr);
		
		for(int i =1 ; i< arr.length ;i++)
			if(arr[i] == arr[i-1])
				return true;
		
		
		return false;
	}
	
	
	public static boolean containsDuplicate4(int[] arr ) {
		
		// using BruteForce
		
		int len = arr.length;
		for(int i=0 ; i<len-1 ; i++ )
			for(int j = i+1 ; j< len ; j++) {
				
				if(arr[i] == arr[j])
					return true;
			}
		
		return false;
		
	}
	


	


}
