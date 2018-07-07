package amazonPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonSample {
	
	@Test
	public void Sample(){
		System.out.println("Executing Testcase");
		Reporter.log("Found the item");
		
	}

}
