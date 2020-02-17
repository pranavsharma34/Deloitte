package problems;

import java.util.*;
import java.util.Map.Entry;

public class Duplicates {

	public static void findDuplications(String testString) {
		if (testString == null) {
			return;
		}
		testString = testString.toLowerCase();
		testString = testString.trim();
		char[] charArray = testString.toCharArray();
		Hashtable<Character, Integer> countTable = new Hashtable<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (countTable.containsKey(charArray[i])) {
				int value = countTable.get(charArray[i]);
				countTable.put(charArray[i], value + 1);
			}
			else {
				countTable.put(charArray[i], 1);
			}
		}		
		Set<Entry<Character, Integer>> characterSet = countTable.entrySet();
		System.out.println("List of duplicate characters in String '" + testString + "'");
		for (Entry<Character, Integer> character : characterSet) {
			if (character.getValue() > 1) {
				System.out.println(character.getKey() + " : " + character.getValue());
			}
		}
	}
}