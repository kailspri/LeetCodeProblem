package LeetCode.com;

import java.util.Arrays;

public class AddBinary {

	public static void main(String[] args) {
		String a ="1010";
		String b="1011";
		String output=addBinary(a, b);
		
		System.out.println(output);
	}

	private static String addBinary(String a, String b) {
		int a1=convertBinaryToDouble(a);
		int b1=convertBinaryToDouble(b);
		int sum=a1+b1;
		String ans=convertDoubletoBinary(sum);
		System.out.println("sum"+sum );
		return ans;
	}

	private static String convertDoubletoBinary(int sum) {
        int num= sum;
//        String ans=Integer.toBinaryString(a);
        int []storeBinary=new int[32];
        int index=0;
        while(num>0) {
        	storeBinary[index++]=num%2;
        	num=num/2;
        }
        System.out.print("Binary representation of the integer is: ");
     // Build binary string
        StringBuilder binaryStringBuilder = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            binaryStringBuilder.append(storeBinary[i]);
        }
        
        // Return binary string
        return binaryStringBuilder.toString();
	}

	private static int convertBinaryToDouble(String a) {
		double sum=0;int pow=0;
		for(int i =a.length()-1;i>=0;i--) {
			if(a.charAt(i)=='1') {
				sum=sum+Math.pow(2, pow);				
			}
			pow++;
		}
		System.out.println(sum);
		return (int) sum;
	}
}
