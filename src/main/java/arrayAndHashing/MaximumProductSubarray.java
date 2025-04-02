package arrayAndHashing;

public class MaximumProductSubarray {
	
	
	
	
	public static int maxProduct1(int[] nums) {
		
		
		//Kadabane's Algorithm
		
		int max = nums[0];
		int min = nums[0];
		int result = nums[0];
		
		for(int i = 1 ; i< nums.length ; i++) {
			
			int temp = max;
			
			max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
			
			min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);
			
			if(max > result)
				result = max;
		}
		
		return result;
	}
	
	
	public static int maxProduct2(int[] nums) {
		
		//Brute Force
		
		//O(N^2)
		
		int finalProd = nums[0];
		
		
		for(int i = 0 ; i< nums.length ; i++) {
		
				int prod = nums[i];
				
				Math.max(finalProd, prod);
				
				for(int j = i+1 ; j< nums.length ; j++) {
					
					prod = prod * nums[j];
					
					Math.max(finalProd, prod);
				}
			}
				
	
		
		return finalProd;

		
	}

}
