package com.ds.array;

import java.util.*;
//import java.util.Map.Entry;
import java.util.Map.Entry;

public class SumofThree {

//	public static List<List<Integer>> threeSum(int[] nums) {
//        HashMap<Integer, List<Integer>> map = new HashMap<>();
//        List<List<Integer>> arrayl = new ArrayList<>();
//        List<Integer> arr = new ArrayList<Integer>();
//        List<Integer> res = new ArrayList<>();
//        for (int i=0; i<nums.length; i++) {
//        	if(map.containsKey(nums[i])) {
//        		//arrayl.add(map.get(nums[i])[0], map.get(nums[i])[1], nums[i]);
//        		res.clear();
//        		//int k = nums[i];
//        		//arr = map.get(k);
//        		res.add(map.get(nums[i]).get(0));
//        		System.out.println("nums[i] = "+nums[i]);
//        		System.out.println(map);
//        		System.out.println("map.get(nums[i])[0]: "+map.get(nums[i]).get(0));
//        		//System.out.println("arr[0]: "+arr[0]);
//        		res.add(map.get(nums[i]).get(0));
//        		System.out.println("map.get(nums[i])[1]: "+map.get(nums[i]).get(1));
//        		//System.out.println("arr[1]: "+arr[1]);
//        		res.add(nums[i]);
//        		arrayl.add(res);
//        	}
//        	for (int j=i+1; j<nums.length; j++) {
//        		int sum = nums[i] + nums[j];
//        		arr.clear();
//        		arr.add(nums[i]);
//        		arr.add(nums[j]);
//        		map.put((0-sum), arr);
//        		System.out.println("arr: "+arr);
//        		arr.clear();
//        		System.out.println("(0-sum): "+(0-sum));
//        		
//        	}
//        }
//        return arrayl;
//    }
	
