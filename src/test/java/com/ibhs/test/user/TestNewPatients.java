package com.ibhs.test.user;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ibhs.data.WebElements.NewPatientsWebElements;
import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Locators;
import com.ibhs.framework.Settings;
import com.ibhs.pages.BillingPage;
import com.ibhs.pages.LoginPage;

public class TestNewPatients extends BaseClass {	

	@BeforeClass
	public void setUp() throws Exception{
		PageFactory.initElements(getDriver("Chrome", ""), LoginPage.class)
		.getUrl(Settings.User.LOGIN_URL)
		.signInAsUser()
		.selectFacility();
		//.isAlertPresent();
		Thread.sleep(1000);
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test(priority = 1)
	public void verifyNumberErrorsRequiredForEmptyFields_1_1(){
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
		.isElementPresent(driver.findElement(By.xpath(Locators.Unique.ERRORS)));
		if (true) System.out.println(driver.findElements(By.xpath(Locators.Unique.ERRORS)).size() + " : the number all possible errors which have been appeared");
	}
	
	@Test(priority = 2)
	public void verifyErrorsRequiredForEmptyFields_1_2(){
		SoftAssert softAssert = new SoftAssert();
			String expectedFirstNameError = "First Name " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedLastNameError = "Last Name " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedGenderError = "Gender " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedDOBError = "DOB " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedSSNError = "SSN " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedAddressError = "Address Line 1 " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedCityError = "City " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedStateError = "State " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
			String expectedZIPError = "ZIP Code " + Settings.ErrorNewPatient.PRESENT_MESSAGE;
				
		String actualFirstNameError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorFirstName_FP);
		softAssert.assertEquals(actualFirstNameError, expectedFirstNameError);
		if (!actualFirstNameError.equals(expectedFirstNameError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorFirstName_FP) + " - has correct statement");
		
		String actualLastNameError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorLastName_FP);
		softAssert.assertEquals(actualLastNameError, expectedLastNameError);
		if (!actualLastNameError.equals(expectedLastNameError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorLastName_FP) + " - has correct statement");
		
		String actualGenderError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorGender_FP);
		softAssert.assertEquals(actualGenderError, expectedGenderError);
		if (!actualGenderError.equals(expectedGenderError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorGender_FP) + " - has correct statement");
		
		String actualDOBError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorDOB_FP);
		softAssert.assertEquals(actualDOBError, expectedDOBError);
		if (!actualDOBError.equals(expectedDOBError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorDOB_FP) + " - has correct statement");
		
		String actualSSNError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorSSN_FP);
		softAssert.assertEquals(actualSSNError, expectedSSNError);	
		if (!actualSSNError.equals(expectedSSNError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorSSN_FP) + " - has correct statement");
		
		String actualAddressError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorAddress_FP);
		softAssert.assertEquals(actualAddressError, expectedAddressError);
		if (!actualAddressError.equals(expectedAddressError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorAddress_FP) + " - has correct statement");
		
		String actualCityError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorCity_FP);
		softAssert.assertEquals(actualCityError, expectedCityError);
		if (!actualCityError.equals(expectedCityError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorCity_FP) + " - has correct statement");
		
		String actualStateError = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getText(NewPatientsWebElements.errorState_FP);
		softAssert.assertEquals(actualStateError, expectedStateError);	
		if (!actualStateError.equals(expectedStateError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getText(NewPatientsWebElements.errorState_FP) + " - has correct statement");
		
		String actualZIPErrors = PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)))
			.getMoreThanOneRowOfText(NewPatientsWebElements.error_S_ZIP_FP, 1);
		softAssert.assertEquals(actualZIPErrors, expectedZIPError);	
		if (!actualZIPErrors.equals(expectedZIPError)) System.out.println("not matching");
		else System.out.println("Error Message : " + getMoreThanOneRowOfText(NewPatientsWebElements.error_S_ZIP_FP, 1) + " - has correct statement");
	}

//not ready add javascript
	@Test(priority = 3) 
	public void verifyDOBErrorRequiredWithManualEntryInvalidNumbers_Test_1_3() throws IOException{
	//String setClipboardData = "01/01/1988";
		SoftAssert softAssert = new SoftAssert();		
	//month (1) [00 & 13]
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(NewPatientsWebElements.fieldDOB_FP, "13/01/1988")
		.activateTappingText(NewPatientsWebElements.fieldDOB_FP);
		
		
	//day (2) [0 & 32]
		
	//year (3) [1899 & 2101]
		
	//tomorrow	
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(NewPatientsWebElements.fieldDOB_FP, getTommorowDate())
		.activateTappingText(NewPatientsWebElements.fieldDOB_FP);
		
		
		softAssert.assertAll();		
	}
	
