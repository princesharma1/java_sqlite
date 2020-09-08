package com.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;

public class ShowData {
	private JFrame mainFrame;
	private JPanel contentPane;

	private ShowData() {
		prepareGui();
	}

	private void prepareGui() {
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		mainFrame = new JFrame("Show Data");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new GridLayout());
		
		contentPane=new JPanel();
		contentPane.setLayout(new FlowLayout());
		contentPane.setToolTipText("Content Pane");
		contentPane.setBorder(BorderFactory.createEmptyBorder());
		
		JScrollPane jsPane = new JScrollPane();
		jsPane.setVisible(true);
		
		
		Test23 t23 = new Test23();
		List<List<String>> list=null;
		List<String> clist=null;
		try {
			list = t23.getData("p");
			clist=t23.getColumnNames("p");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int length=list.size();
		Object[] columnNames=(Object[]) clist.toArray();
		System.out.println("0000=== " + columnNames);
		Object[][] olist = new Object[length][];
		int ia=0;
		for(List<String> nl:list) {
			olist[ia++]=nl.toArray(new String[nl.size()]);
			System.out.println(olist);
		}
		
		JTable jTable = new JTable(olist,columnNames);  
		JTableHeader header = jTable.getTableHeader();
		jTable.setBounds(30, 40, 200, 300); 
		jTable.setBorder(border);
		contentPane.add(header);
		contentPane.add(jTable);
		//jsPane.add(jTable);
		//mainFrame.add(jsPane);
		mainFrame.add(contentPane);
		mainFrame.setVisible(true);

	}

	public static void main(String[] args) {
		ShowData sd = new ShowData();

	}
	
	

}
