@FID10-433
Feature: Vehicle Contracts Function
  1. Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
  2. User must choose at least a Vehicle to create a Vehicle Contract.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Contract Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Activation Cost input box. And it should be displayed as a float number.
  8. Service Type should display as Leasing by default.


  Background: User(pos-manager) can login with valid credentials
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager55@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard

  @FID10-424
  Scenario: (AC-1) Verify that USER can create a new Contract. (User enters only Vehicle, Type, Activation Cost, Recurring Cost Amount)
    Given user is on the vehicle contract creation page
    When user clicks Create button on Vehicle Services Logs
    And user enters a vehicle, contract type, activation cost and recurring cost amount
    Then user should be able to click Save button to save the contract

  @FID10-425 @Negative
  Scenario: (AC-2) User must choose at least a Vehicle to create a Vehicle Contract.
    Given user is on the vehicle contract creation page
    When user clicks Create button on Vehicle Services Logs
    And user clicks save button
    Then user should not be able to create a contract without entering a vehicle

  @FID10-426 @Positive
  Scenario: (AC-2) User must choose at least a Vehicle to create a Vehicle Contract.
    Given user is on the vehicle contract creation page
    When user clicks Create button on Vehicle Services Logs
    And user chooses at least a vehicle
    And user clicks save button
    Then user should be able to create a contract

  @FID10-427
  Scenario: (AC-3) If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    When user enters a vehicle which is not on the vehicle list and clicks the save button
    Then Create a Vehicle popup should be displayed.

  @FID10-428
  Scenario: (AC-4) After clicked the save button, the information of the Contract Details which user entered should be displayed.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    And user enters a vehicle, contract type, activation cost and recurring cost amount
    And user clicks save button
    Then information of the Contract Details which user entered should be displayed.

  @FID10-429
  Scenario: (AC-5) 5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    And user enters a vehicle, contract type, activation cost and recurring cost amount
    And user clicks save button
    Then Edit button should be displayed instead of Save button
    And Create button should be displayed instead of Discard button.

  @FID10-430
  Scenario: (AC-6) When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    And user enters a vehicle, contract type, activation cost and recurring cost amount
    And user clicks save button
    And user clicks the edit button
    Then form should open by displaying the all the information and it be ready to edit

  @FID10-431
  Scenario Outline: (AC-7) User should be able to enter only number in the Activation Cost input box. And it should be displayed as a float number.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    And user enters a vehicle, contract type and recurring cost amount
    When user enters "<Activation cost>"
    Then only numbers should be accepted as activation cost
    And numbers should be displayed as a float number
    Examples:
      | Activation cost |
      | invalid entry   |
      | 5               |

  @FID10-432
  Scenario: (AC-8) Service Type should display as Leasing by default.
    Given user is on the vehicle contract creation page
    And user clicks Create button on Vehicle Services Logs
    Then Service Type should be display as Leasing by default
