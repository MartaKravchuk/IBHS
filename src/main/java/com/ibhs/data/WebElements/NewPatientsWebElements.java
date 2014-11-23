package com.ibhs.data.WebElements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Locators;

public class NewPatientsWebElements extends BaseClass {
	protected WebDriver driver;

	public NewPatientsWebElements(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabSecondaryInsurance.SECONDARY_TAB) public static WebElement tabSecondaryInsurance;
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.FIRST_NAME_ERROR) public static WebElement errorFirstName_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.LAST_NAME_ERROR) public static WebElement errorLastName_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.GENDER_ERROR) public static WebElement errorGender_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.DOB_ERROR) public static WebElement errorDOB_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.SSN_ERROR) public static WebElement errorSSN_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.ADDRESS_ERROR) public static WebElement errorAddress_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.CITY_ERROR) public static WebElement errorCity_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.STATE_ERROR) public static WebElement errorState_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.ZIP_ERROR) public static WebElement errorZIP_FP;
	
	@FindBy(xpath = Locators.NewPatientPage.ZIP_ERROR_S) public static List<WebElement> error_S_ZIP_FP;
	
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.FIRST_NAME_INPUT) public static WebElement fieldFirstName_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.LAST_NAME_INPUT) public static WebElement fieldLastName_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.GENDER_SELECT) public static WebElement buttonGender_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.CalendarDOB.CALENDAR_BUTTON) public static WebElement buttonDOB_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.DOB_INPUT) public static WebElement fieldDOB_FP; //for manual
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.SSN_INPUT) public static WebElement fieldSSN_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.ADDRESS_INPUT) public static WebElement fieldAddress_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.CITY_INPUT) public static WebElement fieldCity_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.STATE_INPUT) public static WebElement fieldState_FP;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.ZIP_INPUT) public static WebElement fieldZip_FP;
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabPrimaryInsurance.FormInsurance.INSURANCE_COMPANY_SELECT) 
	public static WebElement buttonInsuranceCompany_PI;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabPrimaryInsurance.FormInsurance.POLICY_TYPE_SELECT) 
	public static WebElement buttonPolicyType_PI;
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabPrimaryInsurance.FormInsurance.MEMBER_ID_INPUT) 
	public static WebElement fieldMemberID_PI;
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabPrimaryInsurance.FormPolicyHolder.PATIENTS_RELATIONSHIP_TO_INSURED_SELECT) 
	public static WebElement buttonPatientsRelationshipToInsured_PH;
	
	
	@FindBy(xpath = Locators.NewPatientPage.FormPatient.TabPrimaryInsurance.FormPolicyHolder.FIRST_NAME_INPUT) public static WebElement fieldFirstName_PH;
	
	
	
	


}
