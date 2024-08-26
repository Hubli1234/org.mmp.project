package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader2 {

	public static void main(String[] args) throws Exception {
		
		File file = new File("./src/test/resources/testdata/testdata.xlsx");
		
		// taking contents from excel
		FileInputStream fis = new FileInputStream(file);
		
		//since we are working with excel we have to create an object 
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	int count = wb.getSheetAt(0).getLastRowNum()+1;
	System.out.println("Total no of rows:"+count);

	for(int i=0; i<count; i++)
	{
		String row = wb.getSheetAt(0).getRow(i).getCell(0).toString();
	  String col = wb.getSheetAt(0).getRow(i).getCell(1).toString();
	  System.out.println(row+""+col);
	}
	wb.close();
	}
	

}
