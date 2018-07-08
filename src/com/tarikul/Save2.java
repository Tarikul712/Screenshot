package com.tarikul;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;



import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.util.Collections;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class Save2 extends JDialog {

	private JPanel contentPane;
	public JTextField nameTextField;
	public JTextField locationTextField;
	public JLabel statusLabel;
	public JFileChooser chooser;
	public String choosertitle;
	public static String path;
	public static JTree tree;
	private File dirPath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Save2 save = new Save2();
					save.setModal(true);
					save.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Save2() {
		
        setBounds(100, 100, 450, 250);
		setTitle("Save");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel headingPanel = new JPanel();
		headingPanel.setBounds(12, 0, 426, 49);
		contentPane.add(headingPanel);
		headingPanel.setLayout(null);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

		/*
		 * JLabel lblNewProject = new JLabel("New Project"); lblNewProject.setBounds(12,
		 * 0, 96, 22); panel.add(lblNewProject);
		 */
		JPanel informationPanel = new JPanel();
		informationPanel.setBounds(12, 40, 426, 188);
		contentPane.add(informationPanel);
		informationPanel.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 10, 80, 25);
		informationPanel.add(lblName);

		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(12, 39, 80, 25);
		informationPanel.add(lblLocation);

		

		nameTextField = new JTextField();
		nameTextField.setBounds(114, 10, 300, 25);
		informationPanel.add(nameTextField);
		nameTextField.setColumns(10);

		locationTextField = new JTextField();
		locationTextField.setColumns(10);
		locationTextField.setBounds(114, 39, 182, 25);
		informationPanel.add(locationTextField);

		JButton browseButton = new JButton("Browse");
		browseButton.setBounds(308, 39, 105, 25);
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooser = new JFileChooser();
				chooser.setCurrentDirectory(new java.io.File("."));
				chooser.setDialogTitle(choosertitle);
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

				// chooser.setAcceptAllFileFilterUsed(false);

				if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
					System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
				} else {
					System.out.println("No Selection ");
				}
				// String location=;
				locationTextField.setText(chooser.getSelectedFile().toString());
			}
		});

		informationPanel.add(browseButton);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(12, 130, 426, 40);
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(null);

		//Action okAction = new NewProjectOkAction("Ok");
        //JButton saveButton = new JButton(okAction);
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(228, 15, 87, 23);
		saveButton.setVisible(true);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String projectName = nameTextField.getText().toString();
				String projectLocation = locationTextField.getText().toString();

				if (projectName.equals("")) {
					statusLabel.setText("Please enter a project name");
				} else if (projectLocation.equals("")) {
					statusLabel.setText("Please select a project location");
				} 
				dispose();
				

			}
		});

		buttonPanel.add(saveButton);

		JButton cancleButton = new JButton("Cancel");
		cancleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		cancleButton.setBounds(327, 15, 87, 23);
		buttonPanel.add(cancleButton);
		cancleButton.setVisible(true);
	}
}