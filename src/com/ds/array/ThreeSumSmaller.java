package com.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ThreeSumSmaller {
	
//	public int threeSumSmaller(int[] nums, int target) {
//        Set<Integer[]> set = new HashSet<Integer[]>();
//        Set<Integer[]> out = new HashSet<Integer[]>();
//        Integer[] arr = new Integer[3];
//        Integer[] arr1 = new Integer[3];
//        int count=0;
//        for(int i=0; i<nums.length-2; i++) {
//        	for(int j=i+1; j<nums.length-1; j++) {
//        		Integer[] temp1 = {i,j};
//        		Integer[] temp2 = {j,i};
//        		if(!set.contains(temp2)) {
//        			set.add(temp1);
//        			System.out.println("temp1: "+temp1[0] + temp1[1]);
//        		}
//        	}
//        }
//        
//        for(int k=2; k<nums.length; k++) {
//        	Iterator itr = set.iterator();
//            while(itr.hasNext()) {
//            	Integer[] index = (Integer[]) itr.next();
//            	if(index[0] != k && index[1] != k) {
//            		System.out.println("i j k: "+index[0]+" "+index[1]+" "+k);
//            		int f = nums[index[0]];
//            		int s = nums[index[1]];
//            		int t = nums[k];
//            		int sum = f + s + t;
//            		
//            		if(sum < target) {
//            			//arr = {f,s,t};
//            			arr[0] = f;
//            			arr[1] = s;
//            			arr[2] = t;
//            			//arr1 = {s,f,t};
//            			arr1[0] = s;
//            			arr1[1] = f;
//            			arr1[2] = t;
//            			System.out.println("arr: "+arr[0]+" "+arr[1]+" "+arr[2]);
//            			System.out.println("arr1: "+arr1[0]+" "+arr1[1]+" "+arr1[2]);
//            			if(!out.contains(arr) || !out.contains(arr1)) {
//            				out.add(arr);
//            				count = out.size();
//            			}
//            		}
//            	}
//            }
//        }
//        return count;
//    }
	
//	public int threeSumSmaller(int[] nums, int target) {
//		HashMap<Integer, List<Integer[]>> map = new HashMap<>();
//		List<Integer[]> list = new ArrayList<>();
//		for(int i=0; i<nums.length-2; i++) {
//			for(int j=i+1; j<nums.length-1; j++) {
//				int sum = nums[i] + nums[j];
//				if(map.containsKey(sum)) {
//					list = map.get(sum);
//					Integer[] arr = {i,j};
//					list.add(arr);
//					map.put(sum, list);
//				} else {
//					Integer[] arr = {i,j};
//					list.add(arr);
//					map.put(sum, list);
//				}
//			}
//		}
//		Set<Integer> keys = map.keySet();
//		Iterator itr = keys.iterator();
//		for(int k=2; k<nums.length; k++) {
//			while(itr.hasNext()) {
//				Integer sum = (Integer) itr.next();
//				if(nums[k]+sum<target) {
//					list = map.get(sum);
//				}
//			}
//		}
//		return 0;	
//    }
	
	public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
	    int sum = 0;
	    for (int i = 0; i < nums.length - 2; i++) {
	    	System.out.println("i = "+nums[i]);
	        sum += twoSumSmaller(nums, i + 1, target - nums[i]);
	    }
	    return sum;
	}

	
	
	private int twoSumSmaller(int[] nums, int startIndex, int target) {
	    int sum = 0;
	    int left = startIndex;
	    int right = nums.length - 1;
	    while (left < right) {
	        if (nums[left] + nums[right] < target) {
	            left++;
	        } else if (nums[left] + nums[right] > target) {
	        	right--;
	        } else {
	        	System.out.println("nums[left]: "+nums[left]+" nums[right]: "+nums[right]);
	        	sum++ ;
	        	break;
	        }
	    }
	    return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumSmaller tss = new ThreeSumSmaller();
		//int[] nums = {0,-4,-1,1,-1,2};
		//int[] nums = {-2,0,1,3};
		//int[] nums = {-2, 4, 1, 3, -5, 7, 8, -1};
		int[] nums = {1, -2, 3, -4, 5};
		int target = -5;
		int output = tss.threeSumSmaller(nums, target);
		System.out.println("Output: "+output);
		char[] ar = {'a', 't', 'e', 'p'};
		String resp = String.valueOf(ar);
		System.out.println("resp: "+resp);
	}

}
