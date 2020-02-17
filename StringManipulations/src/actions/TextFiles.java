package actions;

import java.io.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.util.*;

public class TextFiles {
	
	public StringBuffer readSimpleTextFiles(String filePath) throws Exception {
		File file = new File(filePath);
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file), "UTF-8"));
		StringBuffer stringBuffer = new StringBuffer();
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
		}
		bufferedReader.close();
		return stringBuffer;	
	}
	
	public static List<String> readComplexTextFiles(String filePath) throws Exception {
		List<String> lines = Collections.emptyList();
		lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
		return lines;
	}
	
	public static void readAllTextFiles(String filePath) throws Exception {
		byte[] bytes = Files.readAllBytes(Paths.get(filePath));
		String content = new String(bytes, "UTF-8");
		bytes = new byte[content.length()];
		for (int i = content.length() - 1; i >= 0; i--) {
			bytes[i] = (byte)content.charAt(i);
		}
		content = new String(bytes, "UTF-8");
		BufferedReader bufferedReader = new BufferedReader(new StringReader(content));
		String line = "";
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		
		System.out.println(Character.getType('�'));
		
	}
	
	public boolean writeTextFiles(String filePath) {
		return false;
	}

	public boolean createTextFile(String filePath) {
		return false;
	}
	
	public boolean deleteTextFile(String filePath) {
		return false;
	}
}