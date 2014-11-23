package com.ibhs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Locators;
import com.ibhs.framework.Settings;

public class LoginPage extends BaseClass {
	//protected WebDriver driver;
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;		
	}	
	
	public LoginPage getUrl(String BaseUrl) throws Exception {
		driver.get(BaseUrl);
		return this;
	}
	
	public BillingPage signInAsUser(){
		inputText(driver.findElement(By.xpath(Locators.LoginPage.NAME)), Settings.Credentials.USER_NAME);
		inputText(driver.findElement(By.xpath(Locators.LoginPage.PASSWORD)), Settings.Credentials.PASSWORD);
		clickAction(driver.findElement(By.xpath(Locators.LoginPage.LOGIN)));
		Settings.setTimeOut(Settings.timeOut.MIDDLE);
		return PageFactory.initElements(driver, BillingPage.class);
	}
	
	public BillingPage signInAsAdmin(){
		inputText(driver.findElement(By.xpath(Locators.LoginPage.NAME)), Settings.Credentials.ADMIN_NAME);
		inputText(driver.findElement(By.xpath(Locators.LoginPage.PASSWORD)), Settings.Credentials.PASSWORD);
		clickAction(driver.findElement(By.xpath(Locators.LoginPage.LOGIN)));
		Settings.setTimeOut(Settings.timeOut.MIDDLE);
		return PageFactory.initElements(driver, BillingPage.class);
	}

}
