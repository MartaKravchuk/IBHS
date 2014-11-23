package com.ibhs.data.WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Locators;

public class PatientsWebElements extends BaseClass {
	protected WebDriver driver;

	public PatientsWebElements(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = Locators.PatientPage.NEW_PATIENT) public static WebElement butonNewPatient;

}
