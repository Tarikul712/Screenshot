package com.tarikul;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Screenshot1 extends JFrame {

	private JPanel contentPane;
	private JButton capture;
	private JButton crop;
	private JButton draw;
	private String outputPath;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  throws AWTException, IOException {
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screenshot1 frame = new Screenshot1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Robot robot = new Robot();
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    BufferedImage screen = robot.createScreenCapture(new Rectangle(screenSize));

	    new ScreenCaptureRectangle(screen);
	}

	/**
	 * Create the frame.
	 */
	public Screenshot1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 97);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GREEN));
		panel.setBounds(5, 11, 359, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		capture = new JButton("Capture");
		capture.setBounds(35, 13, 80, 23);
		capture.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(capture);
		capture .addActionListener(new ClickListener(this));
		add(capture);
		capture.setVisible(true);
		
		
		crop = new JButton("Crop");
		crop.setBounds(138, 13, 75, 23);
		panel.add(crop);
		crop.addActionListener(new Main(this));
		add(crop);
		crop.setVisible(true);
		class CustomActionListener implements ActionListener{
		      public void actionPerformed(ActionEvent e) {
		    	//  crop.setText("Ok Button Clicked.");
		      }
		   }	
		
		draw = new JButton("Drawing");
		draw.setBounds(242, 13, 89, 23);
		panel.add(draw);
	}
	
	public String getOutPath(){
		String path =  "C:\\Users\\USER\\Desktop\\screenshot// Shot.jpg";
		return path;
	}

}
