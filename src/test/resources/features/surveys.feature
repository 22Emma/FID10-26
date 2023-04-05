Feature: Surveys
  1. Verify that all buttons work as expected at the survey design stage.
  2. User must enter a survey title to create a survey.
  3. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  4. After clicked the Save button, "Attachment(s)", "Action", "Test Survey", "Print Survey", "Share and invite by email" and "View result" buttons should be displayed.
  5. After clicked the Save button, "Add an item" should be not displayed.
  6. User can choose "User can come back in the previous page" and/or "Login required" under the Options tab.
  7. "Survey created" message should be displayed under the survey form sheet, after clicked the save button.
  8. Verify that the user should be able to see created survey is listed after clicking the Surveys module.



   Background:User(pos-manager) can login with valid credentials
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager66@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard

  Scenario: 1. Verify that all buttons work as expected at the survey design stage.
    Given user is on the home  page clicks to the surveys options
    Then create,import are displayed and user is able click to them.

  Scenario: User must enter a survey title to create a survey.
    When user is on the home  page clicks to the surveys options
    And user clicks to the Create button
   And User must enter a survey title to create a survey.
    Then User click to Save button

  Scenario: 3. After clicked the Save button, Edit button display instead of Save button
  and Create button display instead of Discard button.
    When user is on the home  page clicks to the surveys options
    And user clicks to the Create button
   And User must enter a survey title to create a survey.
    And  User click to Save button
    Then Create button display instead of Discard button.

   Scenario: 4. After clicked the Save button, "Attachment(s)", "Action", "Test Survey", "Print Survey", "Share and invite by email" and
    "View result" buttons should be displayed.
     When user is on the home  page clicks to the surveys options
     And user clicks to the Create button
      And User must enter a survey title to create a survey.
      And  User click to Save button
      And Attachment(s) buttons should be displayed.
      And Action buttons should be displayed.
      And Test Survey buttons should be displayed.
      And Print Survey buttons should be displayed.
     And Share and invite by email buttons should be displayed.
      Then  View result buttons should be displayed.

      Scenario: 5. After clicked the Save button, "Add an item" should be not displayed.
        When user is on the home  page clicks to the surveys options
        And user clicks to the Create button
        And User must enter a survey title to create a survey.
        And  User click to Save button
      # Then Add an item should be not displayed.

        Scenario: 6. User can choose "User can come back in the previous page"
        and/or "Login required" under the Options tab.
       then user is on the posmanager66 page
         When user is on the home  page clicks to the surveys options
          And User must enter a survey title to create a survey.
         And  User click to Save button
         #Then  User can choose "User can come back in the previous page

         Scenario: 7. "Survey created" message should be displayed under the survey form sheet,
          after clicked the save button.
            When user is on the home  page clicks to the surveys options
           And user clicks to the Create button
            And User must enter a survey title to create a survey.
            And  User click to Save button
            Then Survey created message should be displayed under the survey form sheet,

           Scenario: 8. Verify that the user should be able to see created survey is listed
            after clicking the Surveys module.
             When user is on the home  page clicks to the surveys options
             And Verify that the user should be able to s ee created survey is listed