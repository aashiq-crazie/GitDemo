package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookItenaryPage {
	public WebDriver driver;
	// *[@id="booked_form"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input
	
	//@FindBy(id="order_id_text")
	//private WebElement searchBox;

	//public WebElement getSearchBox() {
		//return searchBox;
	//}
	
	//@FindBy(id="search_hotel_id")
	//private WebElement goButton;

//	public WebElement getGoButton() {
		//return goButton;
//	}
	
	//@FindBy(name="ids[]")
	//private WebElement radioButtion2;

	//public WebElement getRadioButtion2() {
	//	return radioButtion2;
//	}

	
	@FindBy(xpath = "//input[@value='Aashiq']//parent::td//preceding-sibling::td[4]")
	private WebElement radioButton;
	
	//"//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input"
	

	/*
	 * public WebElement getCancelButton() { return cancelButton; }
	 * 
	 * @FindBy(name = "cancelall") private WebElement cancelButton;
	 */

	public BookItenaryPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getRadioButton() {
		return radioButton;
	}
}
