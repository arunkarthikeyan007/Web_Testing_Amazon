package amazonPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KendoCalender {
	@Test
	public void KendoCal() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Study Materials\\Attachments\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demos.telerik.com/kendo-ui/datetimepicker/index");
	
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector(".k-icon.k-i-calendar")).click();
		driver.findElement(By.xpath(".//*[@id='example']/div/span/span/span[2]/span[1]/span")).click();
		Thread.sleep(5000);
		
		WebElement table = driver.findElement(By.className("k-content"));
		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
		System.out.println(tableRows.get(1));
		
		
		for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));

			for (WebElement cell : cells) {
				if (cell.getText().equals("16")) {
					driver.findElement(By.linkText("16")).click();
				}
			}
		}
		
	
		// "// for td
		//cell.click

		
	}

	}
