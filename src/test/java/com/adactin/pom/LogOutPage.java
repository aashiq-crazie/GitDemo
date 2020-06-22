package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	public WebDriver driver;

	@FindBy(id = "logout")
	private WebElement logout;
	@FindBy(id="search_hotel")
	private WebElement scrollDown;

	public WebElement getScrollDown() {
		return scrollDown;
	}

	public LogOutPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogout() {
		return logout;
	}

}
