Feature: Fidexio Vehicle Service Logs functionality
  Agile story: As a posManager, I should be able to create new Vehicles  Service Logs.

  1. Verify that USER can create a new Vehicles Services Logs.
  2. User must choose at least a Vehicle to create a Vehicles Services Log.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Service Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.
  8. Service Type should display as "Repair and Maintenance" by default.


  Background:
  Scenario: User(posManager47) can login with valid credentials
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager47@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard
    When user has landed on the fidexio home page and clicks to fleet button
    And user clicks to vehicle service logs button on the vehicles section
    Then user should land on the vehicles services logs page



  Scenario: 1: Verify that USER can create a new Vehicles Services Logs
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    And user enters vehicle name and clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    Then user should see their vehicles service log


  Scenario: 2: User must choose at least a Vehicle to create a Vehicles Services Log
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    Then user should see their vehicles service log


  Scenario: 3: If user tries to enter a vehicle which is not on the Vehicle list and click the save button,
  Create a Vehicle popup should be displayed
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    Then user enters a vehicle not on the dropdown list
    And user clicks the save button
    And user clicks the create button
    Then create a vehicle popup should be displayed


  Scenario: 4: After clicked the save button,
  the information of the Service Details which user entered should be displayed.
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    And user enters vehicle name and clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    Then user should see their vehicles service log


  Scenario: 5: After clicked the Save button,
  Edit button display instead of Save button and Create button display instead of Discard button.
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    And user enters vehicle name and clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    Then user should see the edit button


  Scenario: 6: When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    And user enters vehicle name and clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    And user clicks the edit button
    Then user should be able to see all the information and be able to edit it


  Scenario: 7: User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    And user enters vehicle name and clicks the create button
    Then user selects a vehicle
    And user enters the total price fee and clicks the save button
    Then total price should be displayed as a number


  Scenario: 8: Service Type should display as "Repair and Maintenance" by default.
    When user is on the fidexio vehicles services logs page
    And user clicks the create button
    Then service type is displayed as repair and maintenance by default