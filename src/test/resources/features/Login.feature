@login
Feature: To verify application Login
#Test scenario using table for DataDriven
@testcase1
Scenario Outline: Login application with correct username and password
Given Launch the application
When sign-in with username as "<Username>" and password as "<Password>"
Then application should redirect to home page
Examples:
|Username						|Password					|Result				 |
|dineshkumartest		|dineshtest				|Login				 |
|test								|dineshtest				|Wrong Username|
|dineshkumartest		|test							|Wrong Password|
|      							|									|Enter username and Password|

@testcase2
Scenario Outline: Login application with wrong username and correct password
Given Launch the application
When sign-in with username as "test" and password as "dineshtest"
#Removed: And click Sign-In button
Then application should show wrong "<Result>" alert

Examples:
|Username						|Password					|Result				 |
|dineshkumartest		|dineshtest				|Login				 |
|test								|dineshtest				|Wrong Username|
|dineshkumartest		|test							|Wrong Password|
|      							|									|Enter username and Password|