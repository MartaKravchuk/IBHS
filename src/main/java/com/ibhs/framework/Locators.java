package com.ibhs.framework;

public class Locators {
	
	public class Unique {
		public static final String SAVE_BUTTON = ".//button[contains(text(), 'Save') and @type='submit']";
		public static final String ERRORS = "//*[contains(text(), 'is required') and @class='error']";
		public static final String CALENDAR_MONTH_BUTTON = ".//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
		public static final String CALENDAR_YEAR_BUTTON = ".//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
		public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
		public static final String TODAY_BUTTON = ".//button[contains(text(), 'Today')]";
		public static final String LIST_CONTAINER = ".//div[@class='checkBoxContainer']//div";
		public static final String SEARCH = ".//input[contains(@placeholder, 'Search')]";
		
	}
		
	public class LoginPage {
		public static final String NAME = ".//input[@placeholder='Username']";
		public static final String PASSWORD = ".//input[@placeholder='Password']";
		public static final String LOGIN = ".//button[contains(text(), 'Login')]";		
	}
	
	public class BillingPage {
		public static final String PATIENTS = ".//a[contains(text(), 'Patients')]";
		//add links
		
			public class SelectFacilityPage {
				public static final String FACILITY_SELECT = ".//form[@name='facility_form']//button[@class='button multiSelectButton']";
				public static final String OK = ".//button[contains(text(), 'OK')]";
				public static final String CANCEL = ".//button[contains(text(), 'Cancel')]";
			}
	}	
	
	public class PatientPage {
		public static final String NEW_PATIENT = ".//a[contains(text(), 'New Patient')]";
	}
	
	public class NewPatientPage {
		public static final String CANCEL_BUTTON = ".//a[@href='#/patients/' and contains(text(), 'Cancel')]";	
		
		public static final String ZIP_ERROR_S = "//*[contains(@visible,'Address_ZIP') and contains(@class,'error')]";
		
			public class FormPatient {
				public static final String FIRST_NAME_ERROR = "//*[contains(@visible,'form.Patient_FirstName') and contains(@class,'error')]";
				public static final String FIRST_NAME_INPUT = ".//input[@id='firstName' and @name='Patient_FirstName']";
				public static final String LAST_NAME_ERROR = "//*[contains(@visible,'form.Patient_LastName') and contains(@class,'error')]";
				public static final String LAST_NAME_INPUT = ".//input[@id='lastName' and @name='Patient_LastName']";
				public static final String MIDDLE_NAME_INPUT = ".//input[@id='middleName' and @name='Patient_MiddleName']";
				public static final String GENDER_ERROR = "//*[contains(@visible,'form.Patient_Sex') and contains(@class,'error')]";
				public static final String GENDER_SELECT = ".//span[@name='Patient_Sex']/button";
				//public static final String GENDER_LIST = ".//span[@name='Patient_Sex']//div[@class='checkBoxContainer']";
				public static final String DOB_ERROR = "//*[contains(@visible,'form.Patient_BirthDate') and contains(@class,'error')]";
				public static final String DOB_INPUT = ".//div[@name='Patient_BirthDate']/input";
				public static final String SSN_ERROR = "//*[contains(@visible,'form.Patient_SSN') and contains(@class,'error')]";
				public static final String SSN_INPUT = ".//*[@id='SSN' and @name='Patient_SSN']";
				public static final String ADDRESS_ERROR = "//*[contains(@visible,'form.Patient_Address') and contains(@class,'error')]";
				public static final String ADDRESS_INPUT = ".//input[@id='Patient_Address_Address_Line1' and @name='Patient_Address_Line1']";
				public static final String CITY_ERROR = "//*[contains(@visible,'form.Patient_Address_City') and contains(@class,'error')]";
				public static final String CITY_INPUT = ".//input[@id='Patient_Address_Address_City' and @name='Patient_Address_City']";
				public static final String STATE_ERROR = "//*[contains(@visible,'form.Patient_Address_StateCode') and contains(@class,'error')]";
				public static final String STATE_INPUT = ".//input[@id='Patient_Address_Address_StateCode' and @name='Patient_Address_StateCode']";
				public static final String ZIP_ERROR = "//*[contains(@visible,'form.Patient_Address_ZIP') and contains(@class,'error')]";
				public static final String ZIP_INPUT = ".//input[@id='Patient_Address_Address_ZIP' and @name='Patient_Address_ZIP']";
					
