Feature: To valid the registration functionality of flipkart application
	
	Background:
		Given The user should be in flipkart homepage
	  @register
		Scenario: To valid the registration functionality with valid credentials
	   	When The user should move the login button and click signup button
	   	And User should enter the valid phone number and click continue button
	   	Then The user should wait for one minutes to enter otp and click signup button
	   	And The user should move to account button and click my profile button and enter the user details of it
	   	