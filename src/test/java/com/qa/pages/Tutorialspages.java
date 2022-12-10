package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tutorialspages  {
            WebDriver Driver;
            
           @FindBy(xpath="/html/body/header/nav/ul/li[5]/span")
           public static WebElement login;
           @FindBy(xpath="//*[@id=\"user_email\"]")
           public static WebElement email;
           @FindBy(xpath="//*[@id=\"user_password\"]")
           public static WebElement pass;
           @FindBy(xpath="//*[@id=\"user_login\"]")
           public static WebElement loginin;
           @FindBy(xpath="//*[@id=\"header\"]/div[1]/table/tbody/tr/td[2]/div[1]/div[1]/div/input")
           public static WebElement Search;
           @FindBy(xpath="//*[@id=\"btnSearch\"]")
           public static WebElement Searchbutton;
           @FindBy(xpath="//*[@id=\"darkModeSwitch\"]/div/div/i[1]")
           public static WebElement theme;
           @FindBy(className = "col-md-9")
           public static WebElement content;

           
           
      
   
            
            
        public Tutorialspages(WebDriver Driver) {
	   this.Driver=Driver;
	  PageFactory.initElements( Driver,this);
   }
            

}
