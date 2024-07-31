package org.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class ProductPage extends BaseClass {
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickSearchBox;
	
	@FindBy(xpath="(//a[text()='Laptops'])[2]")
	private WebElement verifyLaptop;
	
	@FindBy(className="KzDlHZ")
	private List<WebElement> productName;
	
	@FindBy(id="pincodeInputId")
	private WebElement pincode;
	
	@FindBy(xpath="//span[text()='Check']")
	private WebElement checkPincode;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrderButton;
	
	@FindBy(name="name")
	private WebElement deliverName;
	
	@FindBy(name="phone")
	private WebElement deliverPhone;
	
	@FindBy(name="pincode")
	private WebElement deliverPincode;
	
	@FindBy(name="addressLine2")
	private WebElement deliverLocality;
	
	@FindBy(name="addressLine1")
	private WebElement deliverAddress;
	
	@FindBy(name="city")
	private WebElement deliverCity;
	
	@FindBy(name="state")
	private WebElement deliverState;
	
	@FindBy(name="landmark")
	private WebElement deliverLandmark;
	
	@FindBy(name="alternatePhone")
	private WebElement deliverAlternatePhone;
	
	@FindBy(xpath="//span[text()='Work (Delivery between 10 AM - 5 PM)']")
	private WebElement deliverWork;
	
	@FindBy(xpath="//span[text()='Home (All day delivery)']")
	private WebElement deliverHome;
	
	@FindBy(xpath="//button[text()='Save and Deliver Here']")
	private WebElement saveAndDeliverHere;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailId;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement orderSummaryContinue;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement acceptAndContinue;
	
	@FindBy(className="W5mR4e")
	private WebElement flipkartHomePage;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logout;
	
	@FindBy(className="_30XB9F")
	private WebElement clickCloseButton;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement verifyLogout;
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getClickSearchBox() {
		return clickSearchBox;
	}

	public WebElement getVerifyLaptop() {
		return verifyLaptop;
	}
	
	public List<WebElement> getProductName() {
		return productName;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCheckPincode() {
		return checkPincode;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public WebElement getDeliverName() {
		return deliverName;
	}

	public WebElement getDeliverPhone() {
		return deliverPhone;
	}

	public WebElement getDeliverPincode() {
		return deliverPincode;
	}

	public WebElement getDeliverLocality() {
		return deliverLocality;
	}

	public WebElement getDeliverAddress() {
		return deliverAddress;
	}

	public WebElement getDeliverCity() {
		return deliverCity;
	}

	public WebElement getDeliverState() {
		return deliverState;
	}

	public WebElement getDeliverLandmark() {
		return deliverLandmark;
	}

	public WebElement getDeliverAlternatePhone() {
		return deliverAlternatePhone;
	}

	public WebElement getDeliverWork() {
		return deliverWork;
	}

	public WebElement getDeliverHome() {
		return deliverHome;
	}

	public WebElement getSaveAndDeliverHere() {
		return saveAndDeliverHere;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getOrderSummaryContinue() {
		return orderSummaryContinue;
	}

	public WebElement getAcceptAndContinue() {
		return acceptAndContinue;
	}

	public WebElement getFlipkartHomePage() {
		return flipkartHomePage;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getClickCloseButton() {
		return clickCloseButton;
	}

	public WebElement getVerifyLogout() {
		return verifyLogout;
	}

	
}
