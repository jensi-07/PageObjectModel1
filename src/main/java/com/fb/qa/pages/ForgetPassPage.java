package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class ForgetPassPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "//div[@class='_6ltj']/a")
	@CacheLookup
	WebElement clickOnForgetPassBtn;

	@FindBy(xpath = "//div[@class='identify_yourself_block']/table/tbody/tr[2]/td[2]/input")
	WebElement email;

	@FindBy(name = "did_submit")
	WebElement search;

	@FindBy(xpath = "//div[@class='rfloat _ohf']/a")
	WebElement cancel;

	@FindBy(xpath = "//div[@class='pam uiBoxRed']/div[2]")
	WebElement EmptyEmailErr;

	@FindBy(xpath = "//div[contains(text(),'Please tr')]")
	WebElement WrongEmailErr;

	public ForgetPassPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnForgetPassBtn() {
		clickOnForgetPassBtn.click();
	}
	public void EnterEmail(String x) {
		
		email.sendKeys(x);
		search.click();
	}

	public String EmptyEmailErr() {
		String actualErr = EmptyEmailErr.getText();
		System.out.println(actualErr);
		return actualErr;

	}

	public String WrongEmailErr() {
		String actualErr = WrongEmailErr.getText();
		System.out.println(actualErr);
		return actualErr;

	}

	public void ClickOnCancelBtn() {
		cancel.click();
	}

}
