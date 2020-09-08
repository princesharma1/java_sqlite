package com.test;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		File file = new File("D:\\Prince_Kumar\\app\\sel\\jars");
		String[] fileList = file.list();
		StringBuilder s = new StringBuilder();
		for(String str:fileList) {
			//System.out.println(str);
			s.append(str+";");
		}
		System.out.println(s);
		
		
		String ss = "SPLT00000094493";
		System.out.println(ss.startsWith("SPLT"));
	}
	
}
