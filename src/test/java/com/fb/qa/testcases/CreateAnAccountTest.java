package com.fb.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.CreateAnAccountPage;
import com.fb.qa.util.TestUtil;

public class CreateAnAccountTest extends TestBase{
	
	CreateAnAccountPage ca;
	String sheetName = "create";
	
	public CreateAnAccountTest() {
	super();
	
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		ca = new CreateAnAccountPage();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@DataProvider	
	public Object[][] getFbTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(dataProvider = "getFbTestData")
	public void ClickOnCreateAnAccountBtn(String lastname, String email, String password, String month, String day, String year) throws InterruptedException {
		ca.CreateAnAccountBtn();
		//ca.fillNewAccountForm("patel", "jensi13@ymail.com", "jensi---12345", "4", "21", "1999");
		ca.fillNewAccountForm(lastname, email, password, month, day, year);
		
				
	}
	
		
	}


