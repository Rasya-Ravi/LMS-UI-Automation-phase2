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
Feature: Logout Button
  I want to use this template for my feature file

  @tag1
  Scenario: Validating  LogOut Button 
  
    Given Admin/User/Staff Logged on to LMS website "page title"
    When Admin/User/Staff  Clicks on LogOut button
    Then Admin/User/Staff should be navigated to Login Screen 