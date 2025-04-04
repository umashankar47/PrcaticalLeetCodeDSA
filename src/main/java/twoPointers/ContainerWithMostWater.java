package twoPointers;

public class ContainerWithMostWater {
	
	
	
	
public static int containerWithMostWater(int[] height) {
	
	int[] arr = {1,8,6,2,5,4,8,3,7};
	
	
	
	int i=arr[0];
	int j = arr[arr.length-1];
	
	int resultMaxArea= 0;
	
	
	while(i<j) {	
		
		int area = Math.min(arr[i], arr[j]) * (j-i);	
		
        resultMaxArea = Math.max(resultMaxArea, area);
        
        if(arr[i] < arr[j])
        	i++;
        else 
        	j--;
		
	}
	
	return resultMaxArea;	
}




}
