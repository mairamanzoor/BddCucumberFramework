#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Register product Data Creation by using datatable

  Scenario Outline: Register product on product registeration page scenario
   Given user is on login page
    When  the title of login page is Login - Panasonic eStore
    Then user writes username and password     
	| mairamanzoor24@gmail.com  | QaAutomation@123 |
	
    Then user press on login button
    Then user clicks on your account
    Then user clicks on your registration
    Then user clicks on your register your product
    Then user enter product registration details
	  | A19573CPN | 11/23/2022   | Bdd    | 
    | ZE08101   | 12/23/2022   | Bdd    |
    Then user clicks on submit
    

