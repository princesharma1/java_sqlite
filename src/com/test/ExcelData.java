package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	static String path = "D:\\Prince_Kumar\\cb1.xlsx";

	public static void main(String[] args) throws Exception {

		File file = new File(path);
		FileInputStream fin = new FileInputStream(file);
		XSSFWorkbook wb1 = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb1.getSheetAt(0);

		Iterator<Row> itr = sheet.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Row row = itr.next();
			Iterator<Cell> citr = row.cellIterator();
			if (i == 0) {
				while (citr.hasNext()) {
					Cell cell = citr.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "---> ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + " --> ");
						break;
					}

				}

			} else {
				while (citr.hasNext()) {
					Cell cell = citr.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + " ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + " ");
						break;
					}

				}

			}
			i++;

			System.out.println();
		}
		fin.close();

	}

}
