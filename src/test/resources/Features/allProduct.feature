@E2E
Feature: To valid the booking functionality of flipkart application
	
	Background:
		Given The user should be in flipkart homepage
		 @product
		Scenario: To vaild the product successfully ordered
		# user Login
	   	When The user should click the login button
	   	And User should enter the valid phone number or email and click request OTP button
	   	Then The user should wait for one minutes to enter otp and automatically enter to home page
	   	And The user should verify the username in home page
	  	# Product Search
	  	When The user should enter the product name and click search button
	   	And User should verify the relevent products came in the search page
	    # Product Purchase
	   	Then User click the first product of showed in page and enter the pincode
	   	And User click the add to cart button and moved in to the place order page and click it
	   	Then User enter the delivery address and click save and deliver here button
	   	And User enter email address for order confirmation and click continue button
	   	Then User choose to enter the payment details and click place order button
	  	# Logout
	   	And User logout the flipkart application and verify it
	   	
	   	 	
