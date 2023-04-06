@FID10-463
Feature:PosManager  should be able to create a new Vehicle Cost.
  Acceptance Criterias
  1. Verify that USER can create a new Vehicle Costs.
  2. User must choose at least a Vehicle to create a Vehicle Cost.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Cost Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Total Price input box.
  8. And it should be displayed as a float number.

  Background:User(pos-manager) can login with valid credentials
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager60@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard
    And user clicks on more button
    And user clicks on fleet button
    Then user click Vehicle Costs buttonn
    And user clicks on the create buttonn

@wip @FID10-454 @smoke
  Scenario: AC1: Verify that USER can create a new vehicle costs
      When user enters a vehicle Modell "Bmw"
      And user chooses a vehicle type descriptionn
      And  User enters Total Price amountt "150.00"
      Then user clicks on the save buttonn
@wip @FID10-455
  Scenario: AC 2:User must choose at least a Vehicle to create a Vehicle Cost.
    Then user selects a vehicle from vehicles dropdownn
    Then user enters total price and clicks to save buttonn
    Then "costs details" should be displayedd
@wip @FID10-456
  Scenario:AC 3: If user tries to enter a vehicle which is not on the Vehicle list and click the save button,Create a Vehicle popup should be displayed.
    And users  clicks on create button and enters vehicle name and clicks to create buttonn
    Then Create a Vehicle popup should be displayedd
@wip @FID10-457
  Scenario: AC 4:4. After clicked the save button,the information of the Cost Details which user entered should be displayed.
    When user enters a vehicle Modell "Bmw"
    And user chooses a vehicle type descriptionn
    And  User enters Total Price amountt "150.00"
    Then user clicks on the save buttonn
    And   "costs details" should be displayedd
@wip @FID10-458
  Scenario: AC 5: After clicked the Save button,Edit button display instead of Save button and Create button display instead of Discard button
    When user enters a vehicle Modell "Bmw"
    And user chooses a vehicle type descriptionn
    And  User enters Total Price amountt "150.00"
    Then user clicks on the save buttonn
    And user clicks on the edit buttonn
    Then   And user can see edit and create buttons on the pagee
@wip @FID10-459
  Scenario: AC 6: When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
    When user enters a vehicle Modell "Bmw"
    And user chooses a vehicle type descriptionn
    And  User enters Total Price amountt "120.00"
    Then user clicks on the save buttonn
    And user clicks on the edit buttonn
    Then user sees the information ready to be editedd
@wip @FID10-460
  Scenario: AC 7: User should be able to enter only number in the Total Price input box.
    When user enters a vehicle Modell "Bmw"
    And user chooses a vehicle type descriptionn
    And  User enters Total Price amountt "520.00kkk"
    Then user clicks on the save buttonn
    Then user sees a warning message "The following fields are invalid:"

@wip @FID10-461
  Scenario:Ac8:Total price should be displayed as a float number
    When user enters a vehicle Modell "Audi"
    And user chooses a vehicle type descriptionn
    And  User enters Total Price amountt "12000"
    Then user clicks on the save buttonn
    And total price should be displayed as a float numberr



