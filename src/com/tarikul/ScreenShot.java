package com.tarikul;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShot {

	public static void main(String[] args) throws AWTException, IOException {
		
		/*Robot robot = new Robot();
		
		String format ="jpg";
		String filename = "myScreenShot."+format;
		Rectangle recatangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenImage = robot.createScreenCapture(recatangle);
		ImageIO.write(screenImage, format, new File(filename));
		System.out.println();
	*/
		 try {
	            Thread.sleep(120);
	            Robot r = new Robot();
	 
	            // It saves screenshot to desired path
	            String path = "C:\\Users\\USER\\Desktop\\screenshot// Shot.jpg";
	 
	            // Used to get ScreenSize and capture image
	            Rectangle capture = 
	            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage Image = r.createScreenCapture(capture);
	            ImageIO.write(Image, "jpg", new File(path));
	            System.out.println("Screenshot saved");
	        }
	        catch (AWTException | IOException | InterruptedException ex) {
	            System.out.println(ex);
	        }

	}

}
