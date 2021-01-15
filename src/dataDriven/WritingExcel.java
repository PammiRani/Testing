package dataDriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {
	
	public static void main(String args[]) throws IOException
	{
		FileOutputStream file=new FileOutputStream("/home/cavisson/Documents/docs/readexcel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("sheet2");
		
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<3;j++)
				
			{
				//row.createCell(j).setCellValue("pammi");
				row.createCell(j).setCellValue((int)(Math.random()*100));
			}
		}
		
		workbook.write(file);
		
		System.out.println("writing is completed");
	}

}
