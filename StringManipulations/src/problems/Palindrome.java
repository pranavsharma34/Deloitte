package problems;

import java.util.Stack;

public class Palindrome {

	public static boolean isPalindrome(String testString) {
		if (testString == null) {
			return false;
		}
		testString = testString.toLowerCase();
		testString = testString.trim();
		char[] charArray = testString.toCharArray();
		if (charArray.length > 0) {
			Stack<Character> charStack = new Stack<Character>();
			for (int i = 0; i < charArray.length; i++) {
				charStack.push(charArray[i]);
			}
			for (int i = 0; i < charStack.size(); i++) {
				char testChar = charStack.pop();
				if (testChar != charArray[i]) {
					return false;
				}
			}
		}
		return true;
	}
}