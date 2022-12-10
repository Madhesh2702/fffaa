package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vedantupages {
	WebDriver Driver;

	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div[3]/header/div/div/div[3]/div/button")
	public static WebElement signin;
	
	
	public Vedantupages(WebDriver Driver) {
		   this.Driver=Driver;
		  PageFactory.initElements( Driver,this);
	}
}