	public static List<List<Integer>> threeSum(int[] nums){
		HashMap<List<Integer>, Integer> map = new HashMap<>();
		HashMap<List<Integer>, List<Integer>> map1 = new HashMap<>();
		List<List<Integer>> retlist = new ArrayList<>();
		
		int sum = 0;
		boolean cont=true;
		for (int i=0; i<nums.length; i++) {
			for (Entry<List<Integer>, Integer> entry : map.entrySet()) {
				if (entry.getValue() == nums[i]) {
					cont = true;
					if(map1.containsKey(entry.getKey())) {
						List<Integer> arrind = map1.get(entry.getKey());
						if(arrind.contains(i))
							cont = false;
					}
					if (cont) {
					List<Integer> arr1 = new ArrayList<>();
					arr1.add(0, entry.getKey().get(0));
					arr1.add(1, entry.getKey().get(1));
					arr1.add(2, nums[i]);
					System.out.println("arr1: "+arr1);
					if (!retlist.contains(arr1))
						retlist.add(arr1);
					}
					System.out.println("retlist: "+retlist);
				}
			}
			for (int j=i+1; j<nums.length; j++) {
				List<Integer> arr2 = new ArrayList<>();
				List<Integer> arr3 = new ArrayList<>();
				List<Integer> arr4 = new ArrayList<>();
				List<Integer> arr5 = new ArrayList<>();
				List<Integer> arr6 = new ArrayList<>();
				arr2.add(nums[j]);
				arr2.add(nums[i]);
				if (!map.containsKey(arr2)) {
					sum = nums[i] + nums[j];
					arr2.clear();
					arr2.add(0, nums[i]);
					arr2.add(1, nums[j]);
					System.out.println("arr2: "+arr2+" sum: "+(0-sum));
					arr3.add(nums[i]);
					arr3.add((0-sum));
					arr4.add((0-sum));
					arr4.add(nums[j]);
					arr5.add((0-sum));
					arr5.add(nums[i]);
					arr6.add(nums[j]);
					arr6.add((0-sum));
					if((!map.containsKey(arr2)) && (!map.containsKey(arr3)) && (!map.containsKey(arr4)) 
							&& (!map.containsKey(arr5)) && (!map.containsKey(arr6))) {
						map.put(arr2, (0-sum));
						List<Integer> indexarr = new ArrayList<>();
						indexarr.add(i);
						indexarr.add(j);
						map1.put(arr2, indexarr);
					}
				}
			}
		}
		return retlist;
	}

//	public static List<List<Integer>> threeSum(int[] nums){
//		HashMap<List<Integer>, Integer> map = new HashMap<>();
//		List<List<Integer>> arrayl = new ArrayList<>();
//		Integer[] arr1 = new Integer[3];
//		Integer[] arr2 = new Integer[2];
//		List<Integer> arr4 = new ArrayList<>();
//		List<Integer> arr3 = new ArrayList<>();
//		int sum = 0;
//		for (int i=0; i<nums.length; i++) {
//			for (Entry<List<Integer>, Integer> entry : map.entrySet()) {
//	            if (entry.getValue() == nums[i]) {
////	            	arr1.clear();
////	                arr1.add(0, entry.getKey().get(0));
////	                arr1.add(1, entry.getKey().get(1));
//	            	arr1[0] = entry.getKey().get(0);
//	            	arr1[1] = entry.getKey().get(1);
//	                //arr3 = entry.getKey();
//	                System.out.println("arr 3: "+arr3);
////	                arr1.add(nums[i]);
////	                arr1[2] = nums[i];
//	                arr1[2] = entry.getValue();
//	                System.out.println("arr 1: "+arr1);
////	                arr3 = Arrays.asList(arr1);
//	                arr3.clear();
//	                Collections.addAll(arr3, arr1);
//	                arrayl.add(arr3);
//	                System.out.println("arrayl: "+arrayl);
//	            }
//	        }
//			for (int j=i+1; j<nums.length; j++) {
////				arr2.clear();
////				arr2.add(0, nums[j]);
////				arr2.add(1, nums[i]);
//				arr2[0] = nums[j];
//				arr2[1] = nums[i];
//				Collections.addAll(arr4, arr2);
//				if (!map.containsKey(arr4)) {
//					sum = nums[i]+nums[j];
//					arr4.clear();
////					arr2.add(0, nums[i]);
////					arr2.add(1, nums[j]);
//					arr2[0] = nums[i];
//					arr2[1] = nums[j];
//					Collections.addAll(arr4, arr2);
//					System.out.println("arr 2: "+arr2[0]+" "+arr2[1]+" and sum: "+(0-sum));
//					map.put(arr4, (0-sum));
//				}
//			}
//			
//		}
//		return arrayl;
//	} 
//	
//	public int threeSumClosest(int[] nums, int target) {
//        HashMap<Integer, Integer[]> map = new HashMap<>();
//        Integer[] value = new Integer[2];
//        Integer[] addv = new Integer[2];
//        Integer count = 0;
//        for (int i=0; i<nums.length; i++){
//            for (int j=i+1; j<nums.length; j++){
//            	addv[0] = nums[i];
//            	addv[1] = nums[j];
//                map.put(count, addv);
//                count++;
//            }
//        }
//        
//        int diff=5, sum=0, max=0, d=0;
//        count = 0;
//        for (int i=0; i<nums.length; i++){
//            value = map.get(count);
//            if (value[0] != nums[i] && value[1] != nums[i]){
//                sum = value[0] + value[1] + nums[i];
//                d = target-sum;
//                if (Math.abs(d) == 0){
//                    max = sum;
//                    return max;
//                } else {
//                    
//                    if (Math.abs(d)) <= diff){
//                        diff = Math.abs(d);
//                        max = sum;
//                    }
//                }
//            }
//        }
//        return max;
//    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] ques = {-1, 0, 1, 2, -1, -4};
		//int[] ques = {0, 0, 0};
		int[] ques = {1, 2, -2, -1};
		System.out.println("Result : "+threeSum(ques));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 5);
		map.put(1, 10);
		map.put(1,map.get(1)+1);
		Set<Integer> keys = map.keySet();
		System.out.println("key: ");
		System.out.println("Map: "+map);
		map.remove(1);
		System.out.println("Map: "+map);
	}

}
