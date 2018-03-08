package com.WordPress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageObjectpages {

	
	WebDriver driver;
	
	
	public PageObjectpages(WebDriver driver) {
		this.driver= driver;
	}
	
	@FindBy(id="user_login") 
	@CacheLookup
	WebElement username; 
	
	@FindBy(xpath=".//*[@id='user_pass']")
	@CacheLookup
	WebElement password;
	
	@FindBy(name="wp-submit")
	@CacheLookup
	WebElement loginbutton;
	
	public void LoginCredentials(String uid, String Pass) {
		
		username.sendKeys(uid);
		password.sendKeys(Pass);
		loginbutton.click();
	}


	
	
}
