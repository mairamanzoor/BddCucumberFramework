Feature: Register product Data Creation using mapping

  Scenario Outline: Register product on product registeration page scenario
   Given user is on login page
    When  the title of login page is Login - Panasonic eStore
    Then user writes username and password   
    | username | password |  
	| mairamanzoor24@gmail.com  | QaAutomation@123 |
	
    Then user press on login button
    Then user clicks on your account
    Then user clicks on your registration
    Then user clicks on your register your product
    Then user enter product registration details
    | model     | purshasedate | dealer |
	  | A19573CPN | 11/23/2022   | Bdd    | 
    | ZE08101   | 12/23/2022   | Bdd    |
    Then user close the browser
