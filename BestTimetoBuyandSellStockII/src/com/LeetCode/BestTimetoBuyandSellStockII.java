package com.LeetCode;

/*Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.*/
public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int maxProfit=maxProfit(prices);
		System.out.println(maxProfit);
	}

	private static int maxProfit(int[] prices) {
		int start=prices[0];
		int maxProfit=0;
		for(int i =1;i<prices.length;i++) {
			if(start<prices[i]) {
				maxProfit=maxProfit+(prices[i]-start);
			    
			}
			 start=prices[i];
		}
		return maxProfit;
	}

	private static int maxProfitI(int[] prices) {
		int min=prices[0];
		int maxProfit=0;
		int profit=0;
		for(int i=0;i<prices.length;i++) {
			min=Math.min(prices[i], min);
			profit=prices[i]-min;
			maxProfit=Math.max(profit, maxProfit);
		}
		return maxProfit;
	}

}
