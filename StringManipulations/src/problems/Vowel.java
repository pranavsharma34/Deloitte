package problems;

public class Vowel {

	public static int countVowels(String testString) {
		if (testString == null || testString == "") {
			return 0;
		}
		testString = testString.toLowerCase();
		testString = testString.trim();
		int count = 0;
		char[] letters = testString.toCharArray();
		for (char c : letters) {
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
			break;	
			default:
			}
		}
		return count;
	}
	
	public static int countConsonants(String testString) {
		if (testString == null || testString == "") {
			return 0;
		}
		testString = testString.toLowerCase();
		testString = testString.trim();
		int count = 0;
		char[] letters = testString.toCharArray();
		for (char c : letters) {
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case ' ':	
			break;	
			default:
				count++;
			}
		}
		System.out.println("Number of vowels in String [" + testString + "] is : " + count);
		return count;		
	}
}
