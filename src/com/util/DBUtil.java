package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection getConnection() {
		Connection conn = null;
		String connUrl = null;
		try {
			Class.forName(Constants.SQLITE_CLASS_NAME);
			connUrl = PropertyUtil.getResourcePropertyByName(Constants.DBPATH, Constants.PROP_FILE_LOCATION,
					Constants.APP_PROP);
			//System.out.println(connUrl);
			conn = DriverManager.getConnection(Constants.SQLITE_JDBC_PRE_URL + connUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
