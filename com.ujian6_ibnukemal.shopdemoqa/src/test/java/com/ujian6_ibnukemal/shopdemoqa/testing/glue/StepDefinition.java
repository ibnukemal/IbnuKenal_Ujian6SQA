package com.ujian6_ibnukemal.shopdemoqa.testing.glue;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.ujian6_ibnukemal.shopdemoqa.utils.ConfigProperties;
import com.ujian6_ibnukemal.shopdemoqa.driver.DriverSingleton;
import com.ujian6_ibnukemal.shopdemoqa.utils.TestCases;
import com.ujian6_ibnukemal.shopdemoqa.utils.Utils;
import com.ujian6_ibnukemal.shopdemoqa.utils.Constants;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.ujian6_ibnukemal.shopdemoqa.configuration.AutomationFrameworkConfig;
import com.ujian6_ibnukemal.shopdemoqa.locator.CheckoutPage;
import com.ujian6_ibnukemal.shopdemoqa.locator.ItemGlassPage;
import com.ujian6_ibnukemal.shopdemoqa.locator.ItemShoesPage;
import com.ujian6_ibnukemal.shopdemoqa.locator.LoginPage;
import com.ujian6_ibnukemal.shopdemoqa.locator.RegisterPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private WebDriver driver;
	private RegisterPage regist;
	private LoginPage login;
	private ItemShoesPage shoes;
	private ItemGlassPage glass;
	private CheckoutPage checkout;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports("src/main/resources/TestReport.html");
	
	@Autowired
	ConfigProperties configProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configProperties.getBrowser());
		regist = new RegisterPage();
		login = new LoginPage();
		shoes = new ItemShoesPage();
		glass = new ItemGlassPage();
		checkout = new CheckoutPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.startTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("^User go to the Website")
	public void User_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(LogStatus.PASS, "Navigating to " + Constants.URL);
	}
	
	@When("^User click dismis")
	public void User_click_dismis() {
		regist.clickDismis();
		extentTest.log(LogStatus.PASS, "User click dismis");
	}
	
	@When("^User click button MyAccount")
	public void User_click_button_MyAccount() {
		regist.goToRegister();
		extentTest.log(LogStatus.PASS, "User click button MyAccount");
	}
	
	@When("^User input username email and password")
	public void User_input_username_email_and_password() {
		regist.registData(configProperties.getUsername(), configProperties.getEmail(), configProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input username email and password");
	}
	
	@When("^User input userlogin and password")
	public void User_input_userlogin_and_password() {
		login.login(configProperties.getUsername(), configProperties.getPassword());
		extentTest.log(LogStatus.PASS, "User input userlogin and password");
	}
	
	@When("^User click button Chart")
	public void User_click_button_Chart() {
		shoes.clickChart();
		extentTest.log(LogStatus.PASS, "User click button Chart");
	}
	
	@When("^User click button Shop")
	public void User_click_button_Shop() {
		shoes.clickReturnToShop();
		extentTest.log(LogStatus.PASS, "User click button Shop");
	}
	
	@When("^User click Shoes")
	public void User_click_Shoes() {
		shoes.clickShoes();
		extentTest.log(LogStatus.PASS, "User click Shoes");
	}
	
	@When("^User choose colors size and click addToChart")
	public void User_choose_colors_size_and_click_addToChart() {
		shoes.addChart();
		extentTest.log(LogStatus.PASS, "User choose colors size and click addToChart");
	}
	
	@When("^User click view chart")
	public void User_click_view_chart() {
		shoes.viewChart();
		extentTest.log(LogStatus.PASS, "User click view chart");
	}
	
	@When("^User click page two")
	public void User_click_page_two() {
		glass.clickPage2();
		extentTest.log(LogStatus.PASS, "User click page two");
	}
	
	@When("^User click Glasses")
	public void User_click_Glasses() {
		glass.clickGlasses();
		extentTest.log(LogStatus.PASS, "User click Glasses");
	}
	
	@When("^User choose colors size and click addChart")
	public void User_choose_colors_size_and_click_addChart() {
		glass.addChart();
		extentTest.log(LogStatus.PASS, "User choose colors size and click addChart");
	}
	
	@When("^User click view charts")
	public void User_click_view_charts() {
		glass.viewChart();
		extentTest.log(LogStatus.PASS, "User click view charts");
	}
	
	@When("^User fill the form")
	public void User_fill_the_form() {
		checkout.isiForm(configProperties.getFirstname(), configProperties.getLastname(), configProperties.getAddress(), configProperties.getTown(), configProperties.getPostcode(), configProperties.getPhone());
		extentTest.log(LogStatus.PASS, "User fill the form");
	}
	
	@When("^User click check terms")
	public void User_click_check_terms() {
		checkout.termsCondition();
		extentTest.log(LogStatus.PASS, "User click check terms");
	}
	
	@Then("^User click regist")
	public void User_click_regist() {
		regist.clickRegist();
		extentTest.log(LogStatus.PASS, "User click regist");
	}
	
	@Then("^User click login")
	public void User_click_login() {
		login.clickLogin();
		extentTest.log(LogStatus.PASS, "User click login");
	}
	
	@Then("^User click continue")
	public void User_click_continue() {
		shoes.continueShopping();
		extentTest.log(LogStatus.PASS, "User click continue");
	}
	
	@Then("^User click proceed to checkout")
	public void User_click_proceed_to_checkout() {
		glass.goToCheckOut();
		extentTest.log(LogStatus.PASS, "User click proceed to checkout");
	}
	
	@Then("^User click button place order")
	public void User_click_button_place_order() {
		checkout.clickOrder();
		extentTest.log(LogStatus.PASS, "User click button place order");
	}
	
	@After
	public void closeObject() {
		report.endTest(extentTest);
		report.flush();
	}
	
}
