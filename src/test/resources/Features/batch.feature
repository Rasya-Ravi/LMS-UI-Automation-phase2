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
Feature: Batch
  I want to use this template for my feature file

  Background: 
    Given Admin/User/Staff is on Browser
    Given Admin/User/Staff opens the "https://juice-shop.herokuapp.com"

  #HeaderValidation
  #Scenario: Validating the Manage Batch Header
    #Given Admin/User/Staff is on Browser
    #When Admin/User/Staff opens the "https://demoqa.com/forms"
    #When Admin/User/Staff Clicks on Batch button
   #Then Admin/User/Staff see header text as "Manage Batch "
#FooterValidation
  #Scenario: Validating the Manage Batch Footer
    #Given Admin/User/Staff Logged on to LMS Website as title ""
    #When Admin/User/Staff is on Manage Batch page as title "ToolsQA"
    #Then Admin/User/Staff see  Footer text as "In total there are 21 batches."
#
  #Scenario: Validating the Manage Batch Paginator
    #Given Admin/User/Staff Logged on to LMS Website as title ""
    #When Admin/User/Staff is on Manage Batch page as title ""
    #Then Admin/User/Staff  see the text as "Showing 1 to 5 of 21 batches."
#
  #Scenario: Verify paginator -next button  on the Batch page
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Enabled paginator-next button
    #Then Admin/User/Staff see Paginator text as "Showing 6 to 10 of 21 batches." 
#
  #Scenario: Verify paginator -prevoius button on the Batch page
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Enabled paginator -prev button
    #Then Admin/User/Staff  see the text as "Showing 1 to 5 of 21 batches."
#
#
  #Scenario: Verify  paginator -last button  on the Batch page
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Enabled paginator-last button
    #Then Admin/User/Staff see Page number navigated to '5'
#
  #Scenario: Verify  paginator -first button  on the Batch page
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Enabled paginator -first button
    #Then Admin/User/Staff see Page number navigated to '1'
#
  #search validation
  #Scenario: Validate Search Feature
    #Given Admin/User/Staff Logged on to LMS Website as title ""
    #When Admin/User/Staff is on Manage Batch page as title ""
    #Then Admin/User/Staff see the Search Text box has text as "Search"
#
  #Scenario: Search  by Batch Name
    #Given Admin/User/Staff is on Manage Batch page as title " "
    #When Admin/User/Staff enters Batch Name to be searched
    #Then Entries for the searched BatchName are shown
#
  #Scenario: Search  by Batch Description
    #Given Admin/User/Staff is on Manage Batch page as title " "
    #When Admin/User/Staff enters Batch Description to be searched
    #Then Entries for the searched Batch Description are shown
#
  #Scenario: Search  by Batch Status
    #Given Admin/User/Staff is on Manage Batch page as title " "
    #When Admin/User/Staff enters Batch Status to be searched
    #Then Entries for the searched Batch Status are shown
#
  #Scenario: Search  by No Of Classes
    #Given Admin/User/Staff is on Manage Batch page as title " "
    #When Admin/User/Staff enters No Of Classes to be searched
    #Then Entries for the searched No Of Classes are shown
#
  #Scenario: Search  by Program Name
    #Given Admin/User/Staff is on Manage Batch page as title " "
    #When Admin/User/Staff enters Program Name to be searched
    #Then Entries for the searched Program Name are shown
#
  #Ascending order Functionality
  #Scenario: Verify Batch Name are displayed in Ascending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Name Ascending Arrow
    #Then Admin/User/Staff see the Batch Name displayed in Ascending order
#
  #Scenario: Verify Batch Description are displayed in Ascending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Description Ascending Arrow
    #Then Admin/User/Staff see the Batch Description displayed in Ascending order
#
  #Scenario: Verify Batch Status are displayed in Ascending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Status Ascending Arrow
    #Then Admin/User/Staff see the Batch Status displayed in Ascending order
#
  #Scenario: Verify Batch Status are displayed in Ascending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on No Of Classess Ascending Arrow
    #Then Admin/User/Staff see the No Of Classess displayed in Ascending order
