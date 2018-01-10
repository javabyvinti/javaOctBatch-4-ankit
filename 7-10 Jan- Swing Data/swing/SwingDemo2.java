package com.java.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class SwingDemo2 {

	private JFrame frame;
	private JRadioButton rdbtnNewRadioButton;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo2 window = new SwingDemo2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingDemo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JRadioButton first = new JRadioButton("New radio button");
		first.setBounds(39, 56, 109, 23);
		frame.getContentPane().add(first);
		
		JRadioButton second = new JRadioButton("New radio button");
		second.setAlignmentY(Component.TOP_ALIGNMENT);
		second.setBounds(39, 89, 109, 23);
		frame.getContentPane().add(second);
		
		rdbtnNewRadioButton = new JRadioButton("C");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("C++");
		
		JRadioButton rdbtnJava = new JRadioButton("Java");
		
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{rdbtnNewRadioButton, rdbtnNewRadioButton_1, rdbtnJava}));
	
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(first);
		buttonGroup.add(second);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(49, 119, 169, 20);
		frame.getContentPane().add(passwordField);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("On");
		tglbtnNewToggleButton.setBounds(57, 168, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setRows(3);
		textArea.setBounds(39, 207, 240, 44);
		frame.getContentPane().add(textArea);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"first value", "second value", "third value", "fourth value"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(292, 229, 94, -74);
		frame.getContentPane().add(list);
	
	}
}