					public class CalendarDOB {
						//+left+right+clear+close
						public static final String CALENDAR_BUTTON = ".//div[@name='Patient_BirthDate']//button[@class='btn btn-default date-picker-button']";
						//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_BirthDate']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
						//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_BirthDate']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
						//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_BirthDate']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
						public static final String TODAY_BUTTON = ".//div[@name='Patient_BirthDate']//button[contains(text(), 'Today')]";
					}
					
			public class TabPrimaryInsurance {
				public static final String PRIMARY_TAB = ".//*[@id='primary']/a[contains(text(), 'Primary Insurance')]";
					public class FormInsurance {
						public static final String INSURANCE_COMPANY_SELECT = ".//span[@name='Patient_PrimaryInsurance_InsuranceCompanyId']/button";
						public static final String INSURANCE_COMPANY_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_InsuranceCompanyId') and contains(@class,'error')]";
						public static final String POLICY_TYPE_SELECT = ".//span[@name='Patient_PrimaryInsurance_PolicyTypeId']/button";
						public static final String POLICY_TYPE_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_PolicyTypeId') and contains(@class,'error')]";
						public static final String MEMBER_ID_INPUT = ".//input[@name='Patient_PrimaryInsurance_MemberId']";
						public static final String MEMBER_ID_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_MemberId') and contains(@class,'error')]";
						public static final String GROUP_ID_INPUT = ".//input[@name='Patient_PrimaryInsurance_GroupNumber']";
						public static final String COPAY_INPUT = ".//input[@name='Patient_PrimaryInsurance_Copay']";
						public static final String CO_INSURANCE_INPUT = ".//input[@name='Patient_PrimaryInsurance_CoInsurance']";
						public static final String DEDUCTIBLE_INPUT = ".//input[@name='Patient_PrimaryInsurance_Deductible']";
						public static final String EFFECTIVE_INPUT = ".//div[@name='Patient_PrimaryInsurance_Effective']/input";
						public static final String TERMINATION_INPUT = ".//div[@name='Patient_PrimaryInsurance_Termination']/input";
						
							public class CalendarEffective {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Effective']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Effective']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Effective']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_PrimaryInsurance_Effective']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								
							}
							
