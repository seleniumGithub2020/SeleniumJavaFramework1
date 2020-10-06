package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	XSSFWorkbook workbook;
	XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){
		try{
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch (Exception e) {		
			e.printStackTrace();
		}	
	}
	
	public  int getColCount(){
		
		int colCount = 0;
		
		try{
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of colums:" + colCount);
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return colCount;
	}
	
	public   int getRowCount(){
		int rowcount = 0;
		try {

		 rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : " + rowcount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowcount;
	}	
	
	public   String getCellDataString(int rowNum, int colNum){
		
		String cellData = null;
		try{			

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);			
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}	
	public  void getCellDataNumber(int rowNum, int colNum){
		try{			

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);		
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}