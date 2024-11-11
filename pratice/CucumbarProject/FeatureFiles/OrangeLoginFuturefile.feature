Feature: OrangeHRMS Login

Scenario: Check Logo Of The Home Page
Given i want open browser
When i want navigate to OrangeHRM Home Page
Then i want Validate logo of The page
And i want Close the browser 

Scenario: Enter ValidCredentials For Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i want enter valid User Name
And i wnat Enter the valid password
And i want Click On Login button
Then i am in MyAccount Page
And i want Close   browser 

Scenario: Enter the INValid Credentials For Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i want enter Invalid User Name
And i wnat Enter the Invalid password
And i want Click On Login button
Then i am getting Error Message
And i want Close the browser 


Scenario: Without Enter any Credentials for Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i dont want enter any Credentials
And i want Click On Login button
Then i am getting RequiredError Msg
And i want Close the browser 


