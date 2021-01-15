package DataDrivenEX;

import java.io.IOException;

public class ReadExcelData {
	
	public static void main(String args[]) throws IOException
	{
		ReadExcelDataConfig excel=new ReadExcelDataConfig("/home/cavisson/Documents/docs/Employesheet.xlsx");
		
		System.out.println(excel.getdata(2, 0));
	}

}
