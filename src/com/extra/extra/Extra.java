package com.extra.extra;

import java.util.HashMap;

public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c = 0;
		c = (float) (1.0/3.0);
		float h = 0;
		h = (float) (1.0%3.0);
		System.out.println("Heeee: "+ c);
		System.out.println("Heeee22: "+ h);
		StringBuilder fract = new StringBuilder();
		//fract.insert
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, map.getOrDefault(1, 0) + 1);
	}

}
