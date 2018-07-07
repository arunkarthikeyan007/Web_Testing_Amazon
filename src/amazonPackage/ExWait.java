package amazonPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExWait {
	
	@Test
	public void ExampleWxWait()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Study Materials\\Attachments\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	//Explicit visit
	
	WebElement GButton = driver.findElement(By.xpath(".//*[@id='gb_70']"));
	
	//WebElement  vis = 
	WebDriverWait  wait = new WebDriverWait(driver, 3);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gb_70']")));
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gb_70']")));
	
	//wait.until(ExpectedConditions.titleIs("Google"));
		
	GButton.click();
	
	}

}
