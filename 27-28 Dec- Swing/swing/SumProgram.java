package com.java.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SumProgram {

	private JFrame frame;
	private JTextField firstTextField;
	private JTextField secondTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumProgram window = new SumProgram();
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
	public SumProgram() {
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
		
		JLabel titleLabel = new JLabel("Add Values");
		titleLabel.setForeground(new Color(0, 128, 128));
		titleLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(112, 28, 178, 14);
		frame.getContentPane().add(titleLabel);
		
		JLabel lblNewLabel = new JLabel("First Value");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 77, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSecondValue = new JLabel("Second Value");
		lblSecondValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondValue.setBounds(52, 121, 112, 14);
		frame.getContentPane().add(lblSecondValue);
		
		firstTextField = new JTextField();
		firstTextField.setBounds(204, 76, 156, 20);
		frame.getContentPane().add(firstTextField);
		firstTextField.setColumns(10);
		
		secondTextField = new JTextField();
		secondTextField.setColumns(10);
		secondTextField.setBounds(204, 120, 156, 20);
		frame.getContentPane().add(secondTextField);
	
		JLabel resultLabel = new JLabel("");
		resultLabel.setBounds(182, 220, 100, 14);
		frame.getContentPane().add(resultLabel);
	
		
		JButton btnCheckResult = new JButton("Check Result");
		btnCheckResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int first = Integer.parseInt(firstTextField.getText());
				int second = Integer.parseInt(secondTextField.getText());
				
				int result = first + second;
				
				resultLabel.setText("Sum is= " + result);
			}
		});
		
		
	
		
		btnCheckResult.setBounds(149, 172, 112, 23);
		frame.getContentPane().add(btnCheckResult);
		
	
		
	}
}
