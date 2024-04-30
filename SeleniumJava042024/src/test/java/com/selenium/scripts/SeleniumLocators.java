package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize(); // Maximize the webdriver browser window
		
		// Absolute xpath : Absolute XPath starts with the root/parent node (html) with a preceding forward slash (/).
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).sendKeys("Phani");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).clear();
				
		// Relative xpath : Relative xpath starts from the node of our choice with syntax //html tag[@attribute='value']
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("Nagaraj");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user']")).clear();
				
		// ID Locator
		driver.findElement(By.id("user")).sendKeys("Vydehi");
		Thread.sleep(1000);
		driver.findElement(By.id("user")).clear();
				
		// Name Locator
		driver.findElement(By.name("user")).sendKeys("Naresh");
		Thread.sleep(1000);
		driver.findElement(By.name("user")).clear();
		
		// ClassName Locator
		driver.findElement(By.className("txt_log")).sendKeys("Shiva");
		Thread.sleep(1000);
		driver.findElement(By.className("txt_log")).clear();
		
		// Absolute CSS path
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div>input")).sendKeys("Abhilash");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("html>body>div:nth-of-type(3)>div:nth-of-type(2)>div>form>fieldset>div>input")).clear();
		
		// CSS (Cascading Style Sheet) Locator
		driver.findElement(By.cssSelector("input[id='user']")).sendKeys("Navya");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='user']")).clear();
		
		// Linktext locator
		driver.findElement(By.linkText("Sample Forms")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Partial Linktext locator
		driver.findElement(By.partialLinkText("Sample")).click();
		Thread.sleep(1000);
		
		//TagName locator
		driver.findElement(By.tagName("input")).sendKeys("Kiran");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).clear();
		
		driver.quit();
	
	}

}
