package com.ds.string;

import java.util.HashSet;
import java.util.List;
import java.util.*;

public class ArrayString {
	
	public List<String> groupAnagrams(List<String> strs) {
		Set<String> set1 = new HashSet<String>();
		List<String> res = new ArrayList<String>();
	
		for(int i=0; i<strs.size(); i++) {
			String inp = strs.get(i);
			char[] chararr = inp.toCharArray();
			
			Arrays.sort(chararr);
			String check = String.valueOf(chararr);
			System.out.println(chararr);
			if(!set1.contains(check)) {
				set1.add(check);
				res.add(inp);
			}
		}
		int i=0;
		String[] str = new String[res.size()];
		for(String s: res) {
			str[i++] = s;
		}
		Arrays.sort(str);
		i=0;
		res.clear();
		for(String s: str) {
			res.add(s);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayString obj = new ArrayString();
		List<String> input = new ArrayList<String>();
		input.add("code");
		input.add("anagrams");
		input.add("agrmsnaa");
		input.add("doce");
		List<String> output = obj.groupAnagrams(input);
		System.out.println("Output");
		for(int i=0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Output from first: "+i);
		}
		for(int i=0; i<5; ++i) {
			System.out.println("Output from second: "+i);
		}
		LinkedList<Integer> ll = new LinkedList<Integer>();	
		}

}
