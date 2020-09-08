package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class T11 {
	JFrame main;
	JTable jt;

	public T11() {
		super();
		prepareUI();
	}

	private void prepareUI() {
		main = new JFrame();
		main.setTitle("JTable ");
		main.setSize(500, 500);
		List<List<String>> list =new ArrayList<List<String>>();
		List<String> clist =new ArrayList<String>();
		
		String data[][]= {
				{"asdasd","asdasd1","asdasd"},
				{"asdasd8","asdasd16","asdasd4"}
		};
		String colNames[]= {"A","B","C"};
		Test23 t23= new Test23();
		Object[] c=null;
		Object[][] d=null;
		TableModel tableModel = null;
		try {
			clist = t23.getColumnNames("p");
			int clen = clist.size();
			 //c = clist.toArray();
			list =t23.getData("p");
			
			for(Iterator<List<String>> itr=list.iterator();itr.hasNext();) {
				Object[] fa = new Object[clen];
				for(int i=0;i<clen;i++) {
					fa[i]=itr.next();	
				}
				
				System.out.println(itr.next());
			}
			//Object[][] sa=list.toArray(new Object[][] {});
			//System.out.println("--->"+sa[1][0].toString());
			//System.exit(0);	
			 //d = (Object[][]) list.toArray();
			System.out.println(list);
		tableModel = new DefaultTableModel(null, clist.toArray());	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.exit(0);
		//System.out.println(tableModel);
		jt = new JTable(tableModel);
		jt.setBounds(0,0,100,50);
		
		JScrollPane jp = new JScrollPane(jt);
		main.add(jp);
		
		//main.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		T11 t = new T11();

	}

}
