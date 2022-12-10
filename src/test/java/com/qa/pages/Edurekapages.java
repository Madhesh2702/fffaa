package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edurekapages {

	 
		WebDriver Driver;

		@FindBy(xpath="/html/body/header/nav/ul/li[5]/span")
		public static WebElement signup;
		@FindBy(xpath="//*[@id=\"sg_popup_email\"]")
		public static WebElement email;
		@FindBy(xpath="//*[@id=\"sg_popup_phone_no\"]")
		public static WebElement phonenum;
		@FindBy(xpath="/html/body/div[6]/div/div/div[2]/div[1]/form/button")
		public static WebElement signupbutton;
		public Edurekapages(WebDriver Driver) {
			   this.Driver=Driver;
			  PageFactory.initElements( Driver,this);
		
	}
}
