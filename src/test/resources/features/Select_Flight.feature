Feature: Select flight details

Scenario: Check default depature and flight selected
Given Launch the application with valid username and password
When I select depature and return details
And check whether flight are displayed according to date and time selected
Then By default first option should be selected

Scenario: select depature and return flight
Given Launch the application with valid username and password
And select depature and return details
And check whether flight are displayed according to date and time selected
When i given depart as Blue Skies Airlines 360 and return as Blue Skies Airlines 630
Then page should redirect to user details page

