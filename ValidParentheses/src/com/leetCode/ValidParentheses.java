package com.leetCode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s= "()[]{}";
		boolean result=isValid( s);
		System.out.println(result);

	}

	private static boolean isValid(String s) {
		Stack<Character> stack= new Stack<>();
		for(char c :s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else if (c==')' && !stack.isEmpty() && stack.peek()=='(') {
				stack.pop();
			}
			else if(c=='}' && !stack.isEmpty() && stack.peek()=='{') 
				stack.pop();
			else if(c==']' && !stack.isEmpty() && stack.peek()=='[') 
				stack.pop();
			else
				return false;
			
		}
		System.out.println(stack);
		return stack.isEmpty();
	}

}
