package com.extra.extra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppropriateSubstring {
	
	public static String calculator(String text, String prefixString, String suffixString) {
		Set<String> set = new HashSet<String>();
		HashMap<String, Integer[]> map = new HashMap<String, Integer[]>();
		Integer[] in = new Integer[2];
		int prefscore = 0, sufscore = 0, total = 0, max = 0;
		for(int i=0; i<text.length(); i++) {
			for(int j=i+1; j<text.length(); j++) {
				set.add(text.substring(i, j));
				in[0] = i;
				in[1] = j;
				map.put(text.substring(i, j), in);
			}
		}
		
		Iterator<String> key = set.iterator();
		while(key.hasNext()) {
			//pick up first val from list = make sure both functions return the substring too
			prefscore = prefcalc(key.next(), prefixString);
			sufscore = sufcalc(key.next(), suffixString);
			total = prefscore + sufscore;
			if(max < total) {
				max = total;
			}
		}
		return "";
	}
	
	public static int prefcalc(String text, String prefix) {
		int score = 0;
		int j=prefix.length()-1;
		for(int i=text.length()-1; i>=0; i--) {
			if(text.charAt(i) == prefix.charAt(j)) {
				score++;
				j--;
			} else {
				break;
			}
		}
		
		return score;
	}
	
	public static int sufcalc(String text, String suffix) {
		int score = 0;
		int j=0;
		for(int i=0; i<suffix.length(); i++) {
			if(text.charAt(i) == suffix.charAt(j)) {
				score++;
				j++;
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
