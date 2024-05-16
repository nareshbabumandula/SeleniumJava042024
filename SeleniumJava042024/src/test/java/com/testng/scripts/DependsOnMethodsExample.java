package com.testng.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {

	@BeforeSuite
	void accessSite() {
		System.out.println("Accessed amazon site");
	}
	
	@AfterClass
	void viewReceipt() {
		System.out.println("viewed the receipt");
	}
	
	@BeforeTest
	void login() {
		System.out.println("loggged in to the amazon application");
	}
	@BeforeClass
	void searchProduct() {
		System.out.println("searched the product");
	}
	
	@Test
	void addToCart() {
		System.out.println("added the product to the cart");
	}
	@Test
	void selectDeliveryAddress() {
		System.out.println("selected the delivery address");
	}
	@Test(dependsOnMethods = {"selectPaymentMode"})
	void placeOrder() {
		System.out.println("successfully placed the order");
	}
	@Test(dependsOnMethods = {"selectDeliveryAddress"})
	void selectPaymentMode() {
		System.out.println("selected payment mode");
	}
	@Test
	void checkOut() {
		System.out.println("checked out the product");
	}

	@AfterTest
	void logout() {
		System.out.println("logged out from the application");
	}
	@AfterSuite
	void closeBrowser() {
		System.out.println("closed the browser");
	}
	
	
}
