package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.CommonActions;
import com.page.objects.SampleFormsPage;

public class DropDownTest {
	
  WebDriver driver;
  SampleFormsPage sfp;
	
  @Test
  public void dropdownMethods() throws InterruptedException {
	  WebElement predefinedCountries = driver.findElement(sfp.predefinedCountries);
	  CommonActions.highlightObject(predefinedCountries, driver);
	  	  
	  Select select = new Select(predefinedCountries);
	  
	  select.selectByIndex(1);
	  Thread.sleep(2000);
	  select.selectByIndex(0);
	  Thread.sleep(2000);
	  select.selectByVisibleText("India");
	  Thread.sleep(2000);
	  
	  List<WebElement> options = select.getOptions();
	  System.out.println("No of options displayed in the pre-defined Countries are : " + options.size());
	  select.selectByIndex(options.size()-2);
	  Thread.sleep(2000);
	  
	  WebElement prededinedCanadianProvinces = driver.findElement(sfp.predefinedCanadianProvinces);
	  CommonActions.highlightObject(prededinedCanadianProvinces, driver);
	  CommonActions.selectValue(prededinedCanadianProvinces, "Ontario");
	  Thread.sleep(2000);
	  SampleFormsPage sp = new SampleFormsPage(driver);
	  CommonActions.highlightObject(sp.title, driver);
	  CommonActions.selectValue(sp.title, "Mr.");
	  Thread.sleep(2000);
	  sp.enterFirstName("Nagaraj");
	  sp.enterLastName("K");
	  Thread.sleep(2000);
  }
  
  @BeforeClass
  public void accessSite() {
	  driver = new ChromeDriver();
	  driver.get("https://www.mycontactform.com/samples.php");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void closeBrowser() {
	  driver.quit();
  }

}
