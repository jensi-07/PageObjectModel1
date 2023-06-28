package com.fb.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fb.qa.base.TestBase;
import com.fb.qa.pages.ForgetPassPage;
import com.fb.qa.testdata.DataFile;

public class ForgetPassBtnTest extends TestBase {

	ForgetPassPage fp;
	DataFile df = new DataFile();

	public ForgetPassBtnTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		// driver.findElement(By.xpath("//div[@class='_6ltj']/a")).click();
		fp = new ForgetPassPage();
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(priority = 1)
	public void EmptyEmailSearch() throws InterruptedException {
		fp.clickOnForgetPassBtn();
		fp.EnterEmail("");
		Thread.sleep(2000);

		// String expectedErr = df.emptyEmailErr;
		// String actualErr = fp.EmptyEmailErr();
		// System.out.println(actualErr);
		Assert.assertEquals(df.emptyEmailErr, fp.EmptyEmailErr());

	}

	@Test(priority = 2)
	public void WrongEmailSearch() throws InterruptedException {
		fp.clickOnForgetPassBtn();
		fp.EnterEmail(df.forgetPassEmail);
		Thread.sleep(2000);

		// String expectedErr = df.wrongEmailErr;
		// String actualErr = fp.WrongEmailErr();
		// System.out.println(actualErr);
		Assert.assertEquals(df.wrongEmailErr, fp.WrongEmailErr());
	}
}
