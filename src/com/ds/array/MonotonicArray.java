package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonotonicArray {
	
	public boolean isMonotonic(int[] A) {
		int[] B = new int[A.length];
		int index=0;
		for(int i:A) {
			B[index++] = i;
		}
        Arrays.sort(B);
        if(Arrays.equals(A, B)) {
        	System.out.println("A in 1:");
        for(int i: A) {
        	System.out.println(i + " ");
        }
        System.out.println("B in 1:");
        for(int i: B) {
        	System.out.println(i + " ");
        }
            return true;
        }
        else {
            int l=0, h=B.length-1;
            while(l<h){
                int temp = B[l];
                B[l] = B[h];
                B[h] = temp;
                l++;
                h--;
            }
            System.out.println("A:");
            for(int i: A) {
            	System.out.println(i + " ");
            }
            System.out.println("B:");
            for(int i: B) {
            	System.out.println(i + " ");
            }
            if(Arrays.equals(A, B))
                return true;
            else return false;
        }
    }
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int len = nums.length;
        for(int i=1; i<=len; i++) {
        	result.add(i);
        }
        for (Integer i : nums) {
			if(result.contains(i))
				result.remove(i);
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonotonicArray obj = new MonotonicArray();
		int[] A = {1,3,2};
		int[] B = {4,3,2,7,8,2,3,1};
		boolean res = obj.isMonotonic(A);
		System.out.println("Result: "+res);
		System.out.println("Result new: "+obj.findDisappearedNumbers(B));
	}

}
