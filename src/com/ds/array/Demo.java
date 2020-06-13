package com.ds.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Demo {

	
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	        //List<Integer> arr = new ArrayList<>();
	        List<List<Integer>> arrayl = new ArrayList<>();
	        int sum=0;
	        for (int i=0; i<nums.length; i++){
	            for (int j=i+1; j<nums.length; j++){
	                for (int k=j+1; k<nums.length; k++){
	                    for (int c=k+1; c<nums.length; c++){
	                    if((i!=j) && (j!=k) && (k!=c) && (i!=c) && (i!=k) && (j!=c)){
	                        sum = nums[i]+nums[j]+nums[k]+nums[c];
	                        if(sum == target){
	                            List<Integer> arr = new ArrayList<>();
	                            arr.clear();
	                            arr.add(nums[i]);
	                            arr.add(nums[j]);
	                            arr.add(nums[k]);
	                            arr.add(nums[c]);
	                            //if (!arrayl.contains(arr))
	                            int res=0, count=0;
	                            System.out.println("Arrayl: "+arrayl);
	                            for (int index=0; index<arrayl.size(); index++) {
	                                System.out.println("size: "+arrayl.size());
	                               // System.out.println("New: "+arrayl.get(1));
	                                List<Integer> list = arrayl.get(index);
	                                System.out.println("List1: "+list+" arr = "+arr);
	                                res = check(list, nums[i], nums[j], nums[k], nums[c]);
	                                if (res == 4)
	                                    count=1;
	                                    //break;
	                            }
	                            if(count==0)
	                                arrayl.add(arr);
	                        }
	                    }
	                    }
	                }
	            }
	        }
	        System.out.println("New: "+arrayl.get(1));
	        return arrayl;
	    }
	    
	    public int check(List<Integer> list, int i, int j, int k, int c){
	        System.out.println("List: "+list);
	        int ret = 0;
	        for (int m = 0; m<list.size(); m++){
	            int abc = list.get(m).intValue();
	            
	            if (abc == i )
	                ret++;
	            System.out.println("ret1: "+ret);
	            if (abc == j )
	                ret++;
	            System.out.println("ret2: "+ret);
	            if (abc == k )
	                ret++;
	            System.out.println("ret3: "+ret);
	            if (abc == c )
	                ret++;
	            System.out.println("ret4: "+ret);
	        }
	        return ret;
	    }
	}

