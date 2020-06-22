package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.BookItenaryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.BookingHotelpage;
import com.adactin.pom.CancelHotelpage;
import com.adactin.pom.LogOutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;
import com.adactin.pom.SignInPage;
import com.adactin.runner.Runner;
import com.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
		System.out.println("LoggedIn");
	}

	@Given("^goes to landing page$")
	public void goes_to_landing_page() throws Throwable {
		System.out.println("Landing Pages");
	}

	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String Url = FileReaderManager.getInstance().getCRInstance().getUrl();
		getUrl(Url);
	}

	/*
	 * @When("^User enter the valid username$") public void
	 * user_enter_the_valid_username() throws Throwable {
	 * sendKeys(pom.getSip().getUsername(), "PavithraN"); }
	 * 
	 * @When("^User enter the valid password$") public void
	 * user_enter_the_valid_password() throws Throwable {
	 * sendKeys(pom.getSip().getPassword(), "Pavi@2426"); }
	 */

	@When("^User enter the \"([^\"]*)\" valid username$")
	public void user_enter_the_valid_username(String username) throws Throwable {
		sendKeys(pom.getSip().getUsername(), username);
	}

	@When("^User enter the \"([^\"]*)\" valid password$")
	public void user_enter_the_valid_password(String password) throws Throwable {
		sendKeys(pom.getSip().getPassword(), password);
	}

	@When("^User enter the login button$")
	public void user_enter_the_login_button() throws Throwable {
		clickMethod(pom.getSip().getLogin());
	}

	@Then("^It lands to the homepage successfully$")
	public void it_lands_to_the_homepage_successfully() throws Throwable {
		System.out.println("Navigate homepage sucessfully");
	}

	@Given("^User select the required location$")
	public void user_select_the_required_location() throws Throwable {
		dropDownMeth(pom.getShp().getLocation(), "value", "Melbourne");
	}

	@When("^User select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		dropDownMeth(pom.getShp().getRoom(), "value", "2");
	}

	@When("^User mentioning checkin date$")
	public void user_mentioning_checkin_date() throws Throwable {
		sendKeys(pom.getShp().getCheckInDate(), "20/05/2020");
	}

	@When("^User mentioning checkout date$")
	public void user_mentioning_checkout_date() throws Throwable {
		sendKeys(pom.getShp().getCheckOutDate(), "21/05/2020");
	}

	@When("^User selecting adults per room$")
	public void user_selecting_adults_per_room() throws Throwable {
		dropDownMeth(pom.getShp().getAdultsPerRoom(), "value", "2");
	}

	@When("^User enter the search button$")
	public void user_enter_the_search_button() throws Throwable {
		clickMethod(pom.getShp().getSearchId());
	}

	@Then("^It lands to the nextpage succesfully$")
	public void it_lands_to_the_nextpage_succesfully() throws Throwable {
		System.out.println("Navigating nextpage succesfully");
	}

	@Given("^User select his favourite hotel$")
	public void user_select_his_favourite_hotel() throws Throwable {
		clickMethod(pom.getSehp().getRadioButton());
	}

	@When("^User enter the continue button$")
	public void user_enter_the_continue_button() throws Throwable {
		clickMethod(pom.getSehp().getContinueButton());
	}

	/*
	 * @Given("^User mentioning firstname$") public void user_mentioning_firstname()
	 * throws Throwable { sendKeys(pom.getBhp().getFirstName(), "Aashiq"); }
	 * 
	 * @When("^User mentioning lastname$") public void user_mentioning_lastname()
	 * throws Throwable { sendKeys(pom.getBhp().getLastName(), "crazie"); }
	 */

	@Given("^User mentioning \"([^\"]*)\" firstname$")
	public void user_mentioning_firstname(String firstname) throws Throwable {
		sendKeys(pom.getBhp().getFirstName(), firstname);
	}

	@When("^User mentioning \"([^\"]*)\" lastname$")
	public void user_mentioning_lastname(String lastname) throws Throwable {
		sendKeys(pom.getBhp().getLastName(), lastname);
	}

	@When("^User mentioning billing address$")
	public void user_mentioning_billing_address() throws Throwable {
		sendKeys(pom.getBhp().getAddress(), "No.423, gasidbikygcb.shgfdg,shgd.");
	}

	@When("^User mentioning creditcard number$")
	public void user_mentioning_creditcard_number() throws Throwable {
		sendKeys(pom.getBhp().getCardNumber(), "1234567899632587");
	}

	@When("^User selecting creditcard type$")
	public void user_selecting_creditcard_type() throws Throwable {
		dropDownMeth(pom.getBhp().getCardType(), "value", "AMEX");
	}

	@When("^User mentioning month of expiry$")
	public void user_mentioning_month_of_expiry() throws Throwable {
		dropDownMeth(pom.getBhp().getExpMonth(), "value", "2");
	}

	@When("^user mentioning year of expiry$")
	public void user_mentioning_year_of_expiry() throws Throwable {
		dropDownMeth(pom.getBhp().getExpYear(), "value", "2020");
	}

	@When("^User mentioning the cvv number$")
	public void user_mentioning_the_cvv_number() throws Throwable {
		sendKeys(pom.getBhp().getCvvNumber(), "123");
	}

	@When("^User enter the booknow button$")
	public void user_enter_the_booknow_button() throws Throwable {
		clickMethod(pom.getBhp().getBooknowButton());

	}

	@Then("^It lands to nextpage succesfully$")
	public void it_lands_to_nextpage_succesfully() throws Throwable {
		System.out.println("Sussecfully loads to next page");
	}

	@Given("^User enter the myitenary button$")
	public void user_enter_the_myitenary_button() throws Throwable {
		clickMethod(pom.getBcp().getItenaryButton());
	}

	@Given("^User selecting reqiured hotel to cancel$")
	public void user_selecting_reqiured_hotel_to_cancel() throws Throwable {
		clickMethod(pom.getBip().getRadioButton());
	}

	@Given("^User enter the cancel button$")
	public void user_enter_the_cancel_button() throws Throwable {
	//	clickMethod(pom.getChp().getCancelButton());
	}

	@When("^user confirming the cancellation$")
	public void user_confirming_the_cancellation() throws Throwable {
		simpleAlert();
	}

	@Then("^It loads to nextpage succesfully$")
	public void it_loads_to_nextpage_succesfully() throws Throwable {
		System.out.println("Succesfully loaded to nextpage");

	}

	@Given("^User enter the logoutbutton$")
	public void user_enter_the_logoutbutton() throws Throwable {
		clickMethod(pom.getLop().getLogout());
	}

	@Then("^It loads to final page succefully$")
	public void it_loads_to_final_page_succefully() throws Throwable {
	}

}
