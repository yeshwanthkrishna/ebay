package Ebayutil;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import EbayBase.Testbase;

public class Exceldataconfig extends Testbase{
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Exceldataconfig(String excelpath)
	{
		try {
			File src = new File(excelpath);
			
			FileInputStream fis = new FileInputStream(src);

      wb  = new XSSFWorkbook(fis);
			
     
		
		}  catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
public Object getData1(int i, int i2, int column) {
		
		sheet1 = wb.getSheetAt(0);
		String data = sheet1.getRow(i).getCell(column).getStringCellValue();
		
		return data;
	}
	
	
	public int getRowCount(int sheetIndex) {
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;
		return row;
	}

	

}
