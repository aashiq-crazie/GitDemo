package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookItenaryPage;
import com.adactin.pom.BookingConfirmPage;
import com.adactin.pom.BookingHotelpage;
import com.adactin.pom.CancelHotelpage;
import com.adactin.pom.LogOutPage;
import com.adactin.pom.SearchHotelPage;
import com.adactin.pom.SelectHotelPage;
import com.adactin.pom.SignInPage;

public class PageObjectManager {
	public static WebDriver driver;
	
	private BookingConfirmPage bcp;
	private BookingHotelpage bhp;
	private BookItenaryPage bip;
	private CancelHotelpage chp;
	private LogOutPage lop;
	private SearchHotelPage shp;
	private SignInPage sip;
	private SelectHotelPage sehp;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	
	public BookingConfirmPage getBcp() {
		bcp=new BookingConfirmPage(driver);
		return bcp;
	}
	public BookingHotelpage getBhp() {
		bhp=new BookingHotelpage(driver);
		return bhp;
	}
	public BookItenaryPage getBip() {
		bip=new BookItenaryPage(driver);
		return bip;
	}
	public CancelHotelpage getChp() {
		chp=new CancelHotelpage(driver);
		return chp;
	}
	public LogOutPage getLop() {
		lop=new LogOutPage(driver);
		return lop;
	}
	public SearchHotelPage getShp() {
		shp=new SearchHotelPage(driver);
		return shp;
	}
	public SignInPage getSip() {
		sip=new SignInPage(driver);
		return sip;
	}
	public SelectHotelPage getSehp() {
		sehp=new SelectHotelPage(driver);
		return sehp;
	}
	
	

}
