Feature: Search Functionality

Scenario: user search vaild Product
Given user opens the application
When user enter valid product "HP" into Search TextBox Field
And user clicks search buttom
Then user see the Results of Search Item

Scenario: user search invaild Product
Given user opens the application
When user enter invalid product "HONDA" into Search TextBox Field
And user clicks search buttom
Then user should get Messgae There is no product that matches the search criteria

Scenario: user search without any  Product
Given user opens the application
When user dont enter  product into Search TextBox Field
And user clicks search buttom
Then user should get Messgae There is no product that matches the search criteria


