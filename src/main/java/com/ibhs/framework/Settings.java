package com.ibhs.framework;



public class Settings {
	
	public class User {
		public static final String LOGIN_URL = "http://malkosuabox.thecvsi.com:8582/billing/#";
		//public static final String DASHBOARD_URL = LOGIN_URL + "dashboard";					
	}
		
	public class Admin {
		public static final String LOGIN_URL = "http://malkosuabox.thecvsi.com:8582/admin/#";
	}
	
	public class timeOut {
		public static final long SMALL = 1000;
		public static final long MIDDLE = 5000;
		public static final long HIGH = 15000;
		public static final long BIG = 30000;
	};
	
	public class Credentials {
		public static final String USER_NAME = "billinguser";
		public static final String ADMIN_NAME = "adminuser";
		public static final String PASSWORD = "Welcome1!";
	}
	
	public class ErrorNewPatient {
		public static final String PRESENT_MESSAGE = "is required";
	}
	
	public class TextNewPatientPage {
		public class TextFormPatient {
			public class Important {
				public static final String FIRSTNAME = "Logan";
				public static final String LASTNAME = "Armstrong";
				public static final String GENDER = "Male";
				//public static final String DOB = "11/07/1996";
				public static final String DOB_MONTH = "November";
				public static final String DOB_DAY = "07";
				public static final String DOB_YEAR = "2012";
				public static final String SSN = "810-38-4132";
				public static final String ADDRESS = "5400 Broad Zephyr Trace";
				public static final String CITY = "Quarantine";
				public static final String STATE = "DE";
				public static final String ZIP_CODE = "80560-0908";
			}
			public class NotImportant {
				public static final String MIDDLENAME = "Augusta";
			}			
		}
		
		public class TextTabPrimaryInsurance {	
			public class TextFormInsurance {
				public class Important {
					public static final String INSURANCE_COMPANY = "Allied Insurance";
					public static final String POLICY_TYPE = "Individual Policy";
					public static final String MEMBER_ID = "03284557";
				}
				public class NotImportant {
					public static final String GROUP_ID = "33953";
					public static final String COPAY = "50.00";
					public static final String CO_INSURANCE = "20";
					public static final String DEDUCTIBLE = "100.00";
					public static final String EFFECTIVE = "10/16/2014";
					public static final String TERMINATION = "10/16/2014";
				}				
			}
			public class TextFormPolicyHolder {
				public class Important {
					public static final String PATIENTS_RELATIONSHIP_TO_INSURED = "Spouse";
					public static final String FIRSTNAME = "Paula";
					public static final String LASTNAME = "Ronnie";
					public static final String GENDER = "Female";
					public static final String DOB = "01/15/1956";
					public static final String HOLDER_SSN = "855-95-0175";
					public static final String ADDRESS = "6718 Hazy Village";
					public static final String CITY = "Roddy";
					public static final String STATE = "FL";
					public static final String ZIP_CODE = "87326";
				}
				public class NotImportant {
					public static final String MIDDLENAME = "Cherie";
				}							
			}
		}
		
		public class TextTabSecondaryInsurance {	
			public class TextFormInsurance {
				public class Important {
					public static final String INSURANCE_COMPANY = "Bankers Life And Casualty Company";
					public static final String POLICY_TYPE = "Self Payment (Cash, No Insurance)";
					public static final String MEMBER_ID = "1087640";
				}
				public class NotImportant {
					public static final String GROUP_ID = "48195";
					public static final String COPAY = "50.00";
					public static final String CO_INSURANCE = "30";
					public static final String DEDUCTIBLE = "100.00";
					public static final String EFFECTIVE = "10/16/2014";
					public static final String TERMINATION = "10/16/2014";
				}				
			}
			public class TextFormPolicyHolder {
				public class Important {
					public static final String PATIENTS_RELATIONSHIP_TO_INSURED = "Life Partner";
					public static final String FIRSTNAME = "Autumn";
					public static final String LASTNAME = "Cooley";
					public static final String GENDER = "Female";
					public static final String DOB = "12/22/1956";
					public static final String HOLDER_SSN = "851-62-1029";
					public static final String ADDRESS = "8797 Old Elk Highway";
					public static final String CITY = "Quarantine";
					public static final String STATE = "DE";
					public static final String ZIP_CODE = "55424";	
				}
				public class NotImportant {
					public static final String MIDDLENAME = "Everett";
				}						
			}
		}
		
		public class TextTabOtherInsurance {	
			public class TextFormInsurance {
				public class Important {
					public static final String INSURANCE_COMPANY = "21st Century Insurance1";
					public static final String POLICY_TYPE = "Auto Insurance Policy";
					public static final String MEMBER_ID = "123";
				}
				public class NotImportant {
					public static final String GROUP_ID = "";
					public static final String COPAY = "";
					public static final String CO_INSURANCE = "";
					public static final String DEDUCTIBLE = "";
					public static final String EFFECTIVE = "";
					public static final String TERMINATION = "";
				}				
			}
			public class TextFormPolicyHolder {
				public class Important {
					public static final String PATIENTS_RELATIONSHIP_TO_INSURED = "Self"; // Copy
			//will be copied
					public static final String FIRSTNAME = "Logan";
					public static final String LASTNAME = "Armstrong";
					public static final String GENDER = "Male";
					public static final String DOB = "11/07/1996";
					public static final String SSN = "810-38-4132";
					public static final String ADDRESS = "5400 Broad Zephyr Trace";
					public static final String CITY = "Quarantine";
					public static final String STATE = "DE";
					public static final String ZIP_CODE = "80560-0908";
				}
				public class NotImportant {
					public static final String MIDDLENAME = "Augusta";
				}					
			}
		}
	}
	
	public static void setTimeOut(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println("setTimeOut " + time);
		}
	}
			

}
