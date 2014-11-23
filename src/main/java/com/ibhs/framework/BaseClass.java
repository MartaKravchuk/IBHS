package com.ibhs.framework;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void OpenBrowser(String Browser,  String path) {
		if (Browser.equals("Chrome") || Browser.equals("chrome")) {
			System.out.println("Chrome is selected");
			if (path.equals("")) {
				System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
				} else {System.setProperty("webdriver.chrome.driver", path);}
			driver = new ChromeDriver();
			} else if (Browser.equals("Chrome Linux")|| Browser.equals("chrome Linux")) {
				System.out.println("Chrome Linux is selected");
				if (path.equals("")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
					} else {System.setProperty("webdriver.chrome.driver", path);}
				driver = new ChromeDriver();
				}
		}
	
	public WebDriver getDriver(String Browser, String Path) {
		OpenBrowser(Browser, Path);
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	public BaseClass inputText(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return this;
	}	
	
	/*	
	public BaseClass inputTextFromClipboard(WebElement element) {
		try {			
			element.sendKeys(Keys.CONTROL + "v");
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return this;
	}*/
	
	public BaseClass activateTappingText(WebElement element) {
		try {
			element.sendKeys(Keys.RETURN);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return this;
	}
	
	public BaseClass clickAction(WebElement element) {
		//System.out.println("clickAction" + element.toString());
        int attempts = 0;
        while(attempts < 2) {
            try {
            	if (!element.isSelected())
            		element.click();
            	break;
            } catch(NoSuchElementException e) {
            	System.out.println("NoSuchElementException clickAction");
            } catch(StaleElementReferenceException e1) {
            	System.out.println("StaleElementReferenceException clickAction");
            	}
            attempts++;
        }
        return this;
	}	
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getMoreThanOneRowOfText(List<WebElement> elements, Integer q) {
		int i = 1;
		Map<Integer, String> testList = new HashMap<Integer, String>();
		for (WebElement item: elements){
			testList.put(i, item.getText());		
			i++;		
		}		
		System.out.println(testList);
		return testList.get(q);			
	}	
		
	public BaseClass selectFullDateFromCalendarPicker(WebElement buttonCalendar, String year, String month, String day) {
		clickAction (buttonCalendar);
		Settings.setTimeOut(Settings.timeOut.SMALL);
		try {
			clickAction (driver.findElement(By.xpath(Locators.Unique.CALENDAR_MONTH_BUTTON)));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		Settings.setTimeOut(Settings.timeOut.SMALL);
		try {
			clickAction (driver.findElement(By.xpath(Locators.Unique.CALENDAR_YEAR_BUTTON)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
		Settings.setTimeOut(Settings.timeOut.SMALL);
		List<WebElement> columnsYear = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY)); 
			for (WebElement cellYear: columnsYear){
				   if (cellYear.getText().contains(year)){
					   clickAction(cellYear);
					  break;				      
				 }				   
			}
			Settings.setTimeOut(Settings.timeOut.SMALL);
			List<WebElement> columnsMonth = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY)); 
			for (WebElement cellMonth: columnsMonth){
				   if (cellMonth.getText().contains(month)){
					   clickAction(cellMonth);
					   break;
				 }				   
			}
			Settings.setTimeOut(Settings.timeOut.SMALL);
			List<WebElement> columnsDay = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY));
			for (WebElement cellDay: columnsDay){
				   if (cellDay.getText().contains(day)){
					   clickAction(cellDay);
					   break;
				 }				   
			}		
        return this;
	}
	
	public BaseClass selectMonthAndDayFromCalendarPicker (WebElement buttonCalendar, String month, String day) {
		clickAction (buttonCalendar);
		Settings.setTimeOut(Settings.timeOut.SMALL);
		try {
			clickAction (driver.findElement(By.xpath(Locators.Unique.CALENDAR_MONTH_BUTTON)));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		Settings.setTimeOut(Settings.timeOut.SMALL);		
		List<WebElement> columnsMonth = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY)); 
		for (WebElement cellMonth: columnsMonth){
			   if (cellMonth.getText().contains(month)){
				   clickAction(cellMonth);
				   break;
			 }				   
		}
		List<WebElement> columnsDay = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY));
		for (WebElement cellDay: columnsDay){
			   if (cellDay.getText().contains(day)){
				   clickAction(cellDay);
				   break;
			 }				   
		}	
		return this;		
	}
	
	public BaseClass selectOnlyDayFromCalendarPicker(WebElement buttonCalendar, String day) {
		clickAction (buttonCalendar);
		Settings.setTimeOut(Settings.timeOut.SMALL);
		List<WebElement> columnsDay = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY));
		for (WebElement cellDay: columnsDay){
			   if (cellDay.getText().contains(day)){
				   clickAction(cellDay);
				   break;
			 }				   
		}
		return this;	
	}
	
	public BaseClass selectTodayFromCalendarPickerViaButton(WebElement buttonCalendar) {
		clickAction (buttonCalendar);
		clickAction (driver.findElement(By.xpath(Locators.Unique.TODAY_BUTTON)));	
		return this;
	}
	
	public BaseClass selectTommorowFromCalendarPicker(WebElement buttonCalendar) {
		buttonCalendar.click();
		Settings.setTimeOut(Settings.timeOut.SMALL);
		List<WebElement> columnsDay = driver.findElements(By.xpath(Locators.Unique.CALENDAR_CELLS_YEAR_MONTH_DAY));
		int toDday;
		GregorianCalendar date = new GregorianCalendar();
		toDday = date.get(Calendar.DAY_OF_MONTH);
		for (WebElement cellDay: columnsDay){
			   if (cellDay.getText().contains(Integer.toString(toDday + 1))){
				   cellDay.click();
			      break;
			 }
		}
        return this;
	}
	
	public String getTommorowDate() throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    Calendar calendar = Calendar.getInstance();
	    calendar.add(Calendar.DAY_OF_YEAR, 1);
	    Date tomorrow = calendar.getTime();
		String tomorrowAsString = dateFormat.format(tomorrow);
		return tomorrowAsString;
	}
	
	
	
	public  BaseClass dropDownSelectValue(WebElement buttonForSelect, String value) {
		try {
			buttonForSelect.click();
			for(WebElement container : driver.findElements(By.xpath(Locators.Unique.LIST_CONTAINER))){			
				if(container.getText().contains(value)){
					container.click();
					break;
				}			
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return this;
	}
	
	public  BaseClass dropDownSelectValueWithSearch(WebElement buttonForSelect, String value) {
		try {
			buttonForSelect.click();
			inputText(driver.findElement(By.xpath(Locators.Unique.SEARCH)), value);
			for(WebElement container : driver.findElements(By.xpath(Locators.Unique.LIST_CONTAINER))){			
				if(container.getText().contains(value)){
					container.click();
					break;
				}			
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return this;
	}
	
	public boolean isElementPresent(WebElement element) {	
		boolean flag = false;
		try {
			element.isDisplayed();
			flag = true;
			return flag;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} return flag;
	}
	
	
	public boolean isAlertPresent() throws Exception {
		//System.out.println("isAlertPresent");
		boolean flag = false;
		//Thread.sleep(Settings.timeOut.SMALL);
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			flag = true;
		} catch (NoAlertPresentException ex) {
			System.out.println("NoAlertPresentException");
		}
			
			/*try {
				//Thread.sleep(Settings.timeOut.MIDDLE);
				driver.switchTo().alert().accept();
				flag = true;
			} catch (NoAlertPresentException ex1) {
				System.out.println("NoAlertPresentException  2 ");
				try {
					//Thread.sleep(Settings.timeOut.MIDDLE);
					driver.switchTo().alert().accept();
					flag = true;
				} catch (NoAlertPresentException ex3) {
					System.out.println("NoAlertPresentException  3 ");
				}
				flag = false;
			} catch (UnhandledAlertException ex2) {
				// Alert not present
				// ex.printStackTrace();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.alert = function(msg) { document.bAlert = true; document.lastAlert=msg; }");
				Object o = js.executeScript("return document.bAlert");
				if (o != null && (Boolean) o == true) {
					// retrieve the alert message
					o = js.executeScript("return document.lastAlert");
					// Do something with the alert text
				}
				flag = true;
			}
		} catch (UnhandledAlertException ex2) {
			// Alert not present
			// ex.printStackTrace();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.alert = function(msg) { document.bAlert = true; document.lastAlert=msg; }");
			Object o = js.executeScript("return document.bAlert");
			if (o != null && (Boolean) o == true) {
				// retrieve the alert message
				o = js.executeScript("return document.lastAlert");
				// Do something with the alert text
			}
			flag = true;
		}*/

		//Thread.sleep(Settings.timeOut.SMALL);
		return flag;

	}
	
	public  BaseClass scrollup() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 0)"); // this will scroll up
		return this;		
	}
	
	/* jse.executeScript("scroll(0, 250)"); // this will scroll down
	2.Element is not present at the time of execution. Use WebDriverWait to until the element is present.
	WebDriverWait wait = new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("ID of the element")));*/
	
	/*
	public boolean isElementContains(By by, String message) {	
		boolean element = false;
		try {
			element =  driver.findElement(by).getText().contains(message);
			System.out.println(driver.findElement(by).getText());
			return element;
			}catch (Exception e){
				System.out.println(e.getMessage());
				} return element;
				}
	*/

	/*
	public BaseClass clickAction(By by) {
		System.out.println("clickAction" + by.toString());
		try {
			if (!driver.findElement(by).isSelected()) {
				driver.findElement(by).click();
				}
			} catch (NoSuchElementException e) {
				System.out.println("NoSuchElementException clickAction");
				} catch (NullPointerException e1) {
					System.out.println("NullPointerException clickAction");
					}
		return this;
	}
	*/

/*	
	public void tearDownBase() {
		driver.quit();
	}*/

}
