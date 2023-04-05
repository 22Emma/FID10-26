Feature:

  1. User first lands on weekly display
  2. User can change display between Day-Week-Month
  3. User can create event by clicking on time box
  4. User can see event details when click the event on the calander.
  5. User can edit a created event

  Background:
    Given user is on the fidexio login  page
    When user(pos) enters "posmanager54@info.com" and "posmanager" as credentials
    And user clicks to login button
    Then user(pos) is on the dashboard
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default

  @wipEmma1 @smoke
  Scenario:AC:1 User first lands on weekly display
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default

  @wipEmma
  Scenario:AC:2 User can change display between Day-Week-Month
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default
    And User can switch between day, week and month sections.

  @wipEmma
  Scenario:AC:3 User can create event by clicking on time box
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default
    And User can click on the time box and create new event.

  @wipEmma
  Scenario:AC:4 User can see event details when click the event on the calendar.
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default
    And User can click on the time box and create new events.
    Then User can see event details by clicking the event.

  @wipEmma
  Scenario:AC:5 User can edit a created event
    Given User is on fidexio homepage and user clicks to Calendar section.
    When User is on the calender section and weekly display is displayed by default
    And User can click on the time box and create new events.
    Then User can see event details by clicking the events.
    And User can edit the created event details.





