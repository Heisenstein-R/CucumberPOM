Feature: Free CRM Application test using Cucumber POM

Scenario: Validate freeCRM HomePage

Given User opens browser
Then User is on the login page
Then User enters the UN and PW
Then Validate HomePage Title
Then Validate Username on page