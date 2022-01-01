package com.ujian6_ibnukemal.shopdemoqa.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;

public class ItemShoesPage {

private WebDriver driver;
	
	public ItemShoesPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#nav-menu-item-cart > a > span > i")
	private WebElement btnChart;
	
	public void clickChart() {
		btnChart.click();
	}
	
	@FindBy(css = "#post-6 > div > div > p.return-to-shop > a")
	private WebElement btnShop;
	
	public void clickReturnToShop() {
		btnShop.click();
	}
	
	@FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
	private WebElement itemShoes;
	
	public void clickShoes() {
		itemShoes.click();
	}
	
	@FindBy(css = "#pa_color > option.attached.enabled")
	private WebElement colors;
	
	@FindBy(css = "#pa_size > option:nth-child(2)")
	private WebElement size;
	
	@FindBy(xpath = "//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button")
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
	
	@FindBy(css = "#post-6 > div > div > form > table > tbody > tr:nth-child(2) > td > a.continue")
	private WebElement btnContinue;
	
	public void continueShopping() {
		btnContinue.click();
	}
	
}
