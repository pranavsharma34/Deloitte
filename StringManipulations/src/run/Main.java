package run;

import problems.*;
import actions.*;

public class Main {

	public static void main(String[] args) throws Exception {
		//SpecialCharacters specialCharacters = new SpecialCharacters();
		//specialCharacters.findSpecialCharacters();
		//System.out.println(Palindrome.isPalindrome("  TESEt"));
		//Duplicates.findDuplications("programming");
		//Reversal.findReversal("programming");
		Vowel.countConsonants("How many vowels in this String");
		ExcelFiles excelFiles = new ExcelFiles();
		excelFiles.writeToExcel("C:\\Personal\\Projects\\Excel Files\\Sample.xlsx", "Birthday");
		excelFiles.readFromExcel("C:\\Personal\\Projects\\Excel Files\\Sample.xlsx", "Birthday");
	}
}