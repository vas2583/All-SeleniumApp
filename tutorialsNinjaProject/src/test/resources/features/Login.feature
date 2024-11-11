Feature: Login functionality

Scenario: Login with valid Credantials
Given User navigates to login page
When User enters valid email address "kothemvasu21@gmail.com" into  email field
And User enters valid password "7825a" into password field
And User clicks login button
Then User should get successfully logged in

Scenario: Login with invalid Credentials
Given User navigates to login page
When User enters invalid email address "kothemvasu21assseru@gmail.com" into  email field
And User enters invalid password "7825ahhgh" into password field
And User clicks login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User navigates to login page
When User enters valid email address "kothemvasu21@gmail.com" into  email field
And User enters invalid password "7825ahhgh" into password field
And User clicks login button
Then User should get proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User navigates to login page
When User enters invalid email address "kothemvasu21assseru@gmail.com" into  email field
And User enters valid password "7825a" into password field
And User clicks login button
Then User should get proper warning message about credentials mismatch

Scenario: Login without providing any credential
Given User navigates to login page
When User dont enter email address into email field
And User dont enter password into password field
Then User should get proper warning message about credentials mismatch

