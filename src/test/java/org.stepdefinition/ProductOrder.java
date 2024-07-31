package org.stepdefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.pageObjects.LoginPage;
import org.pageObjects.ProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.utility.BaseClass;

public class ProductOrder extends BaseClass {
	
	LoginPage l;
	
	ProductPage p;
	
	@Given("The user should be in flipkart homepage")
	public void the_user_should_be_in_flipkart_homepage() {
		
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() {
	    l=new LoginPage();
		click(l.getLoginButton());
	}

	@When("User should enter the valid phone number or email and click request OTP button")
	public void user_should_enter_the_valid_phone_number_or_email_and_click_request_OTP_button() {
	    sendkeys(l.getMobileNumberorEmail(), getPropertyValue("username"));
	    click(l.getRequestOtpButton());
	}

	@Then("The user should wait for one minutes to enter otp and automatically enter to home page")
	public void the_user_should_wait_for_one_minutes_to_enter_otp_and_automatically_enter_to_home_page() throws InterruptedException {
		Thread.sleep(30000);
	}

	@Then("The user should verify the username in home page")
	public void the_user_should_verify_the_username_in_home_page() {
	    WebElement userName = l.getUserName();
		String text = userName.getText();
		Assert.assertEquals("Verify Username", text, getPropertyValue("first_name"));
	    System.out.println(text);
	    
	}
	
	@When("The user should enter the product name and click search button")
	public void the_user_should_enter_the_product_name_and_click_search_button() {
		p=new ProductPage();
		sendkeys(p.getSearchBox(), "laptop");
		click(p.getClickSearchBox());
	}

	@When("User should verify the relevent products came in the search page")
	public void user_should_verify_the_relevent_products_came_in_the_search_page() {
		WebElement laptop = p.getVerifyLaptop();
		String text = laptop.getText();
		Assert.assertTrue("Verify Product", text.contains("Laptops"));    
	   	
	}
	
	@Then("User click the first product of showed in page and enter the pincode")
	public void user_click_the_first_product_of_showed_in_page_and_enter_the_pincode() {
		List<WebElement> productName = p.getProductName();
		WebElement oneProduct = productName.get(0);
	    oneProduct.click();	
	    windowsHandlingIndex(1);
	    sendkeys(p.getPincode(),getPropertyValue("pincode"));
	    click(p.getCheckPincode());
	}

	@Then("User click the add to cart button and moved in to the place order page and click it")
	public void user_click_the_add_to_cart_button_and_moved_in_to_the_place_order_page_and_click_it() throws InterruptedException {
		Thread.sleep(3000);
		jsScrollDown(p.getAddToCartButton());
		click(p.getAddToCartButton());
		click(p.getPlaceOrderButton());
	}

	@Then("User enter the delivery address and click save and deliver here button")
	public void user_enter_the_delivery_address_and_click_save_and_deliver_here_button() throws InterruptedException {
		Thread.sleep(3000);
		sendkeys(p.getDeliverName(), getPropertyValue("first_name"));
	    sendkeys(p.getDeliverPhone(), getPropertyValue("mobile_number"));
	    sendkeys(p.getDeliverPincode(), getPropertyValue("pincode"));
	    sendkeys(p.getDeliverLocality(), getPropertyValue("locality"));
	    sendkeys(p.getDeliverAddress(), getPropertyValue("address"));
	    sendkeys(p.getDeliverCity(), getPropertyValue("city"));
	    selectByValue(p.getDeliverState(), getPropertyValue("state"));
	    sendkeys(p.getDeliverLandmark(), getPropertyValue("landmark"));
	    sendkeys(p.getDeliverAlternatePhone(),getPropertyValue("alt_mobile_number"));
	    click(p.getDeliverWork());
	    click(p.getSaveAndDeliverHere());
	}

	@Then("User enter email address for order confirmation and click continue button")
	public void user_enter_email_address_for_order_confirmation_and_click_continue_button() throws InterruptedException {
		Thread.sleep(3000);
		click(p.getOrderSummaryContinue());
		click(p.getAcceptAndContinue());
	}

	@Then("User choose to enter the payment details and click place order button")
	public void user_choose_to_enter_the_payment_details_and_click_place_order_button() throws InterruptedException {
		Thread.sleep(3000);
	    click(p.getFlipkartHomePage());
	}

	@Then("User logout the flipkart application and verify it")
	public void user_logout_the_flipkart_application_and_verify_it() {
	    moveToElement(l.getUserName());
		click(p.getLogout());		
		FluentWait<WebDriver> f=new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(Throwable.class);
		f.until(ExpectedConditions.visibilityOf(p.getVerifyLogout()));
		Assert.assertEquals("Verify Username Login", p.getVerifyLogout().getText(), "Login");
		
	}

}
