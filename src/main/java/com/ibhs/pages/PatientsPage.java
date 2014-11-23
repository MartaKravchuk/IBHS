package com.ibhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibhs.data.WebElements.PatientsWebElements;

public class PatientsPage extends PatientsWebElements {
	public PatientsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public NewPatientsPage ctreateNewPatient() {
		clickAction(butonNewPatient);
		return PageFactory.initElements(driver, NewPatientsPage.class);			
	}

}
