package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;
import com.wordpress.pages.NewPostPage;

public class ValidateWordpressPost {

	
	@Test
	public void validatePost() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		NewPostPage post=new NewPostPage(driver);
		LoginPage login=new LoginPage(driver);
		login.Typeusername();
		login.Typepassword();
		Thread.sleep(5000);
		login.ClickonLoginButton();
		post.ClickPost();
		post.ClickAddNewkPost();
		post.TypeTitle();
		post.ClickAddPost();
		
	}
	
	
}
