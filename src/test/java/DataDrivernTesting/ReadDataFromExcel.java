package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Book3.xlsx");
		
		//open workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//get control to the sheet
		Sheet sheet=wb.getSheet("Sheet1");
		
		//get control to the row
		String data=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
	}

}
