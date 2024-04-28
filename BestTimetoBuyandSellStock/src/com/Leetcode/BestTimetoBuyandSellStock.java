package com.Leetcode;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int [] prices = {7,6,4,3,1};
		int maxProfit=maxProfit(prices);
       System.out.println("max Profit "+maxProfit);
	}
	 public static int maxProfit(int[] prices) {
		 int min=prices[0];
		 int max=prices[0];
		 int maxIndex=0;
		 int minIndex=0;
		 for(int i =0;i<prices.length-1;i++) {
				 if(prices[i]<min) {
					 min=prices[i];
					 minIndex=i;
				 }
				 if(prices[i]>max) {
					 max=prices[i];
					 maxIndex=i;
				 }
		 }
		 System.out.println("max Profit "+max);
		 System.out.println("max Profit Index"+maxIndex);
		 System.out.println("min Profit Index"+minIndex);
		 int maxx=prices[minIndex];
		 for(int i =minIndex;i<prices.length;i++) {
			 if(prices[i]>maxx) {
				 maxx=prices[i];
			 }
		 }
		 System.out.println("max after min "+maxx);
	        return maxx-min;
	    }
}
