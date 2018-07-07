package amazonPackage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon_Dept {
	
	@Test
	public void Dept() throws InterruptedException {
		POMClass.Launch("https://www.amazon.com/");
		
		Actions builder = new Actions(POMClass.driver);
		builder.moveToElement(POMClass.DeptMain()).build().perform();
		Thread.sleep(5000);
		builder.moveToElement(POMClass.DeptSub()).build().perform();
		Thread.sleep(5000);
		builder.moveToElement(POMClass.DeptSub2()).build().perform();
		Thread.sleep(5000);
		POMClass.DeptSub().click();
		
	
		
	}

}
