package com.test;

import java.util.List;

public class t12 {

	public static void main(String[] args) throws Exception {
		Test23 t23 = new Test23();
		List<List<String>> list = t23.getData("p");
		List<String> clist = t23.getColumnNames("p");
		System.out.println(" 23 : " + list);
		int length = list.size();
		Object[] columnNames = (Object[]) clist.toArray();
		System.out.println(columnNames.length);
		Object[][] olist = new Object[list.size()][2];
		int ia = 0;
		for (List<String> nl : list) {
			olist[ia++] = nl.toArray(new String[nl.size()]);
			// System.out.println(olist);
		}
		Object[] rs = null;
		Object[][] ed = olist;
		for (int y = 0; y < ed.length; y++) {
			rs = ed[y];
			 System.out.println(" --> " + ed[y]);
			if (rs != null) {
				for (int u = 0; u < rs.length; u++) {
					System.out.println(rs[u]);
				}
			}
		}

	}

}
