package problems;

import java.util.Stack;

public class Reversal {

	public static String findReversal(String testString) {
		if (testString == null) {
			return null;
		}
		if (testString == "") {
			return null;
		}
		testString = testString.toLowerCase();
		testString = testString.trim();
		char[] charArray = testString.toCharArray();
		char[] returnArray = new char[charArray.length];
		if (charArray.length > 0) {
			Stack<Character> charStack = new Stack<Character>();
			for (int i = 0; i < charArray.length; i++) {
				charStack.push(charArray[i]);
			}
			for (int i = 0; i < charArray.length; i++) {
				returnArray[i] = charStack.pop();
			}
		}
		return String.valueOf(returnArray.toString());
	}
}
