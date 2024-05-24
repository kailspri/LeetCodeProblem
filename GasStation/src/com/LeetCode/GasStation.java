package com.LeetCode;
/*Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
Therefore, return 3 as the starting index.*/
public class GasStation {

	public static void main(String[] args) {
		int[] gas= {2,3,4};
		int[] cost= {3,4,3};
		 int answer= canCompleteCircuit( gas, cost) ;
	     System.out.println(answer);
	}

	private static int canCompleteCircuit(int[] gas, int[] cost) {
		int totalGas=0;
		int totalCost=0;
		int tank=0;
		int startStation=0;
		for(int i =0;i<gas.length;i++) {
			totalGas+=gas[i];
			totalCost+=cost[i];
			System.out.println(totalGas+" "+totalCost);
			tank+=gas[i]-cost[i];
			System.out.println("fulen in tank "+tank);
		 if(tank<0) {
			 startStation=i+1;
			 tank=0;
		 }
		}
		 if (totalGas >= totalCost) {
	            return startStation;
	        } else {
	            return -1;
	        }
		
		
	}

}
