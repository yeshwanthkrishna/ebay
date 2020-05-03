package Ebayutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
File src = new File("C:\\Users\\sai\\eclipse-workspace\\EbayTest\\src\\main\\java"
		+ "\\EbayData\\ebayTestdata.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        XSSFSheet sheet1 = wb.getSheetAt(0);
        
       // String data0 = sheet1.getRow(3).getCell(0).getStringCellValue();
        
        //System.out.println("data from excel is :"+ data0);
       
        int rowcount = sheet1.getLastRowNum();
        System.out.println("total rows is :"+ rowcount);
        
        for(int i=0; i<rowcount; i++)
        {
        	String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
        			
        	System.out.println("Test data from row"+i+" is:"+data0);
        }
        
        
        
        
        wb.close();
	}

}
