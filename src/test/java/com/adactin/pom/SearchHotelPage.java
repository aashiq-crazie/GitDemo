package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {

	public WebDriver driver;

	// location id=location
	// rooms id=room_nos
	// checkindate id=datepick_in
	// checkoutdate id=datepick_out
	// adultsperroom id=adult_room
	// search id=Submit

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "room_nos")
	private WebElement room;

	@FindBy(id = "datepick_in")
	private WebElement checkInDate;

	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;

	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;

	@FindBy(id = "Submit")
	private WebElement searchId;

	public SearchHotelPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getSearchId() {
		return searchId;
	}

}
