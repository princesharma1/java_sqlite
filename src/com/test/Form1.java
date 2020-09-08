package com.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Form1 {
	private JFrame mainFrame;
	private JPanel contentPane;
	private JLabel statusLabel;
	private JComboBox jc1;
	private JButton b1;

	public Form1() {
		prepareUI();
	}

	private void prepareUI() {
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		mainFrame = new JFrame();
		mainFrame.setLayout(new GridLayout(5, 1));
		mainFrame.setTitle("Form data");
		mainFrame.setSize(600, 600);

		b1 = new JButton("Show");

		String[] items = { "A", "B", "C", "D" };
		jc1 = new JComboBox(items);
		jc1.setSize(100, 30);

		statusLabel = new JLabel("Status Label", JLabel.CENTER);
		statusLabel.setSize(400, 100);
		statusLabel.setBorder(border);

		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(jc1);

		contentPane.add(b1);
		mainFrame.add(contentPane);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String d = "Data: " + jc1.getItemAt(jc1.getSelectedIndex());
				statusLabel.setText(d);

			}
		});

	}

	public static void main(String[] args) {
		Form1 f1 = new Form1();
	}

}
