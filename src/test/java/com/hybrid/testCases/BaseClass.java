package com.hybrid.testCases;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.hybrid.pageObjects.LoginPage;
import com.hybrid.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public  static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jajit\\OneDrive - VMware, Inc\\Baseline\\Notes_Daily\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		 driver = new ChromeDriver(options);
				
		driver.manage().window().maximize();
		
		 logger = Logger.getLogger("HybridFramework");
		 PropertyConfigurator.configure("log4j.properties");
	
	}
	

	@AfterClass
	public void tearDown()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.quit();
	}
	

}
