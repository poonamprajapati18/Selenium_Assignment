package Guru99;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public ExcelReader(String filepath, String sheetName) {
		super();
		this.filePath = filepath;
		this.sheetName = sheetName;
	}
	  String filePath;
	  String sheetName;
	  
	  public int rowCount() {
		  int i = 0;
		  try {
			  XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			  XSSFSheet worksheet  = workbook.getSheet(sheetName);
			  i = worksheet.getPhysicalNumberOfRows();
		  }catch (IOException e) {
			 e.printStackTrace();
		  }
		  return i;
		  
	  }
	public int colCount() {
		int i =0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
		    i = worksheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			e.printStackTrace();	
		}
		return i;
	}
	public String getData(int row, int col) {
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(data);
		} catch(IOException e) {
			e.printStackTrace();
			}
		return data;
	}
	
	
}


