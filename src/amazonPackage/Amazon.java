package amazonPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	
	@Test
	public void Login() throws InterruptedException
	{ 
		System.out.println("Executing Testcase");
		POMClass.Launch("https://www.amazon.com/");
		POMClass.SearchTab().sendKeys("Dell ");
		Thread.sleep(3000);
		POMClass.SearchItem().click();
		Thread.sleep(3000);
		POMClass.OS_Selection().click();
		Thread.sleep(3000);
		POMClass.LaptopSelection().click();
		//Thread.sleep(3000);
		
		WebDriverWait  wait = new WebDriverWait(POMClass.driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(POM_xpath.PP)));
		
		Reporter.log("Found the item");
		
		if (!POMClass.PP().isSelected())
		{
			POMClass.PP().click();
		}

		Assert.assertEquals(POMClass.PP().isSelected(), true);
		
		//POMClass.driver.close();
		
	}
	
}

//jar
//All locators - css
//POM from excel
//testng attributes
// calender
// listners
// scroll bar
// dynamic table - row.size
