Feature:default
  Background:
    @wip
     Scenario: User(sales-manager) can login with valid credentials
    Given user is on the fidexio login  page
    When user(sales) enters "salesmanager52@info.com" and "salesmanager" as credentials
    And user clicks to login button
    Then user(sales) is on the dashboard
    Given user is on the fidexio home page and clicks to the sales option.
      And user clicks to customers from order section and land on the customer page.



  Scenario: AC:1:Verify that all buttons work as expected at the Customers page
    Given user is on the fidexio home page and clicks to the sales option.
    And user clicks to customers from order section and land on the customer page.
    Then create,import,kanban and list buttons are displayed and user is able click to them.


  Scenario: AC:2:The user can create a customer with entering only Name input box.
    Given user is on the fidexio home page and clicks to the sales option.
    And user clicks to customers from order section and land on the customer page.
    Then user clicks to create button.
    And  user enters the name into the input box and clicks the create button.
    Then create contacts should be display.
    And user enters the contact name into the contact name box.
    Then user clicks to the save&close button on the pop up
    And user clicks the save button on the top left side.

    Scenario: AC:3: User can upload the customer's picture and delete it.
      Given user is on the fidexio home page and clicks to the sales option.
      And user clicks to customers from order section and land on the customer page.
      And user selects one of the customer from the customer page and clicks to it.
      Then user clicks to edit button.
      And user hover overs on the profile picture and clicks to pencil or edit icon.
      And user uploads a profile picture.
      Then user hover overs on the profile picture and clicks to bin icon.
      Then  user clicks to  save button for uploaded picture .

      Scenario: AC:4:After clicked the Save button, Edit button display instead of Save button and Create
      button display instead of Discard button.
        Given user is on the fidexio home page and clicks to the sales option.
        And user clicks to customers from order section and land on the customer page.
        Then user clicks to create button.
        And  user enters the name into the input box and clicks the create button.
        Then create contacts should be display.
        And user enters the contact name into the contact name box.
        Then user clicks to the save&close button on the pop up
        And user clicks the save button on the top left side.
        Then edit button is displayed instead of save button
        And create button is displayed instead of discard button.

        Scenario: AC:5:After clicked the save button, the information of the customer which user
        entered should be displayed.
          Given user is on the fidexio home page and clicks to the sales option.
          And user clicks to customers from order section and land on the customer page.
          Then user clicks to create button.
          And  user enters the name into the input box and clicks the create button.
          Then create contacts should be display.
          And user enters the contact name into the contact name box.
          Then user clicks to the save&close button on the pop up
          And user clicks the save button on the top left side.
          Then information of the customer is displayed.

          Scenario: AC:6:Verify that the user should be able to see created customer in the list of the customers after
          clicking the Customers module.
            Given user is on the fidexio home page and clicks to the sales option.
            And user clicks to customers from order section and land on the customer page.
            Then user sees the created customer on the list.

            Scenario: AC:7:Verify that the "Contact created" message appears under full profile and customer's name
            is displayed on the page title.
              Given user is on the fidexio home page and clicks to the sales option.
              And user clicks to customers from order section and land on the customer page.
              Then user clicks to create button.
              And  user enters the name into the input box and clicks the create button.
              Then create contacts should be display.
              And user enters the contact name into the contact name box.
              Then user clicks to the save&close button on the pop up
              And user clicks the save button on the top left side.
              Then "Contact created" message appears under full profile and customer's name is displayed on the page title.





