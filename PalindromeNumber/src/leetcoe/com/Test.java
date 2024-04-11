package leetcoe.com;

public class Test {

	public static void main(String[] args) {
		int num=1211;
		boolean isPlaindorme=isPlaindrome(num);
        System.out.println(isPlaindorme);
	}

	private static boolean isPlaindrome(int num) {
		int sum =0;
		int x=num;
		while(x>=1) {
			int rem=x%10;
			sum=sum*10+rem;
			x=x/10;
			System.out.println("sum"+sum);
			System.out.println(x);
		}
		if(sum==num)
			return true;
		return false;
	}

}
