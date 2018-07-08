package com.tarikul;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Screenshot2 extends JFrame {

	Save2 save =new Save2();
	private JPanel contentPane;
	private Image img;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screenshot2 frame = new Screenshot2();
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
	public Screenshot2() {				

		
		setTitle("screenshot");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 122);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCapture = new JButton("");
		btnCapture.setVerticalAlignment(SwingConstants.BOTTOM);
		Image img = new ImageIcon(this.getClass().getResource("/capture.png")).getImage();
		btnCapture.setIcon(new ImageIcon(img));
		btnCapture.setBounds(10, 22, 72, 33);
	    
		contentPane.add(btnCapture);
		btnCapture.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
			 try {
				   Save2 save= new Save2();
				    //save.add();
				    save.setVisible(true);
		           /* String format = "jpg";
		            String fileName = "FullScreenshot." + format;*/
		            Robot robot = new Robot();
		            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		           // ImageIO.write(screenFullImage, format, new File(fileName));
		           
		           
		            System.out.println("A full screenshot saved!");
		        } catch (AWTException ex) {
		        	
		        
		            System.err.println(ex);
		        }
		        }
		        
		    });
		
		
		
		JButton btnCrop = new JButton("");
		 img = new ImageIcon(this.getClass().getResource("/Crop.png")).getImage();
		btnCrop.setIcon(new ImageIcon(img));
		//btnCrop.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\screenshot\\Crop.png"));
		btnCrop.setHorizontalAlignment(SwingConstants.LEFT);
		btnCrop.setBounds(116, 22, 57, 33);
		contentPane.add(btnCrop);
		
		JButton btnDrawing = new JButton("");
		 img = new ImageIcon(this.getClass().getResource("/blackboard-drawing-icon.png")).getImage();
		btnDrawing.setIcon(new ImageIcon(img));
		//btnDrawing.setIcon(new ImageIcon("C:\\Users\\USER\\Desktop\\screenshot\\blackboard-drawing-icon.png"));
		btnDrawing.setHorizontalAlignment(SwingConstants.LEFT);
		btnDrawing.setBounds(206, 22, 72, 33);
		contentPane.add(btnDrawing);
		
		JLabel lblNewLabel = new JLabel("   capture                      crop                      drawing");
		lblNewLabel.setBounds(20, 58, 258, 14);
		contentPane.add(lblNewLabel);
	}
}
