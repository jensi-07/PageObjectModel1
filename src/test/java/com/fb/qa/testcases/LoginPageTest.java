package com.fb.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.LoginPage;
import com.fb.qa.testdata.DataFile;
import com.fb.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	DataFile df = new DataFile();

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		

		lp = new LoginPage();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 1)
	public void emptyEmailloginTest() throws InterruptedException {

		lp.login("", df.password);
		lp.clickOnLoginButton();
		Thread.sleep(2000);
		Assert.assertEquals(df.EmptyEmailErr, lp.EmptyEmailErr());

	}

	@Test(priority = 2)
	public void emptyPassloginTest() throws InterruptedException {
		lp.login(df.email, "");
		lp.clickOnLoginButton();
		Thread.sleep(2000);
		Assert.assertEquals(df.EmptyPassErr, lp.EmptyPassErr());

	}

}
