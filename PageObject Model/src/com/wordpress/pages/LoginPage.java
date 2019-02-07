package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class LoginPage {
	
	public LoginPage(WebDriver driver)

	{
		this.driver=driver;
		
	}
	
	
	WebDriver driver;
	
	By username=By.xpath("//input[@id='user_login']");
	By password=By.xpath("//input[@id='user_pass']");
	By loginbutton=By.xpath("//input[@id='wp-submit']");
	
	public void Typeusername()
	
	{
		
		driver.findElement(username).sendKeys("admin");
				
	}
	
public void Typepassword()
	
	{
		
	driver.findElement(password).sendKeys("demo123");
	
	}
	
public void ClickonLoginButton()

{
	driver.findElement(loginbutton).click();;


}

	

}
	