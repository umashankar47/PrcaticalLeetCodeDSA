package arrayAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class mostFrequentElements {
	
	
	//get the most frequen elements in the array , k is the top k elements 
	// if k=2 , return top 2 frequent elements 
	
	public static int[] getNostFreq(int[] arr , int k) {
		
		
		Map<Integer ,Integer> hm = new HashMap<>();
		
		//go through tArrray and get the frequency of each element
		
		for( int x : arr) {
			
			hm.put(x, hm.getOrDefault(x, 0)+1);
		}
		
		hm.entrySet().stream().forEach(System.out::println);
		
		//Priority Que
		
		PriorityQueue<Entry<Integer ,Integer>> pq = new PriorityQueue<>(
				
				(a,b) -> b.getValue() - a.getValue()
				
				);
		
		
		//Lopo through the hashmap and add the entry set to the priority queue
		for(Entry<Integer , Integer> eSet : hm.entrySet()) {
			
			pq.add(eSet);
		}
		
		
		//Result array with the top k elements
		int[] res = new int[k];
		
		while(k>0)
			res[--k] = pq.poll().getKey();
		
		
		return res;
	}
	

}
