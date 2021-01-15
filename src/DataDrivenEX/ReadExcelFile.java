package DataDrivenEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelFile {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream file=new FileInputStream("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		
		System.out.println("value of row is:" +row);
		System.out.println("value of col is:" +col);
		
		for(int r=0;r<=row;r++)
		{
		
			for(int c=0;c<col;c++)
			{
				String value=sheet.getRow(r).getCell(c).toString();
				
				System.out.print(value+ " ");
			}
			
			System.out.println(" ");
		}
		
		
	}

}
