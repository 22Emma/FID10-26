Feature:

  Background:
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager46@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard

    Given user is on the Vehicles page
    When user  click the Vehicles Fuel Log button for a specific vehicle
    And user click to Create button
    Then user sees Vehicle Details


  Scenario: User create a new fuel log for a vehicle
    When user click Vehicle box
    When user click create and edit
    When user click  Model dropdown box
    When user select Acura
    When user click License Plate
    When user enter "ABC 81"
    When user click the new Save button
    And user click the Save button
    Then the new fuel log should be saved successfully

  @smoke
  Scenario: User must choose at least a Vehicle to create a Vehicles Fuel Log.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    And user click the Save button
    Then the fuel log should be saved successfully


  Scenario: If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
    When user click Vehicle box
    When user enter Vehicle box "Toyota"
    And user click the Save button
    Then Create a Vehicle popup should be displayed in the vehicle fuel logs.

  Scenario: After clicked the save button, the information of the Vehicles Fuel Log Details which user entered should be displayed.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    And user click the Save button
    And  Vehicles Fuel Log Details should be displayed
    Then  which user entered should be displayed

  Scenario: After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    And user click the Save button
    Then Edit button display instead of Save button
    Then Create button display instead of Discard button

  Scenario: When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    And user click the Save button
    And user click the Edit button
    Then displaying the all the information page
    When user click Vehicle box and delete
    When user enters Vehicle box "Nissan"
    And user click Nissan Micra
    And user click the Save button
    Then user sees Nissan as the vehicle

  Scenario: user should not be able to enter alphanumeric in the Odometer Value input box.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    When user click Odometer Value box and delete
    When user enter "a@c" in the Odometer Value input box
    When user click the Save button
    Then user sees "Odometer Value" warning message


  Scenario:  User should be able to enter only number in the Odometer Value input box. And it should be displayed as a float number.
    When user click Vehicle box and click Search More button
    And user should select a vehicle
    When user click Odometer Value box and delete
    When user enter -1234- in the Odometer Value input box.
    And user click the Save button
    Then user sees Odometer Value as a float number.
