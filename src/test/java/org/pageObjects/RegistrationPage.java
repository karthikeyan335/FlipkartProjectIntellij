package org.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class RegistrationPage extends BaseClass {
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	private WebElement signUpButton;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement MobileNumber;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement continueButton;
	
	// Enter the OTP 
	
	@FindBy(xpath="//span[text()='Signup']")
	private WebElement signUpAfterOTP;
	
	@FindBy(xpath="//span[text()='Account']")
	private WebElement accountButton;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//span[text()='Edit']")
	private WebElement nameEditReg;
	
	@FindBy(name="firstName")
	private WebElement firstNameReg;
	
	@FindBy(name="lastName")
	private WebElement lastNameReg;
	
	@FindBy(xpath="//span[text()='Male']")
	private WebElement male;
	
	@FindBy(xpath="//span[text()='Female']")
	private WebElement female;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement nameSave;
	
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	private WebElement emailEdit;
	
	@FindBy(name="email")
	private WebElement emailReg;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement emailSave;
	
	// verify OTP
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logoutReg;

	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSignUpAfterOTP() {
		return signUpAfterOTP;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getNameEditReg() {
		return nameEditReg;
	}

	public WebElement getFirstNameReg() {
		return firstNameReg;
	}

	public WebElement getLastNameReg() {
		return lastNameReg;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getNameSave() {
		return nameSave;
	}

	public WebElement getEmailEdit() {
		return emailEdit;
	}

	public WebElement getEmailReg() {
		return emailReg;
	}

	public WebElement getEmailSave() {
		return emailSave;
	}

	public WebElement getLogoutReg() {
		return logoutReg;
	}

}
