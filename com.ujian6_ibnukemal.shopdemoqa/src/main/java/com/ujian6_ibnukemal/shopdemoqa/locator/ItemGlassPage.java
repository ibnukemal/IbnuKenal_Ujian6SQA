package com.ujian6_ibnukemal.shopdemoqa.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;

public class ItemGlassPage {

	private WebDriver driver;
	
	public ItemGlassPage() {
		driver= DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > nav > ul > li:nth-child(2) > a")
	private WebElement btnPage2;
	
	public void clickPage2() {
		btnPage2.click();
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[12]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
	private WebElement btnGlasses;
	
	public void clickGlasses() {
		btnGlasses.click();
	}
	
	@FindBy(css = "#pa_color > option:nth-child(3)")
	private WebElement colors;
	
	@FindBy(css = "#pa_size > option.attached.enabled")
	private WebElement size;
	
	@FindBy(xpath = "//*[@id=\"product-1326\"]/div[1]/div[2]/form/div/div[2]/button")
	private WebElement addToChart;
	
	public void addChart() {
		colors.click();
		size.click();
		addToChart.click();
	}
	
	@FindBy(css = "#noo-site > div.noo-container-shop.noo-shop-wrap.noo-shop-single-fullwidth > div > div > div.woocommerce-notices-wrapper > div > a")
	private WebElement viewChart;
	
	public void viewChart() {
		viewChart.click();
	}
	
	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div.cart_totals > div > a")
	private WebElement btnProceedCheckout;
	
	public void goToCheckOut() {
		btnProceedCheckout.click();
	}
	
}