#
  #Scenario: Verify Program Name are displayed in Ascending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Program Name Ascending Arrow
    #Then Admin/User/Staff see the Program Name displayed in Ascending order
#
  #Descending order Functionality
  #Scenario: Verify Batch Name are displayed in Descending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Name Descending  Arrow
    #Then Admin/User/Staff see the Batch Name displayed in Descending order
#
  #Scenario: Verify Batch Description are displayed in Descending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Description Descending Arrow
    #Then Admin/User/Staff see the Batch Description displayed in Descending order
#
  #Scenario: Verify Batch Status are displayed in Descending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Batch Status Descending Arrow
    #Then Admin/User/Staff see the Batch Status displayed in Descending order
#
  #Scenario: Verify Batch Status are displayed in Descending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on No Of Classess Descending Arrow
    #Then Admin/User/Staff see the No Of Classess displayed in Descending order
#
  #Scenario: Verify Program Name are displayed in Descending order
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Clicks on Program Name Descending Arrow
    #Then Admin/User/Staff see the Program Name displayed in Descending order
#	#Number of rows in a Table
  #Scenario: Number of rows in a Table
      #Given Admin/User/Staff Logged on to LMS Website as title ""
      #When Admin/User/Staff is on Manage Batch page as title ""
    #Then Admin/User/Staff counts number of rows as 5 in a table
#
  #Validate Add A New Batch button
  #Scenario: Validate Add A New Batch button
    #Given Admin is on Manage Batch page as title ""
    #When Admin Clicks on  A New Batch button
    #Then Admin see header text as "Batch Details"
#
  #Scenario: No details Entered in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save button with out entering  details
    #Then Admin see Error message "Name is required"
#
  #Scenario: Enters Only Name in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save button after entering Name alone
      #| sdet |
    #Then Admin see Error message "Description is required"
#
  #Scenario: Enters Only Description in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save button after entering Description alone
      #| selenium Automation |
    #Then Admin see Error message "Name is required"
#
  #Scenario: Verify Program Name Dropdown in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on DropDown Menu
    #Then Admin see list of all Program Names
#
  #Scenario: Selects only a Program name from Dropdown in Batch Details window
    #Given Admin Clicks on  A New Batch button and  Clicks on DropDown Menu in Batch Details window
    #When Admin Clicks on Save button after selecting a Program Name only from the dropdown
    #Then Admin see Error message "Name is required"
#
  #Scenario: Selects Status only in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save button after entering Status alone
    #Then Admin see Error message "Name is required"
#
  #Scenario: Enters Only Number Of Classes in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save button after entering only Number Of Classes
      #| 3 |
    #Then Admin see Error message "Name is required"
#
  #Scenario: Enter All details in Batch Details window
    #Given Admin Clicks on  A New Batch button
    #When Admin Clicks on Save Button after entering all details
    #Then Admin see Success message "New Batch Created"
#
  Scenario: Click on Cancel button in Batch Details window
    #Given Admin Clicks on  A New Batch button
    When Admin Clicks on Cancel button
  	Then Admin see a Batch Details window getting closed           
  #Scenario: Admin/User/Staff Verify Added New Batch Name
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Enters newly added  Batch Name in Search
    #Then Entry for the newly added Batch Name is shown
#
  #Scenario: User/Staff Validate Add A New Batch button
    #Given User/Staff is on Manage Batch page as title ""
    #When User/Staff/Staff Clicks on A New Batch button
    #Then User/Staff see a Error message "Only Admin have Access"
#
  #Edit Functionality
  #Scenario: Validates Edit button
    #Given Admin is on Manage Batch page as title ""
    #When Admin Clicks on Edit buttton
    #Then Admin see header text as "Batch Details"
#
  #Scenario: Edit Name in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Save button after updating Name
    #Then Admin see Success message "Updated Name"
#
  #Scenario: Edit Description in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Save Button after updating Description
    #Then Admin see Success message "Updated Description"
