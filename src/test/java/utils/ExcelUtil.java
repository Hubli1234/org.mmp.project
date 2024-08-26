package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	XSSFWorkbook wb;
	
	/*
	 * this constructor helps us to read the excel file and pass it as parameter to fileinputstream class
	 * XSSFWorkbook is the class where fis is passed as an argument
	 */
	
	public ExcelUtil(String excelPath) {
		
		try
		{
			File file = new File(excelPath);
			FileInputStream fis = new FileInputStream(file);
		    wb = new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		{
			System.out.println("unable to load the excel file " +e.getMessage());
			
		}
	}
	
	/*
	 * these methods are used to get the active row count
	 * 
	 */
	public int getRowCount(int sheetNum)
	{
		return wb.getSheetAt(sheetNum).getLastRowNum()+1;
	}
	public int getRowCount(String sheetName)
	{
		return wb.getSheet(sheetName).getLastRowNum()+1;
	}
	
	/*
	 * these methods are used to get the active cell data
	 * 
	 */
	
	public String getCellData(int sheetno, int row, int col)
	{
		return wb.getSheetAt(sheetno).getRow(row).getCell(col).toString();
	}
	public String getCellData(String sheetname, int row, int col)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(col).toString();
	}
}
