@wip
Feature:
  Background:
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager46@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard

    Given user is on the Vehicles page
    When user  click the Vehicles Fuel Log button for a specific vehicle
    And user click to Create button


  Scenario: Create a new fuel log for a vehicle
    When user enters Vehicle box "Bmw/520ES/01adana01"
    And user click the Save button
    Then the new fuel log should be saved successfully



  Scenario: User must choose at least a Vehicle to create a Vehicles Fuel Log.
    When user click Vehicle box and click Search More button
    And user should selects a vehicle
    And user click the Save button
    Then the new fuel log should be saved successfully


    Scenario: If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.

      When user enter a vehicle which is not on the Vehicle list
      And user click the Save button
      Then Create a Vehicle popup should be displayed.

