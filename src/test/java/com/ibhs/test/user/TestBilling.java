package com.ibhs.test.user;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibhs.framework.BaseClass;
import com.ibhs.framework.Settings;
import com.ibhs.pages.BillingPage;
import com.ibhs.pages.LoginPage;



public class TestBilling extends BaseClass{

	@BeforeClass
	public void setUp() throws Exception{
		PageFactory.initElements(getDriver("Chrome", ""), LoginPage.class)
		.getUrl(Settings.User.LOGIN_URL)
		.signInAsUser()
		.selectFacility();		
		Thread.sleep(1000);
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void first(){
		PageFactory.initElements(driver, BillingPage.class);
				
	}

}
