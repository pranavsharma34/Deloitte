package actions;

import java.io.*;
import java.util.*;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class ExcelFiles {

	public void readFromExcel(String file, String sheetName) throws IOException {
		HSSFWorkbook excelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet excelSheet = excelBook.getSheet(sheetName);
		HSSFRow excelRow = excelSheet.getRow(0); 
		
		if(excelRow.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) { 
			String name = excelRow.getCell(0).getStringCellValue(); 
			System.out.println("name : " + name); 
		}
		if(excelRow.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) { 
			Date birthdate = excelRow.getCell(1).getDateCellValue(); 
			System.out.println("birthdate :" + birthdate); 
		}
		excelBook.close();
	}
	
	public void writeToExcel(String file, String sheetName) throws FileNotFoundException, IOException {
		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet(sheetName);
		Row row = sheet.createRow(0);
		
		Cell name = row.createCell(0);
		name.setCellValue("TestName");
		
		Cell birthdate = row.createCell(1);
		DataFormat format = workbook.createDataFormat();
		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
		birthdate.setCellStyle(dateStyle);
		long dateValue = 1346524199000l;
		birthdate.setCellValue(new Date(dateValue));
		
		sheet.autoSizeColumn(1);
		workbook.write(new FileOutputStream(file));
		workbook.close();
	}
}
