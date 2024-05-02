package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpathCSSAdvancedFunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize(); 

		// XPath with starts-with function
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).sendKeys("Phani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).clear();

		// XPath with contains function
		driver.findElement(By.xpath("//input[contains(@id,'se')]")).sendKeys("Smith");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@id,'se')]")).clear();

		// XPath with OR operator
		driver.findElement(By.xpath("//input[@id='user' or @name='test']")).sendKeys("Swetha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user' or @name='test']")).clear();
		
		// XPath with OR operator with pipe symbol '||'
		driver.findElement(By.xpath("//input[@id='user']|//input[@name='user']")).sendKeys("Pavithra");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user']|//input[@name='user']")).clear();
		
		// XPath with AND operator
		driver.findElement(By.xpath("//input[@id='user' and @name='user']")).sendKeys("Rajesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user' and @name='user']")).clear();

		// XPath with starts-with function
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).sendKeys("Phani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@id,'use')]")).clear();

		// CSS startswith using wildcard
		driver.findElement(By.xpath("input[id^='use']")).sendKeys("Sai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input[id^='use']")).clear();

		// CSS endswith using wildcard
		driver.findElement(By.xpath("input[id$='ser']")).sendKeys("Akhil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input[id$='ser']")).clear();

		// CSS contains using wildcard
		driver.findElement(By.xpath("input[id*='se']")).sendKeys("Azhar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input[id*='se']")).clear();
		
		// CSS with # as a replacement for ID locator
		driver.findElement(By.xpath("input#user")).sendKeys("Mounika");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input#user")).clear();
		
		// CSS contains using wildcard
		driver.findElement(By.xpath("input.txt_log")).sendKeys("Jyoshna");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input.txt_log")).clear();

		driver.quit();

	}

}
