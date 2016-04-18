package Pages;

import org.openqa.selenium.By;

import BasePages.BusinessBase;

public class LoginPage extends BusinessBase {
	
 
	
	public void Login(String username,String password)
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
	    driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	    
	}
	
	public void Reset(String user,String pass)
	{
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(user);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(user);
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(pass);
	    driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
	    
	}

}
