package com.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {

	public Properties getResourceProperties(String path,String fileName) throws Exception{
		InputStream inputStream=null;
		Properties prop = new Properties();
		try{
			inputStream = getClass().getClassLoader().getResourceAsStream(path+fileName);
			if(null!=inputStream){
				prop.load(inputStream);
			}else{
				throw new Exception("Property file: " + fileName + " is not found at loacation " + path);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String getResourcePropertyByName(String propName,String path, String fileName) throws Exception {
		String propValue=null;
		Properties prop = new Properties();
		PropertyUtil p = new PropertyUtil();
		prop = p.getResourceProperties(path, fileName);
		if(null!=prop){
			propValue = prop.getProperty(propName);
		}else
		{
			throw new Exception("Prop Value is not found in " + fileName);
		}
		return propValue;
		
	}
	
	/*
	 * public static void main(String[] args) throws Exception { PropertyUtil p =
	 * new PropertyUtil(); System.out.println(p.getResourceProperties("resources/",
	 * "app.properties"));
	 * System.out.println(p.getResourcePropertyByName("dbpath","resources/",
	 * "app.properties")); }
	 */


}
