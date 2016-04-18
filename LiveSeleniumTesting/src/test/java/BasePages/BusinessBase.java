package BasePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BusinessBase {

public static WebDriver driver;
	
	public BusinessBase()
	{
	if(driver == null)
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(50L, TimeUnit.SECONDS);
	}
}

}

