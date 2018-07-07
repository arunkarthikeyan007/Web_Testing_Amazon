package amazonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class POMClass {
	
	public static WebDriver driver;
	
		public static void Launch(String URL) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\Study Materials\\geckodriverFF\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
		}
		//driver.findElement(By.id("departureDate")).click();
		public static WebElement SearchTab()
		{
			return driver.findElement(By.xpath(POM_xpath.var_OS_Selection));
			
		}
	
		public static WebElement SearchItem()
		{
			return driver.findElement(By.xpath(".//*[@id='issDiv0']"));
			
		}

		public static WebElement OS_Selection()
		{
			return driver.findElement(By.xpath(".//*[@id='leftNavContainer']/ul[6]/div/li[3]/span/span/div/label/input"));
			
		}
		
		public static WebElement LaptopSelection()
		{
			return driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
			
		}

		public static WebElement PP()
		{
			return driver.findElement(By.xpath(POM_xpath.PP));
			
		}
		
		public static WebElement DeptMain()
		{
			return driver.findElement(By.xpath(POM_xpath.DeptMain));
			
		}
		
		public static WebElement DeptSub()
		{
			return driver.findElement(By.xpath(POM_xpath.DeptSub));
			
		}
		
		public static WebElement DeptSub2()
		{
			return driver.findElement(By.xpath(POM_xpath.DeptSub2));
			
		}

}

