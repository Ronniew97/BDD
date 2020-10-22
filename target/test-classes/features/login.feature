#Feature: Valid User should be able to log in to the techfios page 

#Background:
	Given User is on techfios billing site

#@Scenario1
Scenario Outline: A valid user should able to login 
	When User enters a valid username "<username>"
	When User enters a valid password "<password>"
	And User clicks on the sign in button
	Then User should be able to see the dashboard

	Examples:
	| username | password |
	| demo@techfios.com | abc123 |
	

#@Scenario2
Scenario Outline: An invalid user shouldn't be able to login 
	When User enters an invalid username "<username>"
	When User enters an invalid password "<password>"
	And User clicks on the sign in button
	Then User should see an error message

	Examples:
	| username | password |
	| demo2@techfios.com | abc124 |