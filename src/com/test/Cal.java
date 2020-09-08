package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

enum Days{
	Sun(1),Mon(2),Tue(3),Wed(4),Thu(5),Fri(6),Sat(7);
	private int dval;

	public int getDval() {
		return dval;
	}

	private Days(int dval) {
		this.dval = dval;
	}
	
}
enum Month{
	Jan(1),Feb(2),Mar(3),Apr(4),May(5),Jun(6),Jul(7),Aug(8),Sep(9),Oct(10),Nov(11),Dec(12);
	private int mval;

	public int getMval() {
		return mval;
	}

	private Month(int mval) {
		this.mval = mval;
	}
	
}
enum Month31days{
	Jan,Mar,May,Jul,Aug,Oct,Dec
}
enum Month30days{
	Apr,Jun,Sep,Nov
}
public class Cal {
	
	private static boolean isLeappYear(int year){
		if(year%4==0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private static int getFebDays(boolean leapYear) {
		if(leapYear)
			return 29;
		return 28;
	}
	private static String getTodayDate() {
		LocalDate l = LocalDate.now();
		return l.toString();
	}
	public static void main(String[] args) {
		String day=getTodayDate().split("-")[2];
		String month=getTodayDate().split("-")[1];
		String year=getTodayDate().split("-")[0];
		
		
	}

}
