package com.java.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator implements ActionListener{

	private JFrame frame;
	private JLabel resultLabel;
	private JButton addBtn;
	private int firstValue, secondValue;
	private String operationRequest;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
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
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		resultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		resultLabel.setBounds(10, 11, 414, 59);
		frame.getContentPane().add(resultLabel);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(10, 86, 89, 23);
		frame.getContentPane().add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(118, 86, 89, 23);
		frame.getContentPane().add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(231, 86, 89, 23);
		frame.getContentPane().add(nineButton);
		
		JButton fourButton = new JButton("4");
		fourButton.setBounds(10, 131, 89, 23);
		frame.getContentPane().add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(118, 131, 89, 23);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(231, 131, 89, 23);
		frame.getContentPane().add(sixButton);
		
		JButton oneButton = new JButton("1");
		oneButton.setBounds(10, 180, 89, 23);
		frame.getContentPane().add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(118, 180, 89, 23);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(231, 180, 89, 23);
		frame.getContentPane().add(threeButton);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(10, 228, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(118, 228, 89, 23);
		frame.getContentPane().add(zeroButton);
		
		JButton equalBtn = new JButton("=");
		equalBtn.setBounds(231, 228, 89, 23);
		frame.getContentPane().add(equalBtn);
		
		equalBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				secondValue = Integer.parseInt(resultLabel.getText());
				
				switch(operationRequest){
				
				case "+":
					resultLabel.setText(String.valueOf(firstValue + secondValue));
				break;
				
				case "-":
					resultLabel.setText(String.valueOf(firstValue - secondValue));
				break;
				
				case "X":
					resultLabel.setText(String.valueOf(firstValue * secondValue));
				break;
				
				case "/":
					resultLabel.setText(String.valueOf(firstValue / secondValue));
				break;
				
				}
				firstValue = 0;
				secondValue = 0;
			}
		});
		
		addBtn = new JButton("+");
		
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				performOperation(button);
				
			}
		});
		
		addBtn.setBounds(335, 86, 89, 23);
		frame.getContentPane().add(addBtn);
		
		JButton subtractBtn = new JButton("-");
		subtractBtn.setBounds(335, 131, 89, 23);
		frame.getContentPane().add(subtractBtn);
		
		subtractBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				performOperation(button);	
			}
		});
		
		JButton multiplyBtn = new JButton("X");
		multiplyBtn.setBounds(335, 180, 89, 23);
		frame.getContentPane().add(multiplyBtn);

		multiplyBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				performOperation(button);	
			}
		});
		
		JButton divideBtn = new JButton("/");
		divideBtn.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(divideBtn);
	
		divideBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				performOperation(button);	
			}
		});
		
		//second way of attaching listener
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		
		btnClear.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText("");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		buttonClicked(button);
	}
	
	void buttonClicked(JButton jButton){
		
		if(resultLabel.getText().isEmpty()){
			resultLabel.setText(jButton.getText());	
		} else {
			resultLabel.setText(resultLabel.getText().concat(jButton.getText()));
		}
	}	
	
	void performOperation(JButton jbutton){
		firstValue = Integer.parseInt(resultLabel.getText());
		operationRequest = jbutton.getText();
		resultLabel.setText("");
	}
}