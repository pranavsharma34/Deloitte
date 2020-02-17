package specialcharacters;

import java.util.*;

import actions.TextFiles;

public class SpecialCharacters {

	public void findSpecialCharacters() throws Exception {
		String filePath = "C:\\Personal\\Projects\\SpecialCharacters\\Test.txt";
		
		TextFiles textFiles = new TextFiles();
		StringBuffer stringBuffer = textFiles.readSimpleTextFiles(filePath);
		System.out.println(stringBuffer);		
		
		List<String> lines = TextFiles.readComplexTextFiles(filePath);
		for (int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
		
		TextFiles.readAllTextFiles(filePath);
	}
}