package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

public class ValidateWordPressLogin {
	
	@Test
	public void verifylogin()
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	
	LoginPage login=new LoginPage(driver);
	
	login.Typeusername();
	login.Typepassword();
	login.ClickonLoginButton();
	driver.quit();

}
}