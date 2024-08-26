package excelhandling;

import utils.ExcelUtil;

public class TestExcelUtil {

	public static void main(String[] args) {
		
		//we have created a library in Excel Util and from that library trying to fetch code
		
		ExcelUtil excel = new ExcelUtil("./src/test/resources/testdata/webshopdata.xlsx");
		int count = excel.getRowCount("Credentials");
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String row = excel.getCellData("Credentials", i, 0);
			String col = excel.getCellData("Credentials", i, 1);
			System.out.println(row+"" +col);
		}

	}

}
