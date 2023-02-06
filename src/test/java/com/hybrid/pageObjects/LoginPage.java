package com.hybrid.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver localdriver;
	
	public LoginPage(WebDriver rightdriver) {
		
		localdriver = rightdriver;
		
		PageFactory.initElements(rightdriver, this);
		
	}
	
	
	@FindBy(xpath="//*[@name='uid']")
	@CacheLookup
	WebElement txtusername;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUsername(String uname)
	{
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String upassword)
	{
		txtpassword.sendKeys(upassword);
	}
	
	public void login()
	{
		btnLogin.click();
	}
}