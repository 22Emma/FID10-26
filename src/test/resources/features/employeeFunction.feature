@Employee
Feature: Employee Functionality

  Background:
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager43@info.com" and "posmanager" as credentials
    And user clicks to login button
    When user clicks more button
    And user clicks Employees button
    Then user should land on employees page

  Scenario:  Verify that create button work as expected
    When user clicks Create button on employee page
    Then user should land on Create page

  Scenario: Verify that import button work as expected
    When user clicks Import button
    Then user should land on Import page

  Scenario: Verify that go forward button work as expected
    When user clicks go forward button
    Then user should see next Employee page

  Scenario: verify that go back button work as expected
    When user clicks go back button
    Then user should see the previous Employee page

  Scenario: Verify that List button work as expected
    When user clicks List button
    Then user should see Employee information as a list

  Scenario: Verify that Kanban button as expected
    When user clicks Kanban button
    Then user should see Employee information as a Kanban

  Scenario: The user can create an employee with entering only Name input box and verify that the "Employee created" message appears under full profile
    When user clicks Create button on employee page
    And user should enter "Sebnem SONMEZ"
    And user clicks save button on employee page
    Then user should see the employee page "Sebnem SONMEZ"
    And user should see the "Employee created" message under full profile

  Scenario: User can upload the employee's picture and delete it
    When user clicks Create button on employee page
    And user should upload the employee's picture
    And user clicks delete button on the employee's picture
    Then the picture should be deleted

  Scenario: After clicked the Save button, Edit button display instead of Save button and After clicked the save button, the information of the employee which user entered should be displayed
    When user clicks Create button on employee page
    And user should enter "Demet Evgar"
    And user clicks save button on employee page
    Then user should display the edit button instead of save button
    And user should display create button instead of discard button
    And user should see the information of the employee which user entered should be displayed "Demet Evgar"

  Scenario: Verify that the user should be able to see the created employee in the list of the employees after clicking the Employees module
    When user clicks Create button on employee page
    And user should enter "Caglar Corumlu"
    And user clicks save button on employee page
    And user clicks more button
    And user clicks Employees button
    And search by employee's name "Caglar Corumlu"
    Then "Caglar Corumlu" listed on the list
