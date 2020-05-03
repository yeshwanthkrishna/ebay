package Ebayutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import EbayBase.Testbase;

public class EbayDatautil extends Testbase{
	
	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\sai\\eclipse-workspace\\EbayTest\\src\\main\\java\\EbayData\\ebayTestdata.xlsx";
	
	static XSSFWorkbook buk;
	static XSSFSheet sheet1;
	
	
	
	public static Object[][] getTestData(String sheetName){
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			buk = new XSSFWorkbook(file);
		}catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet1 = buk.getSheet(sheetName);
		Object[][] data = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet1.getLastRowNum();i++) {
			for(int k=0; k<sheet1.getRow(0).getLastCellNum();k++)
			{
				data[i][k] = sheet1.getRow(i + 1).getCell(k).toString();
				
			}
		}
		return data;
		
	}

}
