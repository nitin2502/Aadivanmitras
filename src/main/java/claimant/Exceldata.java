package claimant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\niting\\Documents\\Excelseluse.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		int lastRow = sheet.getLastRowNum();
		for(int i=1; i<=lastRow; i++){
		Row row = sheet.getRow(i);
		Cell cell = row.createCell(2);		cell.setCellValue("32");
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\niting\\Documents\\Excelseluse.xlsx");
		workbook.write(fos);
		fos.close();
		}
		}