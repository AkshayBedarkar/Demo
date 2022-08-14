package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void ssCapture(WebDriver driver, String name) throws IOException {
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		File source= ss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File (System.getProperty("user.dir")+"\\ScreenShots\\"+name+".png");
	
		FileHandler.copy(source, dest);
		
		
	}

}
