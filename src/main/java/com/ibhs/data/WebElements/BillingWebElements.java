package com.ibhs.data.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Locators;

public class BillingWebElements extends BaseClass {
	protected WebDriver driver;

	public BillingWebElements(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = Locators.BillingPage.SelectFacilityPage.FACILITY_SELECT) public static WebElement buttonSelectFacility;
	@FindBy(xpath = Locators.BillingPage.SelectFacilityPage.OK) public static WebElement buttonOK;
	@FindBy(xpath = Locators.BillingPage.SelectFacilityPage.CANCEL) public static WebElement buttonCancel;
	@FindBy(xpath = Locators.BillingPage.PATIENTS) public static WebElement linkPatients;

}
