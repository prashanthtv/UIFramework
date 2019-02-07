package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPostPage {

	
public NewPostPage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	
	
	WebDriver driver;
	By PostLink=By.xpath("//div[contains(text(),'Posts')]");
	By AddNewPost= By.xpath("//a[@href='post-new.php']");
	By TypeTitle=By.xpath("//input[@id='title']");
	By AddPost=By.xpath("//input[@id='save-post']");
	
	
	public void ClickPost()
	
	{
		driver.findElement(PostLink).click();;
		
	}
	
public void ClickAddNewkPost()
	
	{
		driver.findElement(AddNewPost).click();;
	
	}
	
	
public void TypeTitle()

{
	driver.findElement(TypeTitle).sendKeys("Happiestmindstest1");
		}
	

public void ClickAddPost()

{
	driver.findElement(AddPost).click();;
	
}

	}


