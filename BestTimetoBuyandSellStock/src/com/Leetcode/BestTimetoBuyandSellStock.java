package com.Leetcode;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		//int [] prices = {7,6,4,3,1};
		int [] prices = {2,4,1};
		//int [] prices = {1,2,4};
		int maxProfit=maxProfit(prices);
		int maxProfitLeet=maxProfitLeet(prices);
       System.out.println("max Profit "+maxProfit);
       System.out.println("max Profit "+maxProfitLeet);
	}
	//not passing all cases;
	 public static int maxProfit(int[] prices) {
		 int min=prices[0];
		 int max=prices[0];
		 int maxIndex=0;
		 int minIndex=0;
		 int maxx=0;
		 for(int i =0;i<prices.length;i++) {
				 if(prices[i]<min) {
					 min=prices[i];
					 minIndex=i;
				 }
				 if(prices[i]>max) {
					 max=prices[i];
					 maxIndex=i;
				 }
		 }		 
		 System.out.println("max Index"+maxIndex);
		 System.out.println("min Index"+minIndex);
		 if(minIndex<maxIndex) {
			 return max-min;
		 } 
		 else {
			 maxx=prices[minIndex];
			 for(int i =minIndex;i<prices.length;i++) {
				 if(prices[i]>maxx) {
					 maxx=prices[i];
				 }
			 }
		 }
	        return maxx-min;
	    }
	 public static int maxProfitLeet(int[] prices){
	        int min=prices[0];
	        int maxProfit=0;
	        for(int i =0;i<prices.length;i++){
	            min=Math.min(min,prices[i]);
	            int profit=prices[i]-min;
	            maxProfit=Math.max(maxProfit,profit);
	        }
	        return maxProfit;
	    }
}
