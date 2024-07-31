package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement MobileNumberorEmail;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement requestOtpButton;
	
	// Enter the OTP
	
	@FindBy(className="_1TOQfO")
	private WebElement userName;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutLogin;

	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMobileNumberorEmail() {
		return MobileNumberorEmail;
	}

	public WebElement getRequestOtpButton() {
		return requestOtpButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getLogoutLogin() {
		return logoutLogin;
	}
	
}
