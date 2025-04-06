package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class mergeLinkedList {
	
		 
	
	
	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
		
		LinkedList<Integer> mergedList = merge(list1, list2);
		
		Iterator<Integer> iterator = mergedList.iterator();
		
		while(iterator.hasNext()) {	
			
			
			
			System.out.println(iterator.next() + " "  );
		}
		
				
		
		
		
	}
	
	
	
		
		
	



	public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		
		
		        LinkedList<Integer> mergedList = new LinkedList<>();	
		
		        
		       Iterator<Integer> iterator1 = list1.iterator();
		       Iterator<Integer> iterator2 = list2.iterator();
		       
		       while(iterator1.hasNext()  && iterator2.hasNext()) {
		    	   
		    	   
		    	  int num1 = iterator1.next();
		    	  int num2 = iterator2.next();
		    	  
		    	  System.out.println("num1 : " + num1 + " num2 : " + num2);
		    	  
		    	  if(num1 <= num2) {
		    		  
                       mergedList.add(num1);
                  } 
		    	  
		    	  mergedList.add(num2);
		    	    
		    	   
		       }
		
		
		
		
		
		return mergedList;
		
	}
	

	
	
	
}
