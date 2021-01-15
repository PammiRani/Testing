package DataDrivenEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadInputFile {
	
	public static void main(String args[]) throws IOException 
	{
		File src=new File("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		FileInputStream file=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("sheet1"); 
		
	    String  data=sheet.getRow(1).getCell(0).toString();
		
		System.out.println(data);
		
	}

}
