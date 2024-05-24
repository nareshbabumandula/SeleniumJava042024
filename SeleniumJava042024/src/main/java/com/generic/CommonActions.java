package com.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

	public static void highlightObject(WebElement object, WebDriver driver) {
		try {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.background='yellow'", object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectValue(WebElement element, String text) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
