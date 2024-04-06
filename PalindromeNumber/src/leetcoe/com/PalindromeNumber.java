package leetcoe.com;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121;
		boolean checkNumebrPalindrome=isPalindrome(num);
		System.out.println(checkNumebrPalindrome);

	}

	private static boolean isPalindrome(int x) {
	int num=x;
	int sum=0;
	while(num>=1) {
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	 
		return sum == x;
	}

}
