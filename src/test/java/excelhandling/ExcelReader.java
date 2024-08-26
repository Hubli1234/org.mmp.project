package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws Exception  {
		
		 File file =new File("./src/test/resources/testdata.xlsx");
		 
		 FileInputStream fis = new FileInputStream(file);
		 
		  XSSFWorkbook wb = new XSSFWorkbook(fis);
		  
		  String row = wb.getSheetAt(0).getRow(0).getCell(0).toString();
		  String col = wb.getSheetAt(0).getRow(0).getCell(1).toString();
		  System.out.println(row);
		  System.out.println(col);
		  
		  wb.close();

	}

}
