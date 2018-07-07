package amazonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {
	
	@Test
	public void Cal() throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver","D:\\Study Materials\\geckodriverFF\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","D:\\Study Materials\\Attachments\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");
		
		driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
		Thread.sleep(2000);
	
	//	Assert.assertEquals("may",driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText());
		
				
		while(!(driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText().equals("May") && driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[2]")).getText().equals("2019") ))
		{
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]")).click();	
		}

		driver.findElement(By.xpath("//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()='"
				+ "18" + "']")).click();

}
}


//http://www.techbeamers.com/handle-date-time-picker-control-using-webdriver/

//http://jqueryui.com/droppable/


//Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[5]/div/div/div[1]/select")));
		//dropdown.selectByIndex(6);
