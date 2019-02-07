package com.mercurytours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	
@FindBy(how=How.NAME, using ="userName")
WebElement username;

@FindBy(how=How.NAME, using ="password")
WebElement password;

@FindBy(how=How.XPATH, using = "//input[@value='Login']")
WebElement loginbutton;


public void mercurytours_login(String uid, String pass)

{
	
	username.sendKeys(uid);
	password.sendKeys(pass);
	loginbutton.click();

}
}
