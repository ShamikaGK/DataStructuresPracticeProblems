package com.ds.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class InterSectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i=0; i<nums1.length; i++) {
        	set1.add(nums1[i]);
        }
        for (int j=0; j<nums2.length; j++) {
        	set2.add(nums2[j]);
        }
        HashSet<Integer> temp = new HashSet<Integer>();	
        if (set1.size()>set2.size()) {
        	temp = set2;
        	set2 = set1;
        	set1 = temp;
        }
        Iterator<Integer> itr = set1.iterator();
        ArrayList<Integer> res = new ArrayList<>();
        while(itr.hasNext()) {
        	int tempint = itr.next();
        	if(set2.contains(tempint)) {
        		res.add(tempint);
        	}
        }
        int[] result = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
        	result[i] = res.get(i);
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterSectionOfTwoArrays obj = new InterSectionOfTwoArrays();
		//int[] nums1 = {1,2,2,1};
		int[] nums1 = {4,9,5};
		//int[] nums2 = {2,2};
		int[] nums2 = {9,4,9,8,4};
		int[] result = obj.intersection(nums1, nums2);
		String r = "";
		for (int i=0; i<result.length; i++) {
			r = r + result[i] + " ";
		}
		System.out.println("Result: "+r);
	}

}
