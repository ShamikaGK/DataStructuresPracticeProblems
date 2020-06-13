package com.ds.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DegreeArray {
	
	public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer[]> index = new HashMap<>();
        HashSet<Integer> ind = new HashSet<>();
        int maxcount = 1, sd = nums.length;
        ind.add(nums[0]);
        for(int i=0; i<nums.length; i++){
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i], 1);
                Integer[] t = {i, i};
                index.put(nums[i], t);                
            } else {
            	int temp = freq.get(nums[i])+1;
            	freq.put(nums[i], temp);
            	if(temp > maxcount) {
            		maxcount = temp;
            		ind.clear();
            		ind.add(nums[i]);
            	} else if(temp == maxcount) {
            		maxcount = temp;
            		ind.add(nums[i]);
            	}
            	Integer[] x = index.get(nums[i]);
            	x[1] = i;
            	index.put(nums[i], x);
            }
        }
        Iterator itr = ind.iterator();
        while(itr.hasNext()) {
        	int te = (int) itr.next();
            System.out.println("te: "+te);
        	Integer[] y = index.get(te);
//        	Integer[] y = index.get(itr.next());
        	if((y[1] - y[0] + 1) < sd) {
        		sd = y[1] - y[0] + 1;
        	}
        }
        return sd;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DegreeArray dg = new DegreeArray();
		int[] nums = {1,2,2,3,1,4,2};
		int output = dg.findShortestSubArray(nums);
		System.out.println("output = "+output);
	}

}
