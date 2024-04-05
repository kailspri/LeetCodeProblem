package leetcode.com;

public class LCS {

	public static void main(String[] args) {
		String [] strs={"flower","flow","flowed"};
		String LCS=longestCommonPrefix( strs);
		System.out.println(LCS);
		System.out.println(LCS.length());

	}

	private static String longestCommonPrefix(String[] strs) {
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			System.out.println("Prefix bfore while "+i +prefix);
			while(strs[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0, prefix.length()-1);
				System.out.println("Prefix in while "+i +prefix);
			}
		}
		return prefix;
	}

}
