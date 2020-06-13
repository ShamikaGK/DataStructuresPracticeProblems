package com.extra.extra;

public class VersionExtractor {
	
	public static String version(String input1, String input2) {
		String[] ip1 = input1.split(" ");
		String[] ip2 = input2.split(" ");
		if(ip1[0].equals(ip2[0])) {
			int ver1 = converter(ip1[1]);
			int ver2 = converter(ip2[1]);
			if(ver1 > ver2) {
				return "Higher";
			} else if (ver1 < ver2) {
				return "Lower";
			} else 
				return "Same";
		} else return "Mismatch";
	}

	public static int converter(String s) {
		String[] x = s.split("\\.");
		String[] y = new String[3];
		if(x.length < 3) {
			for(int i=0; i<x.length; i++) {
				y[i] = x[i];
			}
			for(int j=2; j>=x.length; j--) {
				y[j] = "0";
			}
		} else y = x;
//		System.out.println(y[0]);
//		System.out.println(y[1]);
//		System.out.println(y[2]);
		int temp = 0;
		for(int i=0; i<y.length; i++) {
			int t = Integer.parseInt(y[i]);
			temp = temp*10 + t;
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "CiscoIOS 5.2.2";
		String input2 = "CiscoIOS-XR 7.8";
		String output = version(input1, input2);
		System.out.println("The output is: "+output);
	}

}
