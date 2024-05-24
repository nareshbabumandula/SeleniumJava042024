package com.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SampleFormsPage {
	
	//Page Object Model
	public static By predefinedCountries = By.id("q9");
	public static By predefinedCanadianProvinces = By.id("q10");
	
	// Page Factory
	@FindBy(name = "q11_title")
	public WebElement title;
	
	@FindBy(name = "q11_first")
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "q11_last")
	public WebElement lastName;
	
	public void enterFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	// Constructor
	public SampleFormsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
