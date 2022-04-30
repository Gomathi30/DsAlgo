package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	String filepath;
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	public ExcelReader(){
	 try {
		filepath = "/Users/suresh/eclipse-workspace/DSAlgo/src/test/resources/excel/Book6.xlsx";
		  
		file = new FileInputStream(filepath);
		System.out.println("project path:"+ System.getProperty("user.dir"));
		workbook= new XSSFWorkbook(file);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	   sheet=workbook.getSheetAt(0);
	   
	}
	
	public String getUsername() {
		
		return sheet.getRow(1).getCell(0).getStringCellValue();
	}
	
	public String getPassword() {
		
		return sheet.getRow(1).getCell(1).getStringCellValue();
	}
	
	public static void main(String args[]) {
		ExcelReader excel= new ExcelReader();
		System.out.println(excel.getUsername());
		System.out.println(excel.getPassword());
	}
	
}
