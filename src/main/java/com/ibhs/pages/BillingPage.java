package com.ibhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibhs.data.WebElements.BillingWebElements;
import com.ibhs.framework.Settings;

public class BillingPage extends BillingWebElements {
	public BillingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	public BillingPage selectFacility() {
		dropDownSelectValueWithSearch(buttonSelectFacility, "Alameda Hospital");
		clickAction(buttonOK);
		Settings.setTimeOut(Settings.timeOut.SMALL);
		return this;
	}
	
	public PatientsPage moveToPatientPage() {
		clickAction(linkPatients);
		Settings.setTimeOut(Settings.timeOut.MIDDLE);
		return PageFactory.initElements(driver, PatientsPage.class);			
	}
}
