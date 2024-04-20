package LeetCode.com;

public class ClimbStairs {

	public static void main(String[] args) {
	 int stairs=4;
	 int noOfWays=climbStairs( stairs);
	 System.out.println(noOfWays);
	}

	private static int climbStairs(int stairs) {
		int one =1,two=1;
		int temp;
		for(int i =0;i< stairs;i++) {
			temp=one+two;
			one=two;
			two=temp;
			
		}
		
		return one;
	}

}
