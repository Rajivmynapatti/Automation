package com.WordPress.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.WordPress.Pages.PageObjectpages;

import Helper.Browserselection;

public class PageObjectTestCases {

	
	
	WebDriver driver;
	
	@Test
	public void Logintest() throws Exception {
		
		driver=Browserselection.startbrowser("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		PageObjectpages login=PageFactory.initElements(driver, PageObjectpages.class);
		
		login.LoginCredentials("admin", "demo123");
		
	}
}
