package com.ujian6_ibnukemal.shopdemoqa.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;

public class RegisterPage {

	private WebDriver driver;
	
	public RegisterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="/html/body/p/a")
	private WebElement btnDismis;
	
	@FindBy(css = "#noo-site > header > div.noo-topbar > div > ul.pull-right.noo-topbar-right > li:nth-child(2) > a")
	private WebElement btnAccount;
	
	public void clickDismis() {
		btnDismis.click();
	}
	
	public void goToRegister(){
		btnAccount.click();
	}
	
	@FindBy(id = "reg_username" )
	private WebElement txtUsername;
	
	@FindBy(id = "reg_email")
	private WebElement txtEmail;
	
	@FindBy(id = "reg_password")
	private WebElement txtPassword;
	
	@FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(5) > button")
	private WebElement btnRegister;
	
	public void registData(String username, String email, String password) {
		txtUsername.sendKeys(username);
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
	}
	
	public void clickRegist() {
		btnRegister.click();
	}
	
	
}
