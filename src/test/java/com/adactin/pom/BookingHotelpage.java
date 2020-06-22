package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotelpage {

	public WebDriver driver;

	// firstname id=first_name
	// lastName id=last_name
	// address id=address
	// cardnumber id=cc_num
	// cardType id=cc_type
	// month id=cc_exp_month
	// expyear id=cc_exp_year
	// ccvnumber id=cc_cvv
	// booknow id=book_now

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement cardNumber;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	/*
	 * @FindBy(xpath = "//*[@id=\"cc_type\"]/option[2]") private WebElement
	 * selectCardType;
	 */
	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;
	/*
	 * @FindBy(xpath = "//*[@id=\"cc_exp_month\"]/option[3]") private WebElement
	 * selectExpMonth;
	 */
	@FindBy(id = "cc_exp_year")
	private WebElement expYear;
	/*
	 * @FindBy(xpath = "//*[@id=\"cc_exp_year\"]/option[4]") private WebElement
	 * selectExpyear;
	 */
	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;
	@FindBy(id = "book_now")
	private WebElement booknowButton;

	public BookingHotelpage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBooknowButton() {
		return booknowButton;
	}

}
