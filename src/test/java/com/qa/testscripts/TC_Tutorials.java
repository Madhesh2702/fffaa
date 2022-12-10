package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Tutorialspages;

public class TC_Tutorials extends Testdata {
	Tutorialspages spages;
	@Test
	public void Login() throws InterruptedException {
		spages=new Tutorialspages(Driver);
		Tutorialspages.login.click();
		Tutorialspages.email.sendKeys("19L222@kce.ac.in");
		Tutorialspages.pass.sendKeys("w5DW!MRmbbRJ98u");
		Tutorialspages.loginin.click();
		Thread.sleep(5000);
		Tutorialspages.Search.sendKeys("python");
		Thread.sleep(3000);
	    Tutorialspages.Searchbutton.click();
	    Thread.sleep(3000);
	    Tutorialspages.theme.click();
	   String s= Tutorialspages.content.getText(); 
	   System.out.println(s);
		
		
	}

}
