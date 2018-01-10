package com.java.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TicTacToe implements ActionListener {

	private JFrame frame;
	private boolean clicked = false;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	
	boolean activeGame = true;
	
	private Integer winningCondition[][] = {
									// 8X3 = 24 elements
									{0,1,2},
									{3,4,5},
									{6,7,8},
									{0,3,6},
									{1,4,7},
									{2,5,8},
									{0,4,8},
									{2,4,6}
								};
									
	private Integer winningArray[] = {0,0,0, 0,0,0, 0,0}; 
	
	
	// 1,2,3 and 4,5,6 and 7,8,9 and, 1,4,7, 2,5,8 3,6,9 , 1,5,9 , 3, 5, 7
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
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
		
		btn1 = new JButton("");
		btn1.setBounds(88, 60, 50, 40);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("");
		btn2.setBounds(170, 60, 50, 40);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("");
		btn3.setBounds(248, 60, 50, 40);
		frame.getContentPane().add(btn3);
		
		btn4 = new JButton("");
		btn4.setBounds(88, 119, 50, 40);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("");
		btn5.setBounds(170, 119, 50, 40);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("");
		btn6.setBounds(248, 119, 50, 40);
		frame.getContentPane().add(btn6);
		
		btn7 = new JButton("");
		btn7.setBounds(88, 180, 50, 40);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("");
		btn8.setBounds(170, 180, 50, 40);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("");
		btn9.setBounds(248, 180, 50, 40);
		frame.getContentPane().add(btn9);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		buttonClicked(button);
		gameOver(button);
	}
	
	void buttonClicked(JButton jbutton){

		if(jbutton.getText().isEmpty()){
			if(clicked){
				jbutton.setText("X");	
			}else{
				jbutton.setText("O");	
			}
			
			clicked = !clicked;
				
		}
	}
	// 8 possibilities
	void gameOver(JButton button){
		
		
	}
}


