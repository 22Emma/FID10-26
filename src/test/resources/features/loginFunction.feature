
Feature: Default



	Scenario: User(pos-manager) can login with valid credentials
		Given user is on the fidexio login  page
		 When user(pos) enters "posmanager54@info.com" and "posmanager" as credentials
		 And user clicks to login button
		 Then user(pos) is on the dashboard	



