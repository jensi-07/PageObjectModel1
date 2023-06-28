package com.fb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page factory

	@FindBy(id = "email")
	@CacheLookup
	WebElement username;

	@FindBy(id= "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@class='_9ay7']")
	WebElement EmptyEmailErr;

	@FindBy(xpath = "//div[@class='_9ay7']")
	WebElement EmptyPassErr;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String email, String psword) throws InterruptedException {
		username.sendKeys(email);
		password.sendKeys(psword);
		
		Thread.sleep(2000);
		
		//loginBtn.click();
	}
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	public String EmptyEmailErr() {
		String ActualErr = EmptyEmailErr.getText();
		System.out.println(ActualErr);
		return ActualErr;
	}
	
	public String EmptyPassErr() {
		String ActualErr = EmptyPassErr.getText();
		return ActualErr;
	}
	
}