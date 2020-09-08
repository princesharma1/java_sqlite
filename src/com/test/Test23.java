package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Test23 {
	public static final String DB_URL = "db.url";
	public static final String DB_USER = "db.user";
	public static final String DB_PASSWORD = "db.password";
	public static final String DB_DRIVERCLASS = "db.driverClass";

	public static Connection getconnection() {

		Connection conn = null;
		try {
			Class.forName(getValue(DB_DRIVERCLASS));
			conn = DriverManager.getConnection(getValue(DB_URL), getValue(DB_USER), getValue(DB_PASSWORD));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static List<String> getColumnNames(String tableName) throws ClassNotFoundException {
		List<String> list = new ArrayList<String>();
		try {
			Connection conn = getconnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from " + tableName;
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rd = rs.getMetaData();
			int col = rd.getColumnCount();
			for (int i = 1; i < col; i++) {
				// System.out.print(" "+(i)+" " + rd.getColumnName(i) + " ");
				list.add(rd.getColumnName(i));
			}

		} catch (SQLException sq) {
			sq.printStackTrace();
		}
		return list;

	}

	public static List<List<String>> getData(String tableName) throws Exception {
		List<List<String>> lob = new ArrayList<List<String>>();

		List<String> columns = getColumnNames(tableName);
		/*
		 * System.out.println(columns); for (Iterator<String> itr = columns.iterator();
		 * itr.hasNext();) { System.out.print(itr.next() + " "); }
		 */
		Connection conn = getconnection();
		Statement stmt = conn.createStatement();
		String sql = "select * from " + tableName;
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			List<String> l = new ArrayList<String>();
			for (Iterator<String> itr = columns.iterator(); itr.hasNext();) {

				l.add(rs.getString(itr.next()));
			}
			lob.add(l);
			//System.out.println(lob);
		}

		return lob;

	}

	public static Map<String, String> getProperties(String path) {
		Map<String, String> map = new HashMap<String, String>();
		try (InputStream input = new FileInputStream(path)) {
			Properties prop = new Properties();
			prop.load(input);
			// System.out.println(prop);
			Enumeration<String> e = (Enumeration<String>) prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = e.nextElement();
				String value = prop.getProperty(key);
				// System.out.println(key + " : " + value);
				map.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public static String getValue(String key) throws Exception {
		String value = null;
		Map<String, String> map = getProperties("D:\\Prince_Kumar\\config.properties");
		value = map.get(key);
		if (value == null) {
			throw new Exception("Value of key " + key + " not found");
		}
		return value;
	}

	/*
	 * public static void main(String[] args) throws Exception { List<String> list =
	 * getData("p"); for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
	 * System.out.println(" List: " + itr.next()); } }
	 */

}
