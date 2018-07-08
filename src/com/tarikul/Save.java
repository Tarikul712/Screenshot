package com.tarikul;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Save extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Save frame = new Save();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Save() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Name : ");
		lblNewLabel.setBounds(38, 51, 55, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(87, 48, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Location : ");
		lblNewLabel_1.setBounds(32, 102, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBorder(new LineBorder(Color.GREEN));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(191, 189, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBorder(new LineBorder(Color.RED));
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(286, 189, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
