package com.test;

import java.awt.Color;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;

public class TestGui  {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JPanel contentPane;

	public TestGui() {
		prepareGui();
	}

	private void prepareGui() {
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		mainFrame = new JFrame("New Window");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new GridLayout(3, 1));

		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);
		headerLabel.setText("Header");
		headerLabel.setBorder(border);
		
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		controlPanel = new JPanel();
		controlPanel.setBorder(border);
 
		contentPane = new JPanel();
		contentPane.setBorder(border);
 
		
		mainFrame.add(headerLabel);
		mainFrame.add(statusLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(contentPane);
		mainFrame.setVisible(true);
	}

	private void showEventDemo() {
		JButton okbtn = new JButton("OK");
		JButton max = new JButton("Maximize Screen");
		JButton cancelBtn = new JButton("Cancel");
		okbtn.setActionCommand("OK");
		max.setActionCommand("maximize");
		cancelBtn.setActionCommand("Cancel");
		max.addActionListener(new ButtonListener());
		okbtn.addActionListener(new ButtonListener());
		cancelBtn.addActionListener(new ButtonListener());
		controlPanel.add(okbtn);
		controlPanel.add(cancelBtn);
		controlPanel.add(max);
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) {
		TestGui t = new TestGui();
		t.showEventDemo();

	}

	private class ButtonListener implements ActionListener

	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			statusLabel.setText(command);
			StringBuilder sb = new StringBuilder();
			if(command.equalsIgnoreCase("maximize")) {
				mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}else if(command.equalsIgnoreCase("ok")) {
				Test23 t23 = new Test23();
				List<String> list;
				
				try {
					
					  list = t23.getColumnNames("project"); 
					  //for(Iterator<String>
					  //itr=list.iterator();itr.hasNext();) { 
						  //System.out.println(" List: " + itr.next()); 
						 // sb.append(itr.hasNext());
					  
					 // }
					 
					
					String[][] rec = {
					         { "1", "Steve", "AUS" },
					         { "2", "Virat", "IND" },
					         { "3", "Kane", "NZ" },
					         { "4", "David", "AUS" },
					         { "5", "Ben", "ENG" },
					         { "6", "Eion", "ENG" },
					      };
					Object rec1[][]=new Object[23][23];
					      String[] header = { "Rank", "Player", "Country" };
					      Object[] olist = list.toArray();
					      System.out.println(olist.length);
						JTable jTable = new JTable(rec1,olist);   
					controlPanel.add(jTable);
					//statusLabel.setText(sb.toString());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}

		}
	}

}
