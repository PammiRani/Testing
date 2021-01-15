package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream file=new FileInputStream("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//Counting rows
		
		int rows=sheet.getLastRowNum(); //return number of rows
		int col=sheet.getRow(0).getLastCellNum(); //return number of cell present in rows
		
		System.out.println(rows);
		System.out.println(col);
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow rownum=sheet.getRow(r);
			
			for(int c=0;c<col;c++)
			{
				String value=rownum.getCell(c).toString(); //tostring will read all type of data like numeric,alphabet etc.
				System.out.print(value+ "  ");
			}
			
			System.out.println("  ");
		}
		
	}

}
