package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * In Selenium, XPath axes allow you to navigate through the HTML structure relative to current node. There are several XPath axes functions we have
 * 1. ancestor: Selects all ancestors (parent, grandparent etc) of the current node
 * 2. ancestor-or-self: Selects the current node and all its ancestors
 * @author nares
 *
 */
public class SeleniumXPathAxesFunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize(); // Maximize the webdriver browser window
		
		//1. ancestor: Selects all ancestors (parent, grandparent etc) of the current node
		List<WebElement> ancestor = driver.findElements(By.xpath("//input[@id='user']/ancestor::*"));
		System.out.println("No of ancestors for the current node are : " + ancestor.size());
		
		//2. ancestor-or-self: Selects the current node and all its ancestors
		List<WebElement> ancestororSelf = driver.findElements(By.xpath("//input[@id='user']/ancestor-or-self::*"));
		System.out.println("No of ancestor-or-self for the current node are : " + ancestororSelf.size());
		
		driver.quit();
	
	}

}
