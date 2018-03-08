/**
 * 
 */
package com.WordPress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Rajivkumar
 *
 */
public class WordPressLoginPage {
	
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password = By.cssSelector("#user_pass");
	By loginButton= By.xpath(".//*[@id='wp-submit']");

	
	public WordPressLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	public void LoginWithValidCredentials(String uid, String pass) throws InterruptedException {
		
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		
		Thread.sleep(15);
		
		
		driver.quit();
	}



}
