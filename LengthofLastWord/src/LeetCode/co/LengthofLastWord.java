package LeetCode.co;

import java.util.Stack;

//Given a string s consisting of words and spaces, return the length of the last word in the string.

/*Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

public class LengthofLastWord {
	
 public static void main(String[] args) {
	String s ="fly me   to   the moon";
	int length=lengthOfLastWord(s);
	System.out.println("Lenght of last word :"+length);
}

private static int lengthOfLastWord(String s) {
	char[] c=s.toCharArray();
	System.out.println(c.length);
	Stack<Character> stack= new Stack<>();
	for(int i =0;i<c.length;i++) {
		stack.push(c[i]);
		
		//System.err.println("stack peek :" +stack.peek());
	}
	System.out.println(stack);
	int peek=0;
	// Skip trailing spaces
	while(!stack.isEmpty() && stack.peek()==' ') {
		stack.pop();
		
	}
	// Count characters until the next space or end of stack
		while(!stack.isEmpty() && stack.peek()!=' ') {
			stack.pop();
			peek++;
		}
		
	
	System.out.println(stack);
	return  peek;

}
}
