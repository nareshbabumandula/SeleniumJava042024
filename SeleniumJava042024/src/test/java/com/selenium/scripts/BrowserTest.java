package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();  

		driver.get("https://www.mycontactform.com");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.id("user"));
        System.out.println(username.isDisplayed());
        System.out.println(username.isEnabled());
        username.sendKeys("Phani");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Secure*123");
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(1000);
		driver.quit();	
	}

}
