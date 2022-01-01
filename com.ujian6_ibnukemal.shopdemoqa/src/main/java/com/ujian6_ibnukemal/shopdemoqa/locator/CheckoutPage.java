package com.ujian6_ibnukemal.shopdemoqa.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;

public class CheckoutPage {

private WebDriver driver;
	
	public CheckoutPage() {
		driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "billing_first_name")
	private WebElement txtFirstname;
	
	@FindBy(id = "billing_last_name")
	private WebElement txtLastname;
	
	@FindBy(css = "#billing_country > option:nth-child(104)")
	private WebElement lstCountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement txtAddress;
	
	@FindBy(id = "billing_city")
	private WebElement txtTown;
	
	@FindBy(css = "#billing_state > option:nth-child(6)")
	private WebElement lstProvince;
	
	@FindBy(id = "billing_postcode")
	private WebElement txtPostcode;
	
	@FindBy(id = "billing_phone")
	private WebElement txtPhone;
	
	public void isiForm(String firstname, String lastname, String address, String town, String postcode, String phone) {
		txtFirstname.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		lstCountry.click();
		txtAddress.sendKeys(address);
		txtTown.sendKeys(town);
		lstProvince.click();
		txtPostcode.sendKeys(postcode);
		txtPhone.sendKeys(phone);
	}
	
	@FindBy(css = "#payment > div > div > p")
	private WebElement checkTerms;
	
	public void termsCondition() {
		checkTerms.click();
	}
	
	@FindBy(id = "place_order")
	private WebElement btnOrder;
	
	public void clickOrder() {
		btnOrder.click();
	}
}
