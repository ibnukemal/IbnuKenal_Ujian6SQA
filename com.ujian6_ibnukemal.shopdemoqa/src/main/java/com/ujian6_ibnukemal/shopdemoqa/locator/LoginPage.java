package com.ujian6_ibnukemal.shopdemoqa.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;

public class LoginPage {

private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "user_login")
	private WebElement txtUserLogin;
	
	@FindBy(id = "user_pass")
	private WebElement txtUserPass;
	
	@FindBy(id = "wp-submit")
	private WebElement btnLogin;
	
	public void login(String username, String password) {
		txtUserLogin.sendKeys(username);
		txtUserPass.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}
