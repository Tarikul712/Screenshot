package com.tarikul;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.imageio.ImageIO;

public class ClickListener implements ActionListener {

	private Screenshot1 screenshot1;
	
	public ClickListener(Screenshot1 myScreenCaptureTool) {
		
		this.screenshot1 = myScreenCaptureTool;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Getting the unique file name using java.util.UUID
		final String FILENAME = getUniqueFileName();
		//File Extension
		final String FILE_EXTENSION = ".png";
		
		try {
			
			screenshot1.setVisible(false);
			
			// Delaying the screen capturing for 1 sec. to avoid JFrame to be captured in the screen shot 
			Thread.sleep(1000);
			
			// Invoking the method
			if(captureScreen(screenshot1.getOutPath()+FILENAME+FILE_EXTENSION)) {
				
				screenshot1.setVisible(true);
			} else {
				
				screenshot1.setVisible(true);
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	// Method to get the random Unique file name
	private String getUniqueFileName() {
		
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}

	// Method to capture the screen
	private boolean captureScreen(String fileName) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle screenRectangle = new Rectangle(screenSize);
		
		Robot robot;
		
		try {
		
			robot = new Robot();
			BufferedImage image = robot.createScreenCapture(screenRectangle);
			
			return ImageIO.write(image, "png", new File(fileName));
			
		} catch (AWTException e) {
			
			System.out.println(e.getMessage());
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		
		return false;
	}
	
}