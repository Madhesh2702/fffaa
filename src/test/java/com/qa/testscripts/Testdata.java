package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.Tutorialspages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdata {
	WebDriver Driver;
	Tutorialspages tpage;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser,String Url){
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver=new ChromeDriver();
			
		}
		if(Browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\GOD\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			Driver=new ChromeDriver();
			
		}
		if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver=new FirefoxDriver();
			
		}
		tpage=new Tutorialspages(Driver);
		Driver.manage().window().maximize();
		Driver.get(Url);
		
	}
	@AfterClass
	public void Teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		Driver.close();
	}
	
}
