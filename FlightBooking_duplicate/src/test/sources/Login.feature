#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: To verify application Login
Scenario: Login application with correct username and password
Given Launch the application
When i given username as dineshkumartest and password as dineshtest
And click Sign-In button
And should redirect to home page
Then application should login and redirect to home page

Scenario: Login application with wrong username and correct password
Given Launch the application
When i given username as test and password as dineshtest
And click Sign-In button
And should show an alert as wrong username alert
Then application should not login and message alert should be display

Scenario: login application with correct username and wrong password
Given Launch the application
When I given user as dineshkumartest and password as test
And click Sign-In button
And should show an alert as worng password alert
Then application should not login and message alert should be display

Scenario: Click Sign-In button with empty username and password
When I click Sign-In button with empty username and password
Then application should not login and message alert should be display

#Test scenario using table

Feature: To verify application login using tables
Scenario: Login into the application
When I given username as <Username> and password as <Password>=
Then result be <Result>

Examples:
|Username						|Password					|Result				 |
|dineshkumartest		|dineshtest				|Login				 |
|test								|dineshtest				|Wrong Username|
|dineshkumartest		|test							|Wrong Password|
|      							|									|Enter username and Password|


 
