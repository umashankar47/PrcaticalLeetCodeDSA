package arrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	

	public static int[] solution1(int[] arr , int target) {
		
		Map<Integer , Integer> hm = new HashMap<>();
		

		for(int i=0 ; i< arr.length ; i++) {
			
			int diff = target - arr[i];
			
			if(hm.containsKey(diff))
				return new int[] {i,hm.get(diff)};
			
			
			hm.put(arr[i], i);
				
		}
		
		return new int[] {0,0};
		
	}
}
