package com.extra.extra;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String out = "";
		String oo = "";
//		out = "a.b.c.d";
//		oo = out.replace(".", "[.]");
		out = "ABCD";
		oo = out.toLowerCase();
		System.out.println("out = "+oo);
		char a = '5';
		int b = Character.getNumericValue(a);
		System.out.println("b: "+b);
		String s = "asdas.adsa";
		char c = s.charAt(5);
		System.out.println(c);
		System.out.println(s.replace(".", ""));
		char cd = 'a';
		int temp = (int) cd;
		System.out.println("temp: "+temp);
	}

}
