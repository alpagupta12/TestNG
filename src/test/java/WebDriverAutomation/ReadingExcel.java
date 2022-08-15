package WebDriverAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
	String	excelFilePath = "/Users/alpagupta/Documents/eclipse-workspace/Selenium/Excel/Data3.xlsx" ;
    
	FileInputStream inputstream = new FileInputStream (excelFilePath);
	
	XSSFWorkbook workbook = new XSSFWorkbook (inputstream);
	
	XSSFSheet  sheet = workbook.getSheet("Sheet1");
	int rownum = sheet.getLastRowNum(); //return number rows
    int colcount = sheet.getRow(0).getLastCellNum(); //Return columns

    System.out.println("Number Rows : " + rownum + ". Number of columns :" + colcount);
    for (int r = 0; r <= rownum;r++)
    {
        XSSFRow row=sheet.getRow(r);
        for(int c=0; c<colcount;c++){
            String value= row.getCell(c).toString();
            System.out.print(value+" | ");
        }
        System.out.println("");
    }
}


	
	
	

	}


