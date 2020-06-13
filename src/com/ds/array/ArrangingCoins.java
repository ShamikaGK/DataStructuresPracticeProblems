package com.ds.array;

import javax.swing.text.html.MinimalHTMLWriter;

public class ArrangingCoins {
	
	public int arrangeCoins(int n) {
        int k = 0;
        int sum = n;
        while(sum-k>0){
        	sum = sum - k;
            k++;
            System.out.println("Sum: "+sum);
        }
        if(sum == 0)
            return k;
        else
            return --k;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangingCoins obj = new ArrangingCoins();
		int input = 2147483647;
		System.out.println("Result: "+obj.arrangeCoins(input));
		System.out.println("Integer: "+input);
	}

}
