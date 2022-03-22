Feature: Employee directory Home page feature
Scenario: To verify url and title of the Home page
Given user is on Home page
When User gets the url of the web page
Then url should be "http://54.200.154.26/"
When User gets the title of the web page
Then page title should be "Employee Directory"
When User gets the Main header of the web page
Then Main header should be "Employee Directory"
When User gets the card header of the web page
Then card header should contains "Employee Directory - Home"
