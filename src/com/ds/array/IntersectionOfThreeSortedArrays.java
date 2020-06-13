package com.ds.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IntersectionOfThreeSortedArrays {
	
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> arr12 = new ArrayList<Integer>();
        List<Integer> arr123 = new ArrayList<Integer>();
        for(int i=0; i<arr1.length; i++) {
        	int out = binarySearch(arr2, 0, arr2.length, arr1[i]);
        	if(out != -1) {
        		System.out.println("Out12: "+out);
        		arr12.add(out);
        	}
        }
        
        for(int i=0; i<arr12.size(); i++) {
        	int out = binarySearch(arr3, 0, arr3.length, arr12.get(i));
        	if(out != -1) {
        		System.out.println("Out123: "+out);
        		arr123.add(out);
        	}
        }
        return arr123;
    }
	
	public int binarySearch(int[] arr, int l, int r, int x){
			
		System.out.println("x = "+x);
		while(l<=r) {
			int m = (l+r)/2;
			if(arr[m] == x) {
				return arr[m];
			} else if(arr[m] < x) {
				l = m+1;
			} else if(arr[m] > x) {
				r = m-1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfThreeSortedArrays obj1 = new IntersectionOfThreeSortedArrays();
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,5,7,9};
		int[] arr3 = {1,3,4,5,8};
		List<Integer> out = obj1.arraysIntersection(arr1, arr2, arr3);
		System.out.println("output: ");
		for(int i=0; i<out.size(); i++) {
			System.out.println(out.get(i) + " ");
		}
	}

}
