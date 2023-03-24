Feature: Create A New Vehicle Costs Function
  1. Verify that USER can create a new Vehicle Costs.
  2. User must choose at least a Vehicle to create a Vehicle Cost.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Cost Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.
Background:
  Scenario: User(pos-manager) can login with valid credentials
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager34@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard
    Given user is on the fidexio home page and clicks to fleet option from more section
    And user clicks to vehicle costs from the vehicles section

  Scenario: AC1: Verify that USER can create a new vehicle costs
    Given user is on the fidexio home page and clicks to fleet option from more section
    And user clicks to vehicle costs from the vehicles section
    And users  clicks on create button and enters vehicle name and clicks to create button
   Then user enters model name and clicks to create button
    And user selects  make name and click to save button
    And user enters licence plate and click to save button
    Then user enters total price and clicks to save button
    Then costs details should be displayed

   Scenario: AC 2:User must choose at least a Vehicle to create a Vehicle Cost.
     Given user is on the fidexio home page and clicks to fleet option from more section
     And user clicks to vehicle costs from the vehicles section
     Then user selects a vehicle from vehicles dropdown
     Then user enters total price and clicks to save button
     Then costs details should be displayed

     Scenario:AC 3: If user tries to enter a vehicle which is not on the Vehicle list and click the save button,
     Create a Vehicle popup should be displayed.
       Given user is on the fidexio home page and clicks to fleet option from more section
       And user clicks to vehicle costs from the vehicles section
       And users  clicks on create button and enters vehicle name and clicks to create button
       Then Create a Vehicle popup should be displayed

       Scenario: AC 4:4. After clicked the save button,
       the information of the Cost Details which user entered should be displayed.
         Given user is on the fidexio home page and clicks to fleet option from more section
         And user clicks to vehicle costs from the vehicles section
         And users  clicks on create button and enters vehicle name and clicks to create button
         Then user enters model name and clicks to create button
         And user selects  make name and click to save button
         And user enters licence plate and click to save button
         Then user enters total price and clicks to save button
         Then costs details should be displayed

         Scenario: AC 5: After clicked the Save button,
         Edit button display instead of Save button and Create button display instead of Discard button

           Given user is on the fidexio home page and clicks to fleet option from more section
           And user clicks to vehicle costs from the vehicles section
           And users  clicks on create button and enters vehicle name and clicks to create button
           Then user enters model name and clicks to create button
           And user selects  make name and click to save button
           And user enters licence plate and click to save button
           Then user enters total price and clicks to save button
           Then edit button should be displayed

           Scenario: AC 6: When user clicks the Edit button
           the form should open by displaying the all the information and it be ready to edit.

             Given user is on the fidexio home page and clicks to fleet option from more section
             And user clicks to vehicle costs from the vehicles section
             And users  clicks on create button and enters vehicle name and clicks to create button
             Then user enters model name and clicks to create button
             And user selects  make name and click to save button
             And user enters licence plate and click to save button
             Then user enters total price and clicks to save button
             Then edit button should be displayed
             Then user clicks to edit button and details should be editable

             Scenario: AC 7: User should be able to enter only number in the Total Price input
             box.And it should be displayed as a float number
               Given user is on the fidexio home page and clicks to fleet option from more section
               And user clicks to vehicle costs from the vehicles section
               And users  clicks on create button and enters vehicle name and clicks to create button
               Then user enters model name and clicks to create button
               And user selects  make name and click to save button
               And user enters licence plate and click to save button
               Then user enters total price and clicks to save button
               Then total price should be displayed as a float number.








