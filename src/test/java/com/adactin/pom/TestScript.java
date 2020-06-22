package com.adactin.pom;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

public class TestScript extends BaseClass {
	public static WebDriver driver;

	@Test
	public void testAdactIn() {
		driver = browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com/index.php");
		maximizeMeth();

		SignInPage sp = new SignInPage(driver);
		sendKeys(sp.getUsername(), "PavithraN");
		sendKeys(sp.getPassword(), "Pavi@2426");
		clickMethod(sp.getLogin());

		SearchHotelPage hp = new SearchHotelPage(driver);
		dropDownMeth(hp.getLocation(), "value", "Melbourne");
		dropDownMeth(hp.getRoom(), "value", "2");
		sendKeys(hp.getCheckInDate(), "20/05/2020");
		sendKeys(hp.getCheckOutDate(), "21/05/2020");
		dropDownMeth(hp.getAdultsPerRoom(), "value", "2");
		clickMethod(hp.getSearchId());

		SelectHotelPage shp = new SelectHotelPage(driver);
		clickMethod(shp.getRadioButton());
		clickMethod(shp.getContinueButton());

		BookingHotelpage bhp = new BookingHotelpage(driver);
		sendKeys(bhp.getFirstName(), "Aashiq");
		sendKeys(bhp.getLastName(), "crazie");
		sendKeys(bhp.getAddress(), "No.423, gasidbikygcb.shgfdg,shgd.");
		sendKeys(bhp.getCardNumber(), "1234567899632587");
		dropDownMeth(bhp.getCardType(), "value", "AMEX");
		dropDownMeth(bhp.getExpMonth(), "value", "2");
		dropDownMeth(bhp.getExpYear(), "value", "2020");
		sendKeys(bhp.getCvvNumber(), "123");
		clickMethod(bhp.getBooknowButton());

		BookingConfirmPage bcp = new BookingConfirmPage(driver);
		clickMethod(bcp.getItenaryButton());

		BookItenaryPage bip = new BookItenaryPage(driver);
		// sendKeys(bip.getSearchBox(), "91Z6F03M28");
		// clickMethod(bip.getGoButton());
		clickMethod(bip.getRadioButton());
		// clickMethod(bip.getRadioButtion2());

		CancelHotelpage chp = new CancelHotelpage(driver);
		clickMethod(chp.getCancelButton());
		simpleAlert();

		LogOutPage lop = new LogOutPage(driver);
		scrollMethod(lop.getScrollDown());
		clickMethod(lop.getLogout());

	}

}
