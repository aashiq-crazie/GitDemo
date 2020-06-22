package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public WebDriver driver;
	// radiobutton id=radiobutton_1

	@FindBy(id = "radiobutton_1")
	private WebElement radioButton;

	@FindBy(id = "continue")
	private WebElement continueButton;

	public SelectHotelPage(WebDriver driverl) {
		this.driver = driverl;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
