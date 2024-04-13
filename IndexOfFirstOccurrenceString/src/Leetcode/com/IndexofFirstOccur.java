package Leetcode.com;

public class IndexofFirstOccur {
	public static void main(String[] args) {
		String Nac ="sadbutsad";
		String Pri ="sad";

		int index=findIndex(Nac,Pri);
		System.out.println(index);
	}
	//Find Pri string in Nac String 
	private static int findIndex(String nac, String pri) {
		int count=nac.indexOf(pri);
		return count;
	}
}
