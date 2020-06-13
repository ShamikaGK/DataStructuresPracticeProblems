package com.ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ReturnArray {
	
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
        int len2 = arr2.length;
        int[] res = new int[len1];
        int m=0;
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> keys = new HashSet<Integer>();
        //int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len1; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            } else {
                map.put(arr1[i], 1);
            }
        }
        System.out.println("map: "+map);
        keys = map.keySet();
        System.out.println("keyset: "+keys);
        for(int i=0; i<len2; i++){
            if(map.containsKey(arr2[i])){
                int count = map.get(arr2[i]);
                while(count>0){
                    res[m] = arr2[i];
                    count--;
                    m++;
                }
                keys.remove(arr2[i]);
            }
        }
        //Collections.sort(keys);
        Iterator<Integer> its = keys.iterator();
        while(its.hasNext()){
            list.add(its.next());
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            res[m] = list.get(i);
            m++;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnArray obj = new ReturnArray();
		int[] arr1 = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
		int[] arr2 = {2,42,38,0,43,21};
		int[] res = obj.relativeSortArray(arr1, arr2);
		System.out.println("res: ");
		String resp = "";
		for(int i=0; i<res.length; i++) {
			resp = resp + res[i] + " ";
		}
		System.out.println(resp);
	}

}
