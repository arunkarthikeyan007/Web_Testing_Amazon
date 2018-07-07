package amazonPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


public class AmazonScreenshot {
	
	@Test
	public void Screenshot() throws IOException{
		POMClass.Launch("https://www.amazon.com/");
		
		TakesScreenshot ts=(TakesScreenshot)POMClass.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(source, new File("./Screenshots/"+"TestScreenshot"+".png"));
		
	}

}
