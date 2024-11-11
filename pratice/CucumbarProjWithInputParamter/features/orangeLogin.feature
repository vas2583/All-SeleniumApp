Feature: OrangeHRMS Login

Scenario: Check Logo Of The Home Page
Given i want open browser
When i want navigate to OrangeHRM Home Page
Then i want Validate logo of The page
And i want Close the browser 

Scenario Outline: Enter ValidCredentials For Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i want enter valid userName "<username>"
And i wnat Enter the valid password "<password>"
And i want Click On Login button
Then i am in MyAccount Page
And i want Close the browser
Examples: 
|username|password| 
|Admin|admin123|

Scenario Outline: Enter the INValid Credentials For Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i want enter Invalid User Name "<invalidUsername>"
And i wnat Enter the Invalid password "<invalidPassword>"
And i want Click On Login button
Then i am getting Error Message
And i want Close the browser 
Examples:
|invalidUsername|invalidPassword|
 |Adm|adm12|


Scenario: Without Enter any Credentials for Login
Given i want open browser
When i want navigate to OrangeHRM Home Page
And i dont want enter any Credentials
And i want Click On Login button
Then i am getting RequiredError Msg
And i want Close the browser 



