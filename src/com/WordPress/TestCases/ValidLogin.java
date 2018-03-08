package com.WordPress.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.WordPress.Pages.WordPressLoginPage;

import Helper.Browserselection;

public class ValidLogin {

	
	WebDriver driver;
	@Test
	public void login() throws Exception {
		
		driver= Browserselection.startbrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		WordPressLoginPage login = new WordPressLoginPage(driver);
		
		login.LoginWithValidCredentials("ADMIN", "demo123");
		
	}
}
