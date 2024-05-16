package com.testng.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	@BeforeTest
	public void login() {
		System.out.println("Logged into Amazon portal");
	}
	
	@BeforeClass
	public void searchProduct() {
		System.out.println("Searched the product");
	}
	
	@BeforeMethod
	public void verifyQuanity() {
		System.out.println("Verified the quantity");
	}
	
	@AfterMethod
	public void verifyPrice() {
		System.out.println("Verified the price");
	}
	
	@Test(priority = 1)
	public void addToCart() {
		System.out.println("Added the product to cart");
	}
	
	@Test(priority = 2)
	public void checkout() {
		System.out.println("Checked out the product");
	}
	
	@Test(priority = 3)
	public void proceedToBuy() {
		System.out.println("Proceeded to buy");
	}
	
	@AfterClass
	public void payment() {	
		System.out.println("Payment done");
	}
	
	@AfterTest
	public void viewOrder() {
		System.out.println("Viewed the order placed");
	}

	public void logout() {
		System.out.println("Logged out from the application");
	}
	
}
