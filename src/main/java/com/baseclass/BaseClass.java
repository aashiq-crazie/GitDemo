package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class BaseClass {

	// 1.Browser Launch

	public static WebDriver driver;
	public static WebElement findElement;

	public static WebDriver browserLaunch(String browsername) {

		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\Eclipse Programs\\AdactinCucumber\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"E:\\Eclipse Programs\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid Browsername");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;

	}
	// 2.Get Url

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// 3.Implicit Wait

	public static void implicitwait(int number) {
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);

	}

	public static void waitVisbility(WebElement findElement) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(findElement));

	}
	// 4.Close

	public static void close() {
		driver.close();

	}
	// 5.Quit

	public static void quit() {
		driver.quit();

	}
	// 6.Navigate To

	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}
	// 7.Navigate Back

	public static void navigateBack() {
		driver.navigate().back();

	}
	// 8.Navigate Forward

	public static void navigateForward() {
		driver.navigate().forward();

	}
	// 9.Navigate Refresh

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}

	// 10.get
	// 11.Alert
	// Simple Alert
	public static void simpleAlert() {
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ConfirmAlert
	public static void confirmAlert() {
		Alert confirmOption = driver.switchTo().alert();
		confirmOption.dismiss();

	}

	// PromptAlert
	public static void promptAlert(String Value) {
		Alert promptOption = driver.switchTo().alert();
		promptOption.sendKeys(Value);
		promptOption.accept();
	}

	// 12.Action:
	// MouseHover Method
	public static void mouseHoverMeth(WebElement findElement) {
		Actions ac = new Actions(driver);
		ac.moveToElement(findElement).perform();

	}

	// Double Click Method
	public static void doubleClickMeth(WebElement findElement) {
		Actions ac = new Actions(driver);
		ac.doubleClick(findElement).perform();

	}

	// 13.Frames:
	// Frames using WebElement
	public static WebDriver framesWebElement(String option, WebElement findElement) {
		waitVisbility(findElement);
		if (option.equalsIgnoreCase("webElement")) {
			driver.switchTo().frame(findElement);
		}
		return driver;
	}

	// Frames usingId
	public static WebDriver framesId(String option, int index) {

		if (option.equalsIgnoreCase("id")) {
			driver.switchTo().frame(index);

		}
		return driver;

	}

	// Frames Using Name
	public static void framesName(String option, String name) {
		if (option.equalsIgnoreCase("name")) {
			driver.switchTo().frame(name);

		}

	}

	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	// 14.Robot

	// 15.Check Box
	// 16.Is Enable
	public static void isEnabled(WebElement findElement) {
		boolean enabled = findElement.isEnabled();
		System.out.println(enabled);

	}

	// 17.Is Displayed
	public static void isDisplayed(WebElement findElement) {
		boolean displayed = findElement.isDisplayed();
		System.out.println(displayed);

	}

	// 18.Is Selected
	public static void isSelected(WebElement findElement) {
		boolean selected = findElement.isSelected();
		System.out.println(selected);

	}

	// 19.Get Options
	public static void options(WebElement findElement) {
		Select sc4 = new Select(findElement);
		sc4.getOptions();

	}

	// 20.Get Title
	// 21.Get Current Url
	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	// 22.Get Text
	public static void getText(WebElement findElement) {
		findElement.getText();
	}

	// 23.Get attribute
	// 24.Wait(3)

	// 25.Take Screenshot

	public static void getScreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\Screenshots\\" + filename + ".png");
		FileUtils.copyFile(src, des);

	}

	// 26.Scroll Up and Scroll Down
	public static void scrollMethod(WebElement findElement) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", findElement);

	}

	// 27.Send Keys
	public static void sendKeys(WebElement findElement, String Value) {
		findElement.sendKeys(Value);
	}

	// 28.Get First Selected Options()
	public static void firstSelectedOption(WebElement findElement) {
		Select sc1 = new Select(findElement);
		sc1.getFirstSelectedOption();

	}

	// 29.Get All Selected Options()
	public static void allSelectedOption(WebElement findElement) {
		Select sc2 = new Select(findElement);
		sc2.getAllSelectedOptions();

	}

	// 30.Is Multiple
	public static void isMultiple(WebElement findElement) {
		Select sc3 = new Select(findElement);
		boolean multiple = sc3.isMultiple();
		System.out.println(multiple);

	}

	// 31.Click()
	public static void clickMethod(WebElement clickOption) {
		waitVisbility(clickOption);
		clickOption.click();
	}

	public static void clickMethod2(WebElement clickOption) {
		clickOption.click();
	}

	// 32.Find element
	/*
	 * public static WebElement findWebElement(String option, String Value) { if
	 * (option.equalsIgnoreCase("id")) { findElement =
	 * driver.findElement(By.id(Value)); } else if (option.equalsIgnoreCase("name"))
	 * { findElement = driver.findElement(By.name(Value)); } else if
	 * (option.equalsIgnoreCase("xpath")) { findElement =
	 * driver.findElement(By.xpath(Value)); } return findElement;
	 * 
	 * }
	 */
	// 33.Drop Down
	public static WebElement dropDownMeth(WebElement findElement, String option, String value) {
		Select sc = new Select(findElement);
		if (option.equalsIgnoreCase("visibleText")) {
			sc.selectByVisibleText(value);

		} else if (option.equalsIgnoreCase("Value")) {
			sc.selectByValue(value);

		} else if (option.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(value));

		}
		return findElement;

	}

	// 34.Maximize
	public static void maximizeMeth() {
		driver.manage().window().maximize();

	}

}