//not ready add javascript
	@Test(priority = 4) 
	public void verifyDOBWithManualEntryValidNumbers_Test_1_4(){
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(NewPatientsWebElements.fieldDOB_FP, "01/01/1988")
		.activateTappingText(NewPatientsWebElements.fieldDOB_FP);
		Assert.assertFalse(isElementPresent(NewPatientsWebElements.errorDOB_FP));
		if (true) System.out.println("good");
	}
//+	
	@Test(priority = 5)
	public void verifyDOBErrorRequiredViaDatePicker_Test_1_5(){
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.selectTommorowFromCalendarPicker(NewPatientsWebElements.buttonDOB_FP)
			.activateTappingText(NewPatientsWebElements.fieldDOB_FP);
		Assert.assertTrue(isElementPresent(NewPatientsWebElements.errorDOB_FP));
		if (true) System.out.println("Error Message : " + getText(NewPatientsWebElements.errorDOB_FP) + " has been appeared because Tomorrow day is selected");
	}
//+	
	@Test(priority = 6)
	public void verifyDOBViaDatePickerEntryValidNumbers_Test_1_6(){
		SoftAssert softAssert = new SoftAssert();
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.selectFullDateFromCalendarPicker(NewPatientsWebElements.buttonDOB_FP, "2012", "November", "08")
			.activateTappingText(NewPatientsWebElements.fieldDOB_FP).scrollup();
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.selectMonthAndDayFromCalendarPicker(NewPatientsWebElements.buttonDOB_FP, "May", "03")
			.activateTappingText(NewPatientsWebElements.fieldDOB_FP).scrollup();
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.selectOnlyDayFromCalendarPicker(NewPatientsWebElements.buttonDOB_FP, "11")
			.activateTappingText(NewPatientsWebElements.fieldDOB_FP).scrollup();
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
			.selectTodayFromCalendarPickerViaButton(NewPatientsWebElements.buttonDOB_FP)
			.activateTappingText(NewPatientsWebElements.fieldDOB_FP).scrollup();
		softAssert.assertAll();	
		softAssert.assertFalse(isElementPresent(NewPatientsWebElements.errorDOB_FP));
		if (true) System.out.println("The numbers are introduced by valid values");	
	}
		
//+ 
	@Test(priority = 7)
	public void verifySSNErrorRequired_Test_1_7(){
		SoftAssert softAssert = new SoftAssert();
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(NewPatientsWebElements.fieldSSN_FP, "000124555")
		.activateTappingText(NewPatientsWebElements.fieldSSN_FP);
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(NewPatientsWebElements.fieldSSN_FP, "12345678")
		.activateTappingText(NewPatientsWebElements.fieldSSN_FP);
		softAssert.assertAll();	
		softAssert.assertTrue(isElementPresent(NewPatientsWebElements.errorSSN_FP));
		if (true) System.out.println("kk");			
	}
	
	@Test(priority = 5)
	public void verifySSNWithValidNumbers_Test_1_8(){
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.inputText(By.xpath(Locators.NewPatientPage.FormPatient.SSN_INPUT), "999999999")
		.activateTappingText(By.xpath(Locators.NewPatientPage.FormPatient.SSN_INPUT));
		Assert.assertFalse(isElementPresent(By.xpath(Locators.NewPatientPage.FormPatient.SSN_ERROR)));
		if (true) System.out.println("good");	
	}

	
	@Test(priority = 9)
	public void verify() throws Exception{
		PageFactory.initElements(driver, BillingPage.class).moveToPatientPage().ctreateNewPatient()
		.fillFormPatientOnlyWithImportantData()
		.scrollup()
		.clickAction(driver.findElement(By.xpath(Locators.Unique.SAVE_BUTTON)));
		
		//.retryingFindClick(By.xpath(Locators.Unique.SAVE_BUTTON));
		//Assert.assertEquals(actual, "ZIP Code " + Settings.ErrorNewPatient.PRESENT_MESSAGE);			
	}
	

}
