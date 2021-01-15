package DataDrivenEX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ReadExcelDataConfig(String excelpath) throws IOException 
	{
		FileInputStream file=new FileInputStream(excelpath);
		 wb=new XSSFWorkbook(file);
		sheet=wb.getSheet("sheet1");
		
	}
	
	public String getdata(int row,int col)
	{
		String value=sheet.getRow(row).getCell(col).toString();
		return value;
	}

}
