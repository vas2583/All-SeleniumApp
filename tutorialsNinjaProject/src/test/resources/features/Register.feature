Feature: Register Functionality

Scenario: user creats an account with mandatory fields
Given user navigates to register page
When user enetr the below fields
|FirstName|vasu|
|LastName|kothem|
|E-Mail|vasukothem108@gmail.com|
|Telephone|898988988|
|password|12345|
And user selects privacy policy
And user clicks on continue button
Then user account should create

Scenario: user creats an account with all fields
Given user navigates to register page
When user enetr the below fields
|FirstName|vasu|
|LastName|kothem|
|E-Mail|vasukothem108@gmail.com|
|Telephone|898988988|
|password|12345|
And user Selects yes on NewScletter
And user selects privacy policy
And user clicks on continue button
Then user account should create

Scenario: user creats an duplicateaccount 
Given user navigates to register page
When user enetr the below fields
|FirstName|vasu|
|LastName|kothem|
|E-Mail|vasukothem108@gmail.com|
|Telephone|898988988|
|password|12345|
And user selects privacy policy
And user clicks on continue button
Then user should get warning message email

Scenario: user creats an account without filling any details
Given user navigates to register page
When user dont enter the any fileds
And user clicks on continue button
Then user should  get Warning message with all fields


