package com.mercurytours.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mercurytours.pages.LoginPage;

public class ValidateLogin {
	
	@Test
	public void checkValidLogin()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.14.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		LoginPage Login_page=PageFactory.initElements(driver, LoginPage.class);
		Login_page.mercurytours_login("mercury", "mercury");
		driver.quit();
		
		
	}

}
