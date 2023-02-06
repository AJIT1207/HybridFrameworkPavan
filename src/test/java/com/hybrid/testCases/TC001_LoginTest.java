package com.hybrid.testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hybrid.pageObjects.LoginPage;

public class TC001_LoginTest extends BaseClass

{

	@Test
	public void loginTest()
	{
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage l  = new LoginPage(driver);	
		l.setUsername(username);
		logger.info("Username entered");
		l.setPassword(password);
		logger.info("password entered");
		l.login();
		logger.info("Application opened successfully");
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
