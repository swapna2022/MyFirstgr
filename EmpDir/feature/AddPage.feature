Feature: Employee directory Home page feature

Background:
Given user is on add page

Scenario: To verify url  of the Home page
When User gets the url of the web page
Then url should be "http://54.200.154.26/add"

Scenario: To verify user buttons are enebled
Given user is on add page
When User gets checks on the check box fields
Then user should be able to select them

Scenario: To verify user buttons are enebled
Given user is on add page
When User gets checks on the check box fields
Then user should be able to select them

Scenario: To verify if user can add details
When the user enters the following data
|Fields       | Values                                                       |
|File         |C:\\Users\\swapn\\Desktop\\Selenium topics\\assertions.txt    |
|Name         |Antony                                                        |
|Location     |Los Angeles                                                   |
|JobTitle     |Director                                                      |
Then the user should be able to save the details



