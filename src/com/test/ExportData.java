package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportData {
	

	public static String createSheet(String path,String tableName) throws IOException {
		XSSFWorkbook wb1 = new XSSFWorkbook();
		XSSFSheet sheet = wb1.createSheet("Rcrd");
		XSSFRow row;

		Map<String, Object[]> map = new TreeMap<String, Object[]>();
		Test23 t23 = new Test23();
		List<List<String>> list=null;
		List<String> clist=null;
		try {
			list = t23.getData(tableName);
			clist=t23.getColumnNames(tableName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int length=list.size();
		Object[] columnNames=(Object[]) clist.toArray();
		map.put("0",columnNames);
		System.out.println("0000=== " + columnNames);
		Object[][] olist = new Object[list.size()][];
		int ia=0;
		for(List<String> nl:list) {
			olist[ia]=nl.toArray(new String[nl.size()]);
			System.out.println(olist);
			map.put((ia+1)+"", olist[ia]);
			System.out.println("--> " + (ia));
			ia++;
		}
		System.out.println(map);
		
		
		/*
		 * map.put("1", new Object[] { "ID", "NAME", "AGE" }); for(int i=2;i<8;i++) {
		 * map.put(i+"", new Object[] { "ID"+i, "NAME"+i, (20+i)+"" });
		 * 
		 * }
		 */
		
		Set<String> keyid = map.keySet();
		int rowid=0;
		
		for(String key:keyid) {
			row=sheet.createRow(rowid++);
			Object[] objArr = map.get(key);
			
			int cellid=0;
			for(Object obj:objArr) {
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
		}
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
        wb1.write(fos);
        fos.close();
		return "";

	}

	public static void main(String[] args) throws IOException {
		String pt = "D:\\Prince_Kumar\\excel\\abc.xlsx";
		createSheet(pt,"user_master");

	}

}
