Feature: Data tables and Button states




Scenario: Home page URL verification
Given user is on Home page
When user gets the URL of Home page
Then page URL should be "https://webdriveruniversity.com/Data-Table/index.html"

Scenario: Home page title verification
When user gets the title of Home page
Then page title should be "WebDriver | Data Tables"

Scenario: Home page main header verification
When user gets the main header of Home page
Then thge main header of the page should be "Data, Tables & Button States"

Scenario: verification of Tables count in the page 
When user gets the tables count
Then the table count should be three

Scenario: verification of First table
When user gets the table one details
Then the table one header should be "Firstname , Lastname , Age"

Scenario: verification of Second table
When user gets the table two details
Then the table two rows count should be four

Scenario: verification input fields
When user checks if we can enter data in input fields
Then the input fields should be active and user can enter data

Scenario: verification Breadcrumb links
When user checks Breadcrumb links
Then the Home and About us is enabled and Contact us is not enabled

Scenario: verification Pagination links
When user checks Pagination links
Then all pages href value is same

Scenario: verification Table three details
When user checks for table three details
Then table three rows count should be four

Scenario: verification Buttons state
When user checks for the state of buttons
Then warning button is not enabled









