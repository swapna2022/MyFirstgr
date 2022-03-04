Feature: Registration page feature
Scenario: Home page title verification
Given User is on Home page
When user gets the title of Home page
Then page title should be "Account Login"
When user hits continue button for New customer
Then Register account page should open

Scenario: Registration page
When the user enters the following data in respected fields and sbmits

|Fields          | Values         |
|FirstName       |Johnson         |
|LastName        |Peter           |
|email           |abc789@tset3.com |
|Telephone       |5062134897      |
|Password        |def789          |
|confirmPassword |def789          |
Then the user should be able to register.
And Your store page will open 

