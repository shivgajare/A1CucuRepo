Feature: Login Features
#10 scenario, Gherkin
Scenario: positive login scenario
Given user is on login page
When user enters username and password
And user clicks on submit button
Then user is on home page
