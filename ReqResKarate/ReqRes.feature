Feature: Status code verification

@ReqResGet
Scenario: Verification of the status code for single user
Given url 'https://reqres.in/api/users/2'
When method get
Then status 200

@ReqResGet
Scenario: Verification of the status code for list of users 
Given url 'https://reqres.in/api/users?page=2'
When method get
Then status 200

@ReqResGet
Scenario: Verification of the status code for single user not found 
Given url 'https://reqres.in/api/users/23'
When method get
Then status 404


Scenario: Verification of the status code for delayed response 
Given url 'https://reqres.in/api/users?delay=3'
When method get
Then status 200

Scenario Outline: Verify the responses
Given url "<url>"
When method get
Then status <status>

Examples:
|url|status|
|https://reqres.in/api/users/2|200|
|https://reqres.in/api/users?page=2|200|
|https://reqres.in/api/users/23|404|
|https://reqres.in/api/users?delay=3|200|

