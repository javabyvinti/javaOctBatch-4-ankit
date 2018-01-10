package com.java.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;

public class OrderTaking {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderTaking window = new OrderTaking();
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
	public OrderTaking() {
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
		
		JLabel lblFoodOrder = new JLabel("Food Order");
		lblFoodOrder.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFoodOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoodOrder.setBounds(93, 26, 234, 24);
		frame.getContentPane().add(lblFoodOrder);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(82, 61, 46, 14);
		frame.getContentPane().add(lblItem);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(265, 61, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblSno = new JLabel("S.No");
		lblSno.setBounds(26, 61, 46, 14);
		frame.getContentPane().add(lblSno);
		
		JLabel label = new JLabel("1.");
		label.setBounds(26, 86, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel lblBurger = new JLabel("Burger");
		lblBurger.setBounds(82, 86, 46, 14);
		frame.getContentPane().add(lblBurger);
		
		JLabel lblTea = new JLabel("Tea");
		lblTea.setBounds(82, 115, 46, 14);
		frame.getContentPane().add(lblTea);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setBounds(26, 115, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setBounds(26, 140, 46, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblCoffee = new JLabel("Coffee");
		lblCoffee.setBounds(82, 140, 46, 14);
		frame.getContentPane().add(lblCoffee);
		
		JLabel burgerPrice = new JLabel("30");
		burgerPrice.setBounds(265, 86, 46, 14);
		frame.getContentPane().add(burgerPrice);
		
		JLabel teaPrice = new JLabel("10");
		teaPrice.setBounds(265, 115, 46, 14);
		frame.getContentPane().add(teaPrice);
		
		JLabel coffeePrice = new JLabel("20");
		coffeePrice.setBounds(265, 140, 46, 14);
		frame.getContentPane().add(coffeePrice);
		
		JComboBox burgerComboBox = new JComboBox();
		burgerComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		burgerComboBox.setBounds(321, 83, 52, 20);
		frame.getContentPane().add(burgerComboBox);
		
				
		JComboBox TeaComboBox = new JComboBox();
		TeaComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		TeaComboBox.setBounds(321, 112, 52, 20);
		frame.getContentPane().add(TeaComboBox);
		
		JComboBox CoffeeComboBox = new JComboBox();
		CoffeeComboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		CoffeeComboBox.setBounds(321, 137, 52, 20);
		frame.getContentPane().add(CoffeeComboBox);
		
		JLabel totalLabel = new JLabel("");
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalLabel.setBounds(122, 237, 189, 14);
		frame.getContentPane().add(totalLabel);
		
		
		JButton btnCheckTotal = new JButton("Check Total");
	
		btnCheckTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int burgerTotalPrice = Integer.parseInt(burgerPrice.getText()) * burgerComboBox.getSelectedIndex();
				int teaTotalPrice = Integer.parseInt(teaPrice.getText()) * TeaComboBox.getSelectedIndex();
				int coffeeTotalPrice = Integer.parseInt(coffeePrice.getText()) * CoffeeComboBox.getSelectedIndex();
				
				totalLabel.setText("Your total is = " + (burgerTotalPrice + teaTotalPrice + coffeeTotalPrice));
				
			}
		});
		btnCheckTotal.setBounds(164, 184, 117, 23);
		frame.getContentPane().add(btnCheckTotal);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(323, 61, 89, 14);
		frame.getContentPane().add(lblQuantity);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"Burger", "Tea", "Coffee"}));
		spinner.setBounds(308, 168, 65, 20);
		frame.getContentPane().add(spinner);
		
	}
}