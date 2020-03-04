package fileinputandoutput

def writeFile = new File("C:\\Personal\\Projects\\GROOVY\\NewFile.txt");
writeFile.delete();
writeFile.createNewFile();
writeFile.append("Person Number, Start Date, End Date, Profile");
writeFile.append("\n");

new File("C:\\Personal\\Projects\\GROOVY\\FileParsing.txt").eachLine {  
         line -> "$line";
		 
		 String[] firstString;
		 firstString = line.split(',');
		 String number = firstString[0];
		 
		 for (String value: firstString) {
			 String[] innerStrings;
			 innerStrings = value.split('\\+');
			 
			 if (innerStrings.length > 1) {
				 writeFile.append(number);
				
				 for (String innerValues: innerStrings) {
					writeFile.append(", ");
					writeFile.append(innerValues);
				}
				writeFile.append("\n"); 		 
			 }
		 }
	}
