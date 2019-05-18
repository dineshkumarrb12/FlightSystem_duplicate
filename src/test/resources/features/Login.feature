@login
Feature: To verify application Login

@testcase1
Scenario: Login application with correct username and password
Given Launch the application
When sign-in with username as "dineshkumartest" and password as "dineshtest"
Then application should redirect to home page

@testcase2
Scenario: Login application with wrong username and correct password
Given Launch the application
When sign-in with username as test and password as dineshtest
#Removed: And click Sign-In button
Then application should show wrong username alert

Scenario: login application with correct username and wrong password
Given Launch the application
When sign-in with username as dineshkumartest and password as test
#Removed: And click Sign-In button
Then application should show wrong password alert

Scenario: Click Sign-In button with empty username and password
When sign-in with username as "" and password as ""
#CHANGED: When I click Sign-In button with empty username and password
Then application should not login and message alert should be displayed

#Test scenario using table for DataDriven
Scenario Outline: Login into the application
Given Launch the application
When I given username as <Username> and password as <Password>
Then result be <Result>

Examples:
|Username						|Password					|Result				 |
|dineshkumartest		|dineshtest				|Login				 |
|test								|dineshtest				|Wrong Username|
|dineshkumartest		|test							|Wrong Password|
|      							|									|Enter username and Password|