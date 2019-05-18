Feature: User details

Scenario Outline: Book the ticke by filling user details
Given Launch the application with with authenticated username and password
And select depart and arival date and time
And select the flight
When i given user <Firstname>
And enter user <Lastname>
And select the <Meal>
And select the type of <Cardtype>
And enter card <Number>
And select card expiration <Year> and <Month>
And enter card holder <CFirstname>, <CMiddlename>and <CLastname>
And enter <Address>, <Street> in billing address bar
And enter <City>, <State> and <Pincode> of the billing address
And click delivery address same as billing address check box
And click secure purchase button to confim booking
Then Ticke should be booked

Examples:
|Firstname|Lastname|Meal		|Cardtype|Number					|Year	|Month	|CFirstname	|CMiddlename|CLastname|Address											|Street						|City			|State			|Pincode|
|dinesh		|kumar	 |Hindu		|Discover|789-963-845-455	|09		|2011		|dinesh			|kumar			|rajanbabu|No.3 second street, k.k nagar|Arnipalyam, Arni	|T.v malai|Tamil Nadu	|632301	|
|asshok		|				 |Muslim	|Discover|123-963-98-098	|09		|-21		|!@#!				|kumar			|w				|! second street							|Arnipalyam, Arni	|T.v malai|Tamil Nadu	|632301	|
|janaa		|				 |Hindu		|Discover|asdasd					|asdda|asdasd	|d					|><>				|!@#1			|No.3 second street						|test, Arni			 	|T.v malai|Tamil Nadu	|632301	|
|a				|k			 |Hindu		|Discover|789-963-845-455	|09		|!@#!@#!|dinesh			|kumar			|rajanbabu|No.3 second street, k.k nagar|_)(						 	|:>OOA		|Tamil Nadu	|632301	|



