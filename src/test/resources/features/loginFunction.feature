
Feature: Default



	Scenario: User(pos-manager) can login with valid credentials
		Given user is on the fidexio login  page
		 When user(pos) enters "posmanager52@info.com" and "posmanager" as credentials
		 And user clicks to login button
		 Then user(pos) is on the dashboard


	Scenario: User(sales-manager) can login with valid credentials
		Given user is on the fidexio login  page
		When user(sales) enters "salesmanager52@info.com" and "salesmanager" as credentials
		And user clicks to login button
		Then user(sales) is on the dashboard



