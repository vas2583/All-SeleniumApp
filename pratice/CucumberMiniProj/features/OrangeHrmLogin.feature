@LoginFuture
Feature: OrangeHrmsLogin
Background:
Given i want to Open Browser
And i want to navigate the OrangeHrms

 @Positive 
Scenario:  Validate Logo OF OpenPage
When get the Logo Of page and Validate
Then i want to close Browser

@Regression @Nagative
Scenario Outline: Login With Different Inputs
When i want Enter the Username "<userName>"
And i want Enter the Password "<password>"
And i want Click the Login button
Then i want to get output "<outcome>"
Examples:
|userName|password|outcome|
|Admin|admin123|loginSuccess|
|adm|adm123|loginFail|


 