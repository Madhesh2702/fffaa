package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Edurekapages;

public class TC_Edureka extends Testdata {
	Edurekapages epages;
	@Test
	public void starting() throws InterruptedException {
		epages=new Edurekapages(Driver);
		Thread.sleep(3000);
		Edurekapages.signup.click();
		Edurekapages.email.sendKeys("19L250@kce.ac.in");
		Edurekapages.phonenum.sendKeys("8870604426");
		Edurekapages.signupbutton.click();
		Thread.sleep(20000);
	}
	

}