#
  #Scenario: Edit Program Name from Dropdown in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Save button after Selecting another Program Name
    #Then Admin see Success message "Updated Program Name"
#
  #Scenario: Edit Status in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Save button after updating Status
    #Then Admin see Success message "Updated Status"
#
  #Scenario: Edit Number Of Classes in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Save button after updating No Of Classes
    #Then Admin see Success message "Updated No of Classes"
#
  #Scenario: Click on Cancel button in Batch Details window
    #Given Admin Clicks on Edit buttton
    #When Admin Clicks on Cancel button
    #
    #Then Admin see a Batch Details window getting closed
#
  #Scenario: Verifys Edited Batch Name/BatchDescription
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff  Enters edited Batch Name/Batch Description in Search
    #Then Entry for the edited  Batch Name/Batch Description is shown
#
  #Scenario: User/Staff  Validate Edit button
    #Given User/Staff is on Manage Batch page as title ""
    #When User/Staff Clicks on Edit buttton
    #Then User/Staff see a Error message "Only Admin have Access"
#
  #Delete Functionality
  #Scenario: Verify Delete Functionality
    #Given Admin is on Manage Batch page as title ""
    #When Admin Clicks on any Delete button located on the right side
    #Then Admin see header text as "Delete Confirm"
#
  #Scenario: Click on Yes button in Delete Confirm window
  #Given Admin Clicks on any Delete button located on the right side 
    #When Admin Clicks on Yes  button
    #Then Admin see Success message "Program Deleted Succesfully"
#
  #Scenario: Clicks on No button in Delete Confirm window
    #Given Admin is on Manage Batch page as title ""
    #When Admin Clicks on No button
    #Then Admin can see Program Name not deleted
#
  #Scenario: Validate Deleted Program Name
    #Given Admin is on Manage Batch page as title ""
    #When Admin/User/Staff Enters deleted  Program Name in Search
    #Then Admin/User/Staff finds no results
#
  #Scenario: User/Staff Validates Delete button
    #Given User/Staff is on Manage Batch page as title ""
    #When User/Staff Clicks on Delete buttton
    #Then User/Staff see a Error message "Only Admin have Access"
#
  #Delete Multiple Records Functionality
  #Scenario: Verify the state of Delete button on left hand side
        #Given Admin/User/Staff Logged on to LMS Website as title ""
        #When Admin/User/Staff is on Manage Batch page as title ""
    #Then Admin/User/Staff see the Delete button on the top left hand side as Disabled
#
  #
  #Scenario: Validates Multiple Program Selection
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff selects more than one Batch Name using checkbox
    #Then Admin/User/Staff see the Delete button on the top left hand side as Enabled
#
  #Scenario: Verify Deletion of Multiple Records
    #Given Admin selects more than one Batch Name using checkbox
    #When Admin Clicks on Enabled Delete button on the top left hand side
    #Then Admin see header text as "Delete Confirm"
#
  #Scenario: Click on Yes button in Delete Confirm window
    #Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name
    #When Admin Clicks on Yes  button
    #Then Admin see Success message "Program Deleted Succesfully"
#
  #Scenario: Click on No button in Delete Confirm window
    #Given Admin Clicks on Enabled Delete button after selecting  more than one Batch Name
    #When Admin Clicks on No button
    #Then Admin can see Program Name not deleted
#
  #Scenario: Verify Deleted Batch Names
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Enters deleted  Program Names in Search
    #Then Admin/User/Staff finds no results
#
  #Scenario: User/Staff Verifys Deletion of Multiple Records
    #Given User/Staff selects more than one Batch  Name using checkbox
    #When User/Staff Cicks on Enabled Delete button on the top left hand side
    #Then User/Staff see a Error message "Only Admin have Access"
#
  #CheckBox Functionality
  #Scenario: Verifies Checkbox Functionality
    #Given Admin/User/Staff is on Manage Batch page as title ""
    #When Admin/User/Staff Selects First checkbox left to Batch Name
    #Then Admin/User/Staff see all the checkboxes in the Batch page get selected
