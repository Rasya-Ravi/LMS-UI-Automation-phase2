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
@tag
Feature: Test portal page funtioanlity
  I want to use this template for my feature file

  @tag1
  Scenario: Home
    Given The user opens chrome browser and enter the url "https://dsportalapp.herokuapp.com/"
    And the user should land on DS Algo portal page  
    When the user clicks the "Get Started" button
    Then the user is on home page
    And the user should see six panes with different data structures
    When The user clicks "Data Structures" drop down
    Then user should see six different data structure entries in that dropdown
    When The user clicks any of the "Get Started" buttons below the data structures
    Then It should alert the user with a message "You are not logged in"  
    
