#Feature:
#
#  1. User first lands on weekly display
#  2. User can change display between Day-Week-Month
#  3. User can create event by clicking on time box
#  4. User can see event details when click the event on the calander.
#  5. User can edit a created event
#
#  @Background:
#  Given user is on the fidexio login  page
#    When user(pos) enters "posmanager54@info.com" and "posmanager" as credentials
#    And user clicks to login button
#    Then user(pos) is on the dashboard
#
#
#  Scenario:User first lands on weekly display
#  AC:1
#    Given User is on fidexio homepage and user clicks to Calender section.
#    When User is on the calender section and weekly display is displayed by default
#
#  Scenario:User can change display between Day-Week-Month
#  AC:2
#    Given User is on fidexio homepage and user clicks to Calender section.
#    When User is on the calender section and weekly display is displayed by default
#    And User can switch between these sections.
#      | Day   |
#      | Week  |
#      | Month |
#
#  Scenario:User can create event by clicking on time box
#  AC:3
#    Given User is on fidexio homepage and user clicks to Calender section.
#    When User is on the calender section and weekly display is displayed by default
#    And User can click on the time box and create new event.
#
#  Scenario:User can see event details when click the event on the calander.
#  AC:4
#    Given User is on fidexio homepage and user clicks to Calender section.
#    When User is on the calender section and weekly display is displayed by default
#    And User can click on the time box and create new event.
#    Then User can see event details by clicking the event.
#
#  Scenario:User can edit a created event
#  AC:5
#    Given User is on fidexio homepage and user clicks to Calender section.
#    When User is on the calender section and weekly display is displayed by default
#    And User can click on the time box and create new event.
#    Then User can see event details by clicking the event.
#    And User can edit the created event details.
#
#
#
#
#
