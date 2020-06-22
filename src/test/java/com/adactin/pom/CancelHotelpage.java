package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelHotelpage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement cancelButton;

	public CancelHotelpage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

}
