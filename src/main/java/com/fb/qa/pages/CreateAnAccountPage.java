package com.fb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fb.qa.base.TestBase;

public class CreateAnAccountPage extends TestBase{
	

	@FindBy(linkText = "Create new account")
	@CacheLookup
	WebElement createAnAccountBtn;
	
	@FindBy(xpath = "//img[@class='_8idr img']")
	WebElement closeCreateAnAccountPage;
	
	@FindBy(name = "lastname")
	WebElement lastname;
	
	@FindBy(name = "reg_email__")
	WebElement emailOrMobNum;
	
	@FindBy(name = "reg_passwd__")
	WebElement password;
	
//	@FindBy(name = "birthday_month")
//	WebElement month;
//	
//	@FindBy(name = "birthday_day")
//	WebElement day;
//	
//	@FindBy(name = "birthday_year")
//	WebElement year;
	
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	WebElement gender;
	
	@FindBy(name = "websubmit")
	WebElement submit;
	
	@FindBy(xpath = "//div[@id='js_2js']")
	WebElement firstNameErr;
	
	
	public CreateAnAccountPage() {
		PageFactory.initElements(driver, this);
	}
	public void CreateAnAccountBtn() {
		createAnAccountBtn.click();
	}
	public void fillNewAccountForm(String ltname, String email, String Password, String m, String d, String y ) throws InterruptedException {
		lastname.sendKeys(ltname);
		emailOrMobNum.sendKeys(email);
		password.sendKeys(Password);
	
		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByValue(String.valueOf((int)Double.parseDouble(m)));

		Select s1 = new Select(driver.findElement(By.id("day")));
		s1.selectByValue(String.valueOf((int)Double.parseDouble(d)));
		
		Select s2 = new Select(driver.findElement(By.id("year")));
		s2.selectByValue(String.valueOf((int)Double.parseDouble(y)));
		
		gender.click();
		submit.click();
	}
	
	
	public void closeCreateAnAccountPage() {
		closeCreateAnAccountPage.click();
	}
	
}
