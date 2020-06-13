	package com.ds.array;

import java.util.HashMap;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//System.out.println("t = "+t);
		for(int i=0; i<t; i++){
		    int len = sc.nextInt();
		    //System.out.println("len = "+len);
		    //String[] s = new String[2*len];
		    String[] s = new String[len];
		    int[] values = new int[len];
		    //String res = "";
		    for(int m=0; m<len; m++) {
		    	String line = sc.next();
			    //System.out.println("line: "+line);
			    int val = sc.nextInt();
			    //System.out.println("val: "+val);
			    //res = res + line + " " + val + " ";
			    //System.out.println("res: "+res);
			    s[m] = line;
			    values[m] = val;
		    }
		    
		    //s = line.split(" ");
		    //System.out.println("s: "+s);
		    HashMap<String, Integer> map = new HashMap<>();
		    for(int j=0; j<(len); j++){
		        String key = s[j];
		        int value = values[j];
		        map.put(key, value);
		    }
		    String tofind = sc.next();
		    if(map.containsKey(tofind)){
		        int val = map.get(tofind);
		        System.out.println(val);
		    }
		    else
		        System.out.println(-1);
		}
	}

}
