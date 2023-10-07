package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		System.out.println(currentDir);
		File studentDetailsFile = new File(currentDir+"\\src\\iostreams\\Test.xlsx");
		FileInputStream fis = new FileInputStream(studentDetailsFile);  //
//		xls,		xlsx
		
//		HSSFWorkbook xlsWorkBook = new HSSFWorkbook(fis);  //xls
		
		XSSFWorkbook xlsxWorkBook = new XSSFWorkbook(fis);  //xlsx
		
		XSSFSheet sheet1 = xlsxWorkBook.getSheet("Sheet1");
		
		Iterator<Row> allRows = sheet1.rowIterator();
		
		while(allRows.hasNext()) {
			Row eachRow = allRows.next();
			
			Iterator<Cell> allCells = eachRow.cellIterator();
			
			while(allCells.hasNext()) {
				Cell eachCell = allCells.next();
				
				if(eachCell.getCellType() == eachCell.CELL_TYPE_NUMERIC) {
					System.out.println(eachCell.getNumericCellValue()); ;
				}
				
				if(eachCell.getCellType() == eachCell.CELL_TYPE_STRING) {
					System.out.println(eachCell.getStringCellValue()); ;
				}				
			}
			
		}
	
	}

}
