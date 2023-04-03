Feature: Panasonic login feature
#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "maira123" and "test@123"
#Then user clicks on login button
#Then user is on home page

#with Examples Keyword
Scenario Outline: login and verify the username
    Given user is already on login page
    When title of login page is Login - Panasonic eStore
    Then user enters "<username>" and "<password>"
    Then user enters on login button
    When user is on home page
    Then username is shown
    Then user clicks on your account
    Then user clicks on your registration
    Then user clicks on your register your product
    Then user enter "<model>" and "<purchasedate>" and "<dealer>"
    Then user clicks on submit
    Then close the browser
    
    Examples:
		| username                  | password         | model     | purchasedate | dealer |
	| mairamanzoor24@gmail.com  | QaAutomation@123 | A19573CPN | 11/23/2022   | Bdd    | 
	| mairamanzoor24@gmail.com  | QaAutomation@123 | ZE08101   | 12/23/2022   | Bdd    |
    
    
    
    