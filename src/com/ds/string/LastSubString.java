package com.ds.string;

public class LastSubString {
	
	public String lastSubstring(String s) {
        char[] chararr = s.toCharArray();
        int ascii = 97, ind = 0, nextind = 0;
        for(int i = s.length()-1; i>=0; i--) {
        	if(ascii < (int)chararr[i]) {
        		ascii = (int)chararr[i];
        		ind = i;
        		nextind = i+1;
        	} else if(ascii == (int)chararr[i]) {
        		if((int)chararr[nextind] < (int)chararr[i++]) {
        			ascii = (int)chararr[i];
            		ind = i;
            		nextind = i+1;
        		}
        	}
        }
        return s.substring(ind);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastSubString sb = new LastSubString();
		String input = "zrziy";
		String output = sb.lastSubstring(input);
		System.out.println("output: "+output);
	}

}
