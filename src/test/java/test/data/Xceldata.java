package test.data;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xceldata {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Admin\\eclipse-workspace\\TestMaven\\src\\main\\resources\\test\\data\\xcel.xlsx");

			Workbook workbook = new XSSFWorkbook(fis);

			Sheet sheet1 = workbook.getSheetAt(0);

			for (Row row : sheet1) {

				for (Cell cell : row) {

					String data = cell.getStringCellValue();
					System.out.print(data+ " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
