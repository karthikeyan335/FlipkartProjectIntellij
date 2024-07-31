package org.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	// browser launch 1
	public static WebDriver launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;

	}
	
	// url launch
	public static void urlLaunch(String url) {

		driver.get(url);
	}

	// maximize
	public static void maximize() {

		driver.manage().window().maximize();
	}

	// duration
	public static void implicitWait(long secs) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// sendkeys
	public static void sendkeys(WebElement e, String value) {

		e.sendKeys(value);
	}

	// clear
	public static void clear(WebElement e) {

		e.clear();
	}

	// click
	public static void click(WebElement e) {

		e.click();
	}

	// current url print
	public static String getCurrentUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	// current title print
	public static String getTitle() {

		String title = driver.getTitle();
		return title;
	}

	// close the current tab
	public static void close() {

		driver.close();
	}

	// close the browser
	public static void browserQuit() {

		driver.quit();
	}

	// print the text from webpage
	public static String getText(WebElement e) {

		String txt = e.getText();
		return txt;
	}

	public static String getAttribute(WebElement e) {

		String att = e.getAttribute("value");
		return att;
	}

	
	public static void moveToElement(WebElement e) {

		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}


	// drop and down
	public static void selectByIndex(WebElement e, int i) {

		Select s = new Select(e);
		s.selectByIndex(i);
	}

	public static void selectByValue(WebElement e, String value) {

		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement e, String text) {

		Select s = new Select(e);
		s.selectByVisibleText(text);
	}

	public static void selectAll(WebElement e, int count) {

		Select s = new Select(e);
		for (int i = 0; i < count; i++) {
			s.selectByIndex(i);
		}
	}

	// screenshot
	public static void screenShot(String screenName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dec = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + screenName +"_"+System.currentTimeMillis()+ ".png");
		FileUtils.copyFile(src, dec);
	}

	// java script executor

	public static void jsSendKeys(WebElement e, String name) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + name + "')", e);

	}

	public static void jsClick(WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", e);

	}

	public static void jsScrollDown(WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}

	public static void jsScrollUp(WebElement e) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}



	public static void windowsHandlingIndex(int a) {

		Set<String> allId = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(allId);
		driver.switchTo().window(li.get(a));
	}


	public static String getPropertyValue(String key) {
		String s = null;
		try {
			Properties p = new Properties();
			p.load(new FileReader(
					System.getProperty("user.dir") + "\\src\\test\\resources\\Config\\config.properties"));
			s = p.get(key).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;

	}
	
}
