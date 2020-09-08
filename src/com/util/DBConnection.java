package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static DBConnection instance;
	private Connection connection;

	private DBConnection() throws Exception {
		String connUrl = null;
		try {
			Class.forName(Constants.SQLITE_CLASS_NAME);
			connUrl = PropertyUtil.getResourcePropertyByName(Constants.DBPATH, Constants.PROP_FILE_LOCATION,
					Constants.APP_PROP);
			System.out.println("JDBC URL: " + Constants.SQLITE_JDBC_PRE_URL + connUrl);
			this.connection = DriverManager.getConnection(Constants.SQLITE_JDBC_PRE_URL + connUrl);
			System.out.println("Database Connected");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (this.connection != null) {
				this.connection.close();
			}
		}

	}

	public Connection getConnection() {
		return connection;
	}

	public static DBConnection getInstance() throws Exception {
		if (instance == null) {
			/*synchronized (DBConnection.class) {
				if (instance == null) {*/
					instance = new DBConnection();
			/*
			 * } }
			 */
		}
		return instance;
	}   

}
