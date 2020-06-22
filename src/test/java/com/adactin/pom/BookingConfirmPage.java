package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage {
	public WebDriver driver;
	// my_itinerary

	@FindBy(id = "my_itinerary")
	private WebElement itenaryButton;

	public BookingConfirmPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItenaryButton() {
		return itenaryButton;
	}

}
