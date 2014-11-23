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
	
	public NewPatientsPage fillNewPatientsPageOnlyWithImportantData() throws Exception {
		System.out.println("start to fill NewPatientsPage");
		PageFactory.initElements(driver, NewPatientsPage.class)
			.inputText(fieldFirstName_FP, Settings.TextNewPatientPage.TextFormPatient.Important.FIRSTNAME)
			.inputText(fieldLastName_FP, Settings.TextNewPatientPage.TextFormPatient.Important.LASTNAME)
			.dropDownSelectValue(buttonGender_FP, Settings.TextNewPatientPage.TextFormPatient.Important.GENDER)
			.selectFullDateFromCalendarPicker(buttonDOB_FP, Settings.TextNewPatientPage.TextFormPatient.Important.DOB_YEAR,  Settings.TextNewPatientPage.TextFormPatient.Important.DOB_MONTH,  Settings.TextNewPatientPage.TextFormPatient.Important.DOB_DAY)
			.inputText(fieldSSN_FP, Settings.TextNewPatientPage.TextFormPatient.Important.SSN)
			.inputText(fieldAddress_FP, Settings.TextNewPatientPage.TextFormPatient.Important.ADDRESS)
			.inputText(fieldCity_FP, Settings.TextNewPatientPage.TextFormPatient.Important.CITY)
			.inputText(fieldState_FP, Settings.TextNewPatientPage.TextFormPatient.Important.STATE)
			.inputText(fieldZip_FP, Settings.TextNewPatientPage.TextFormPatient.Important.ZIP_CODE)
			
			.dropDownSelectValueWithSearch(buttonInsuranceCompany_PI, Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormInsurance.Important.INSURANCE_COMPANY)
			//.dropDownSelectValueWithSearch(buttonPolicyType_PI, Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormInsurance.Important.POLICY_TYPE)
			.inputText(fieldMemberID_PI, Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormInsurance.Important.MEMBER_ID);
			
			//.dropDownSelectValueWithSearch(buttonPatientsRelationshipToInsured_PH, Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormPolicyHolder.Important.PATIENTS_RELATIONSHIP_TO_INSURED);
			if (Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormPolicyHolder.Important.PATIENTS_RELATIONSHIP_TO_INSURED.contains("Self")) {
				clickAction(tabSecondaryInsurance);
			}			
			else PageFactory.initElements(driver, NewPatientsPage.class)
			.inputText(fieldFirstName_PH, Settings.TextNewPatientPage.TextTabPrimaryInsurance.TextFormPolicyHolder.Important.FIRSTNAME);
			
			
		
		Settings.setTimeOut(Settings.timeOut.SMALL);
		System.out.println("end to fill NewPatientsPage");
		return this;
	}


	
}
