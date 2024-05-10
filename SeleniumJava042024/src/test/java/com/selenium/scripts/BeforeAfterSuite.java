package com.selenium.scripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfterSuite {

	@BeforeSuite
	public void accessSite() {
		System.out.println("Accessed site");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Closed the browser");
	}

}
