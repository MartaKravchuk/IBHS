package com.ibhs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibhs.data.WebElements.NewPatientsWebElements;
import com.ibhs.framework.Settings;

public class NewPatientsPage extends NewPatientsWebElements {
	public NewPatientsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public NewPatientsPage fillFormPatientOnlyWithImportantData() throws Exception {
		System.out.println("start to fill FormPatient");
		PageFactory.initElements(driver, NewPatientsPage.class)
			.inputText(fieldFirstName_FP, Settings.TextNewPatientPage.TextFormPatient.Important.FIRSTNAME)
			.inputText(fieldLastName_FP, Settings.TextNewPatientPage.TextFormPatient.Important.LASTNAME)
			.dropDownSelectValue(buttonGender_FP, Settings.TextNewPatientPage.TextFormPatient.Important.GENDER)
			.selectFullDateFromCalendarPicker(buttonDOB_FP, Settings.TextNewPatientPage.TextFormPatient.Important.DOB_YEAR,  Settings.TextNewPatientPage.TextFormPatient.Important.DOB_MONTH,  Settings.TextNewPatientPage.TextFormPatient.Important.DOB_DAY)
			.inputText(fieldSSN_FP, Settings.TextNewPatientPage.TextFormPatient.Important.SSN)
			.inputText(fieldAddress_FP, Settings.TextNewPatientPage.TextFormPatient.Important.ADDRESS)
			.inputText(fieldCity_FP, Settings.TextNewPatientPage.TextFormPatient.Important.CITY)
			.inputText(fieldState_FP, Settings.TextNewPatientPage.TextFormPatient.Important.STATE)
			.inputText(fieldZip_FP, Settings.TextNewPatientPage.TextFormPatient.Important.ZIP_CODE);
		Settings.setTimeOut(Settings.timeOut.SMALL);
		//driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON));
		
		
				//.clickAction(By.xpath(Locators.Landing.BUTTON_RUSHMYTRIAL));
		System.out.println("end to fill FormPatient");
		return this;
	}

/*	
	public NewPatientsPage calendarFullDate(String year, String month, String day) {
		driver.findElement(By.xpath(Locators.NewPatientPage.FormPatient.CalendarDOB.CALENDAR_BUTTON)).click();
		//CalendarDOBFormPatient.buttonCalendar.click();
		buttonMonth.click();
		buttonYear.click();
		List<WebElement> columnsYear = listCells; 
			for (WebElement cellYear: columnsYear){
				   if (cellYear.getText().contains(year)){
					   cellYear.click();
				      break;
				 }				   
			}
			List<WebElement> columnsMonth = listCells; 
			for (WebElement cellMonth: columnsMonth){
				   if (cellMonth.getText().contains(month)){
					   cellMonth.click();
				      break;
				 }				   
			}
			List<WebElement> columnsDay = listCells;
			for (WebElement cellDay: columnsDay){
				   if (cellDay.getText().contains(day)){
					   cellDay.click();
				      break;
				 }				   
			}		
        return this;
	}
	
	public NewPatientsPage calendarMonthAndDay(String month, String day) {
		buttonCalendar.click();
		buttonMonth.click();
		List<WebElement> columnsMonth = listCells; 
		for (WebElement cellMonth: columnsMonth){
			   if (cellMonth.getText().contains(month)){
				   cellMonth.click();
			      break;
			 }				   
		}
		List<WebElement> columnsDay = listCells;
		for (WebElement cellDay: columnsDay){
			   if (cellDay.getText().contains(day)){
				   cellDay.click();
			      break;
			 }				   
		}		
        return this;
	}
	
	public NewPatientsPage calendarOnlyDay(String day) {
		buttonCalendar.click();
		List<WebElement> columnsDay = listCells;
			for (WebElement cellDay: columnsDay){
				   if (cellDay.getText().contains(day)){
					   cellDay.click();
				      break;
				 }				   
			}		
        return this;
	}
	
	public NewPatientsPage calendarToday() {
		buttonCalendar.click();
		buttonToday.click();	
        return this;
	}
	
	*/
	
	
}