							public class CalendarTermination {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Termination']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Termination']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Termination']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_PrimaryInsurance_Termination']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_PrimaryInsurance_Termination']//button[contains(text(), 'Today')]";
							}
					}
				
					public class FormPolicyHolder {
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_SELECT = ".//span[@name='Patient_PrimaryInsurance_HolderType']/button";
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderType') and contains(@class,'error')]";
											
						public static final String FIRST_NAME_INPUT = ".//input[@name='Patient_PrimaryInsurance_HolderFirstName']";
						public static final String FIRST_NAME_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderFirstName') and contains(@class,'error')]";
						
						public static final String LAST_NAME_INPUT = ".//input[@name='Patient_PrimaryInsurance_HolderLastName']";
						public static final String LAST_NAME_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderLastName') and contains(@class,'error')]";
						
						public static final String MIDDLE_NAME_INPUT = ".//input[@name='Patient_PrimaryInsurance_HolderMiddleName']";
						public static final String GENDER_SELECT = ".//span[@name='Patient_PrimaryInsurance_HolderSex']/button";
						public static final String GENDER_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderSex') and contains(@class,'error')]";
						
						public static final String DOB_INPUT = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']/input";
						public static final String DOB_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderBirthDate') and contains(@class,'error')]";
						
						public static final String HOLDER_SSN_INPUT = ".//input[@name='Patient_PrimaryInsurance_HolderSSN']";
						public static final String HOLDER_SSN_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderSSN') and contains(@class,'error')]";
												
						public static final String ADDRESS_INPUT = ".//input[@id='Patient_PrimaryInsurance_HolderAddress_Address_Line1' and @name='Patient_PrimaryInsurance_HolderAddress_Line1']";
						public static final String ADDRESS_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderAddress_Line1') and contains(@class,'error')]";
						
						public static final String CITY_INPUT = ".//input[@id='Patient_PrimaryInsurance_HolderAddress_Address_City' and @name='Patient_PrimaryInsurance_HolderAddress_City']";
						public static final String CITY_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderAddress_City') and contains(@class,'error')]";
						
						public static final String STATE_INPUT = ".//input[@id='Patient_PrimaryInsurance_HolderAddress_Address_StateCode' and @name='Patient_PrimaryInsurance_HolderAddress_StateCode']";
						public static final String STATE_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderAddress_StateCode') and contains(@class,'error')]";
						
						public static final String ZIP_INPUT = ".//input[@id='Patient_PrimaryInsurance_HolderAddress_Address_ZIP' and @name='Patient_PrimaryInsurance_HolderAddress_ZIP']";		
						public static final String ZIP_ERROR = "//*[contains(@visible,'form.Patient_PrimaryInsurance_HolderAddress_ZIP') and contains(@class,'error')]";
						
							public class CalendarDOB {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_PrimaryInsurance_HolderBirthDate']//button[contains(text(), 'Today')]";
							}
					}
			}
			
			public class TabSecondaryInsurance {
				public static final String SECONDARY_TAB = ".//*[@id='secondary']/a";
					public class FormInsurance {
						public static final String INSURANCE_CHECKBOX = ".//*[@id='secondary-patient-edit-insurance']";
						
						public static final String INSURANCE_COMPANY_SELECT = ".//span[@name='Patient_SecondaryInsurance_InsuranceCompanyId']/button";
						public static final String INSURANCE_COMPANY_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_InsuranceCompanyId') and contains(@class,'error')]";
						
						public static final String POLICY_TYPE_SELECT = ".//span[@name='Patient_SecondaryInsurance_PolicyTypeId']/button";
						public static final String POLICY_TYPE_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_PolicyTypeId') and contains(@class,'error')]";
						
						public static final String MEMBER_ID_INPUT = ".//input[@name='Patient_SecondaryInsurance_MemberId']";
						public static final String MEMBER_ID_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_MemberId') and contains(@class,'error')]";
						
						public static final String GROUP_ID_INPUT = ".//input[@name='Patient_SecondaryInsurance_GroupNumber']";
						public static final String COPAY_INPUT = ".//input[@name='Patient_SecondaryInsurance_Copay']";
						public static final String CO_INSURANCE_INPUT = ".//input[@name='Patient_SecondaryInsurance_CoInsurance']";
						public static final String DEDUCTIBLE_INPUT = ".//input[@name='Patient_SecondaryInsurance_Deductible']";
						public static final String EFFECTIVE_INPUT = ".//div[@name='Patient_SecondaryInsurance_Effective']/input";
						public static final String TERMINATION_INPUT = ".//div[@name='Patient_SecondaryInsurance_Termination']/input";
						
							public class CalendarEffective {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Effective']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Effective']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Effective']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_SecondaryInsurance_Effective']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Effective']//button[contains(text(), 'Today')]";
							}
							
							public class CalendarTermination {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Termination']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Termination']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Termination']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_SecondaryInsurance_Termination']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_SecondaryInsurance_Termination']//button[contains(text(), 'Today')]";
							}
					}
				
					public class FormPolicyHolder {
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_SELECT = ".//span[@name='Patient_SecondaryInsurance_HolderType']/button";
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderType') and contains(@class,'error')]";
						
						public static final String FIRST_NAME_INPUT = ".//input[@name='Patient_SecondaryInsurance_HolderFirstName']";
						public static final String FIRST_NAME_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderFirstName') and contains(@class,'error')]";
						
						public static final String LAST_NAME_INPUT = ".//input[@name='Patient_SecondaryInsurance_HolderLastName']";
						public static final String LAST_NAME_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderLastName') and contains(@class,'error')]";
						
						public static final String MIDDLE_NAME_INPUT = ".//input[@name='Patient_SecondaryInsurance_HolderMiddleName']";
						public static final String GENDER_SELECT = ".//span[@name='Patient_SecondaryInsurance_HolderSex']/button";
						public static final String GENDER_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderSex') and contains(@class,'error')]";
						
						public static final String DOB_INPUT = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']/input";
						public static final String DOB_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderBirthDate') and contains(@class,'error')]";
						
						public static final String HOLDER_SSN_INPUT = ".//input[@name='Patient_SecondaryInsurance_HolderSSN']";
						public static final String HOLDER_SSN_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderSSN') and contains(@class,'error')]";
						
						public static final String ADDRESS_INPUT = ".//input[@id='Patient_SecondaryInsurance_HolderAddress_Address_Line1' and @name='Patient_SecondaryInsurance_HolderAddress_Line1']";
						public static final String ADDRESS_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderAddress_Line1') and contains(@class,'error')]";
						
						public static final String CITY_INPUT = ".//input[@id='Patient_SecondaryInsurance_HolderAddress_Address_City' and @name='Patient_SecondaryInsurance_HolderAddress_City']";
						public static final String CITY_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderAddress_City') and contains(@class,'error')]";
						
						public static final String STATE_INPUT = ".//input[@id='Patient_SecondaryInsurance_HolderAddress_Address_StateCode' and @name='Patient_SecondaryInsurance_HolderAddress_StateCode']";
						public static final String STATE_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderAddress_StateCode') and contains(@class,'error')]";
						
						public static final String ZIP_INPUT = ".//input[@id='Patient_SecondaryInsurance_HolderAddress_Address_ZIP' and @name='Patient_SecondaryInsurance_HolderAddress_ZIP']";
						public static final String ZIP_ERROR = "//*[contains(@visible,'form.Patient_SecondaryInsurance_HolderAddress_ZIP') and contains(@class,'error')]";
						
							public class CalendarDOB {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_SecondaryInsurance_HolderBirthDate']//button[contains(text(), 'Today')]";
							}
					}					
			}
			
			public class TabOtherInsurance {
				public static final String OTHER_TAB = ".//*[@id='other']/a";
					public class FormInsurance {
						public static final String INSURANCE_CHECKBOX = ".//*[@id='other-patient-edit-insurance']";
						
						public static final String INSURANCE_COMPANY_SELECT = ".//span[@name='Patient_OtherInsurance_InsuranceCompanyId']/button";
						public static final String INSURANCE_COMPANY_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_InsuranceCompanyId') and contains(@class,'error')]";
						
						public static final String POLICY_TYPE_SELECT = ".//span[@name='Patient_OtherInsurance_PolicyTypeId']/button";
						public static final String POLICY_TYPE_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_PolicyTypeId') and contains(@class,'error')]";
						
						public static final String MEMBER_ID_INPUT = ".//input[@name='Patient_OtherInsurance_MemberId']";
						public static final String MEMBER_ID_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_MemberId') and contains(@class,'error')]";
						
						public static final String GROUP_ID_INPUT = ".//input[@name='Patient_OtherInsurance_GroupNumber']";
						public static final String COPAY_INPUT = ".//input[@name='Patient_OtherInsurance_Copay']";
						public static final String CO_INSURANCE_INPUT = ".//input[@name='Patient_OtherInsurance_CoInsurance']";
						public static final String DEDUCTIBLE_INPUT = ".//input[@name='Patient_OtherInsurance_Deductible']";
						public static final String EFFECTIVE_INPUT = ".//div[@name='Patient_OtherInsurance_Effective']/input";
						public static final String TERMINATION_INPUT = ".//div[@name='Patient_OtherInsurance_Termination']/input";
						
							public class CalendarEffective {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_OtherInsurance_Effective']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_OtherInsurance_Effective']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_OtherInsurance_Effective']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_OtherInsurance_Effective']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_OtherInsurance_Effective']//button[contains(text(), 'Today')]";
							}
						
							public class CalendarTermination {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_OtherInsurance_Termination']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_OtherInsurance_Termination']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_OtherInsurance_Termination']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_OtherInsurance_Termination']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_OtherInsurance_Termination']//button[contains(text(), 'Today')]";
							}
					}
					public class FormPolicyHolder {
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_SELECT = ".//span[@name='Patient_OtherInsurance_HolderType']/button";
						public static final String PATIENTS_RELATIONSHIP_TO_INSURED_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderType') and contains(@class,'error')]";
						
						public static final String FIRST_NAME_INPUT = ".//input[@name='Patient_OtherInsurance_HolderFirstName']";
						public static final String FIRST_NAME_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderFirstName') and contains(@class,'error')]";
						
						public static final String LAST_NAME_INPUT = ".//input[@name='Patient_OtherInsurance_HolderLastName']";
						public static final String LAST_NAME_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderLastName') and contains(@class,'error')]";
						
						public static final String MIDDLE_NAME_INPUT = ".//input[@name='Patient_OtherInsurance_HolderMiddleName']";
						public static final String GENDER_SELECT = ".//span[@name='Patient_OtherInsurance_HolderSex']/button";
						public static final String GENDER_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderSex') and contains(@class,'error')]";
						
						public static final String DOB_INPUT = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']/input";
						public static final String DOB_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderBirthDate') and contains(@class,'error')]";
						
						public static final String HOLDER_SSN_INPUT = ".//input[@name='Patient_OtherInsurance_HolderSSN']";
						public static final String HOLDER_SSN_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderSSN') and contains(@class,'error')]";
						
						public static final String ADDRESS_INPUT = ".//input[@id='Patient_OtherInsurance_HolderAddress_Address_Line1' and @name='Patient_OtherInsurance_HolderAddress_Line1']";
						public static final String ADDRESS_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderAddress_Line1') and contains(@class,'error')]";
						
						public static final String CITY_INPUT = ".//input[@id='Patient_OtherInsurance_HolderAddress_Address_City' and @name='Patient_OtherInsurance_HolderAddress_City']";
						public static final String CITY_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderAddress_City') and contains(@class,'error')]";
						
						public static final String STATE_INPUT = ".//input[@id='Patient_OtherInsurance_HolderAddress_Address_StateCode' and @name='Patient_OtherInsurance_HolderAddress_StateCode']";
						public static final String STATE_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderAddress_StateCode') and contains(@class,'error')]";
						
						public static final String ZIP_INPUT = ".//input[@id='Patient_OtherInsurance_HolderAddress_Address_ZIP' and @name='Patient_OtherInsurance_HolderAddress_ZIP']";
						public static final String ZIP_ERROR = "//*[contains(@visible,'form.Patient_OtherInsurance_HolderAddress_ZIP') and contains(@class,'error')]";
						
							public class CalendarDOB {
								//+left+right+clear+close
								public static final String CALENDAR_BUTTON = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']//button[@class='btn btn-default date-picker-button']";
								//public static final String CALENDAR_MONTH_BUTTON = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']//table[@ng-switch-when='day']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_YEAR_BUTTON = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']//table[@ng-switch-when='month']//button[contains(@id, 'datepicker')]";
								//public static final String CALENDAR_CELLS_YEAR_MONTH_DAY = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']//td[contains(@class,'text-center date-picker-day ng-scope')]/button";
								public static final String TODAY_BUTTON = ".//div[@name='Patient_OtherInsurance_HolderBirthDate']//button[contains(text(), 'Today')]";
							}						
					}
			}								
		}		
	}
}
