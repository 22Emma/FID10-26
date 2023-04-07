@FID10-420
Feature: Default

	Background:
		#@FID10-486
		 Given user is on the fidexio login  page
		    When user(pos) enters "posmanager54@info.com" and "posmanager" as credentials
		    And user clicks to login button
		    Then user(pos) is on the dashboard
		    Given User is on fidexio homepage and user clicks to Calendar section.
		    When User is on the calender section and weekly display is displayed by default
		
		

	#1{color:#de350b}*. User first lands on weekly display*{color}
	#2. User can change display between Day-Week-Month
	#3. User can create event by clicking on time box
	#4. User can see event details when click the event on the calendar.
	#5. User can edit a created event
	@FID10-414
	Scenario:  User first lands on weekly display 
		Given User is on fidexio homepage and user clicks to Calendar section.
		When User is on the calender section and weekly display is displayed by default	

	#1. User first lands on weekly display
	#{color:#de350b}*2. User can change display between Day-Week-Month*{color}
	#3. User can create event by clicking on time box
	#4. User can see event details when click the event on the calendar.
	#5. User can edit a created event
	@FID10-415
	Scenario: User can change display between Day-Week-Month
		Given User is on fidexio homepage and user clicks to Calendar section.
		When User is on the calender section and weekly display is displayed by default
		And User can switch between day, week and month sections.	

	#1. User first lands on weekly display
	#2. User can change display between Day-Week-Month
	#{color:#de350b}*3. User can create event by clicking on time box*{color}
	#4. User can see event details when click the event on the calendar.
	#5. User can edit a created event
	@FID10-416
	Scenario: User can create event by clicking on time box
		Given User is on fidexio homepage and user clicks to Calendar section.
		When User is on the calender section and weekly display is displayed by default
		And User can click on the time box and create new event.	

	#1. User first lands on the weekly display
	#2. User can change display between Day-Week-Month
	#3. User can create event by clicking on time box
	#{color:#de350b}*4. User can see event details when click the event on the calendar.*{color}
	#5. User can edit a created event
	@FID10-417
	Scenario:  User can see event details when click the event on the calendar. 
		Given User is on fidexio homepage and user clicks to Calendar section.
		When User is on the calender section and weekly display is displayed by default
		And User can click on the time box and create new events.
		Then User can see event details by clicking the event.	

	#1. User first lands on the weekly display
	#2. User can change display between Day-Week-Month
	#3. User can create event by clicking on time box
	#4. User can see event details when click the event on the calendar.
	#{color:#de350b}*5. User can edit a created event*{color}
	@FID10-418
	Scenario: User can edit a created event
		Given User is on fidexio homepage and user clicks to Calendar section.
		   When User is on the calender section and weekly display is displayed by default
		   And User can click on the time box and create new events.
		   Then User can see event details by clicking the events.
		   And User can edit the created event details.