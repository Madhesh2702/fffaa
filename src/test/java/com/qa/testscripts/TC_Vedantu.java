package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.Vedantupages;

public class TC_Vedantu extends Testdata{
	Vedantupages vpages;
	@Test
	public void Start() {
		vpages=new Vedantupages(Driver);
		Vedantupages.signin.click();
	}

}
