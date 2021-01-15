package DataDrivenEX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelOne {
	
	
	public static void main(String args[]) throws IOException
	{
		File src=new File("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		FileInputStream file=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		int row=sheet.getLastRowNum();
		
		System.out.println("the value of rows is:" +row);
		
		for(int r=0;r<=row;r++)
		{
			String value=sheet.getRow(r).getCell(0).toString();
			System.out.println(value);
		}
	}

}
