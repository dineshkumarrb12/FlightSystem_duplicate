Feature: Book a flight 
Scenario: Select a flight with round trip type
Given Launch and login into the application
When I given type as Round trip
And select the number of <passengers>
And select departing country as <Departing_from> 
And select departure month as <departmonth>
And select depature date as <date> 
And select ariving county as <arrivingto>
And select returning month as <arrivingmonth>
And select returning date as <arrivingday>
And flight preference class as Business class
And select Airline as Unified Airlines and click contine
Then details given should be stored and should redirect to select flight page

Scenario: Select a flight with one way trip type
Given Launch and login into the application
When I given type as Round trip
And select the number of <passengers>
And select departing country as <Departing_from> 
And select departure month as <departmonth>
And select depature date as <date> 
And select ariving county as <arrivingto>
And select returning month as <arrivingmonth>
And select returning date as <arrivingday>
And flight preference class as Business class
And select Airline as Unified Airlines and click contine
Then details given should be stored and should redirect to select flight page

|passengers|Departing_from|departmonth|date|arrivingto|arrivingmonth|arrivingday|
|3				 |Frankfurt 		|May				|20	 |London		|February				|12					|
|2				 |Acapulco	 		|January		|20	 |London		|March					|10					|
|3				 |New York  		|May				|20	 |London		|March					|23					|
|4				 |Paris 		 		|June				|20	 |London		|June						|20					|
|5				 |Portland  		|May				|20	 |London		|April					|23					|
|1				 |San Francisco	|April			|20	 |London		|March					|06					|
|1				 |Sydney    		|May				|20	 |London		|March					|07					|
|2				 |Zurich		 		|May				|20	 |London		|January				|08					|
|3				 |Frankfurt 		|March	  	|20	 |London	  |February			  |09					|				



