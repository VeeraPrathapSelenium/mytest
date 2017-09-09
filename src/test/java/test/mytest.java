package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mytest {
	
	@Test
	
	public static void startTest()
	{
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://demo.nopcommerce.com/register");
		
		
		
		driver.manage().window().maximize();
		
		
	}

}
