package DataDrivenEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelTwo {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream file=new FileInputStream("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("sheet1");
		
		int row=sheet.getLastRowNum();
		
		for(int r=0;r<=row;r++)
		{
			for(int c=0;c<=2;c++)
			{
				String value=sheet.getRow(r).getCell(c).toString();
				System.out.print(value + " ");
			}
			
			System.out.println(" ");
		}
		
	}

}
