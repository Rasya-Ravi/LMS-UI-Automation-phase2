# Program Page

Feature: Program

#Header Validation
		
	Scenario: Validating the Manage Program Header
		Given Admin/User/Staff Logged on to LMS Website "Lms.com"
		When Admin/User/Staff  is on Manage Program page
		Then Admin/User/Staff see header text as "Manage Program"

#Footer Validation    
	Scenario: Validating the Manage Program Footer
		Then Admin/User/Staff see  Footer text as "In total there are 9 programs."

#Paginator Validation
	Scenario: Validating the Manage Program Paginator
		Then Admin/User/Staff  see the text as "Showing 1 to 5 of 9 entries"

	#Background: Admin/User/Staff Logged on to LMS Website 
	
	Scenario: Verify paginator next button  on the Program page
		When Admin/User/Staff Clicks on Enabled paginator next button
		Then Admin/User/Staff see Paginator text as "Showing 6 to 9 of 9 entries"

	Scenario: Verify paginator prevoius button on the Program page
		When Admin/User/Staff Clicks on Enabled paginator prev button
		Then Admin/User/Staff see Paginator text as "Showing 1 to 5 of 9 entries"

	Scenario: Verify  paginator last button  on the Program page
		When Admin/User/Staff Clicks on Enabled paginator last button
		Then Admin/User/Staff see Page number navigated to '2'

	Scenario: Verify  paginator first button  on the Program page
		When Admin/User/Staff Clicks on Enabled paginator first button
		Then Admin/User/Staff see Page number navigated to '1'

#Search TextBox Functionality
	#Background: Admin/User/Staff Logged on to LMS Website
	 
	Scenario: Validate Search Feature
		Then Admin/User/Staff see the Search Text box has text as "Search"

	Scenario: Search by  Program Name
		When Admin/User/Staff enters Program Name to be searched
		Then Entries for the searched Program Name are shown

	Scenario: Search by Program Description
		When Admin/User/Staff enters Program Description to be searched
		Then Entries for the searched Program Description are shown

	Scenario: Search by  Program Status
		When Admin/User/Staff enters Program Status to be searched
		Then Entries for the searched Program Status are shown

#Ascending order Functionality

	Scenario: Verify Program Name are displayed in Ascending order 
		When Admin/User/Staff Clicks on Program Name Ascending Arrow
		Then Admin/User/Staff see the Program Name displayed in Ascending order

	Scenario: Verify Program Description are displayed in Ascending order
		When Admin/User/Staff Clicks on Program Description Ascending Arrow
		Then Admin/User/Staff see the Program Description displayed in Ascending order

	Scenario: Verify Program Status are displayed in Ascending order
		When Admin/User/Staff Clicks on Program Status Ascending Arrow
		Then Admin/User/Staff see the Program Status displayed in Ascending order

#Descending order Functionality

	Scenario: Verify Program Name are displayed in Descending order
		When Admin/User/Staff Clicks on Program Name Descending Arrow
		Then Admin/User/Staff see the Program Name displayed in Descending order
	Scenario: Verify Program Description are displayed in Descending order
		When Admin/User/Staff Clicks on Program Description Descending Arrow
		Then Admin/User/Staff see the Program Description displayed in Descending order
	Scenario: Verify Program Status are displayed in Descending order
		When Admin/User/Staff Clicks on Program Status Descending Arrow
		Then Admin/User/Staff see the Program Status displayed in Descending order

#Add A New Program Functionality
   #Background: Admin Logged on to LMS Website

	Scenario: Validate Add A New Program button
		Given Admin is on Manage Program page
		When Admin Clicks on  " + A New Program" button
		Then Admin see header text as "Program Details"
		
	Scenario: No details Entered in Program Details window
		When Admin Clicks on Save button with out entering  details
		Then Admin see Error message "Name is required"

	Scenario: Enters  All details in Program Details window
		When Admin Clicks on Save button after entering all details
		Then Admin see Success message "New Program Created"

	Scenario: Enters Only Name in Program Details window
		When Admin Clicks on Save button after entering Name alone
		Then Admin see Error message "Description is required"
		
	Scenario: Enters Only Description  in Program Details window
		When Admin Clicks on Save button after entering Description alone

	Scenario: Selects Only Status in Program Details window
		When Admin Clicks on Save button after selecting Status alone

	Scenario: Click on Cancel button in Program Details window
		When Admin Clicks on Cancel button
		Then Admin see a Program Details window getting closed
		
	#Background: Admin/User/Staff Logged on to LMS Website
	Scenario: Verify Added New Program Name
		When Admin/User/Staff Enters newly added  Program Name in Search
		Then Entry for the newly added Program Name is shown
		
 #Background: User/Staff Logged on to LMS Website
	Scenario: User/Staff Validate Add A New Program button
		Given User/Staff is on Manage Program page
		When User/Staff Clicks on  " + A New Program" button
		Then User/Staff see a Error message "Only Admin have Access"

#Number of rows in a Table
	Scenario: Validate Number of rows in a table
		Given Admin/User/Staff Logged on to LMS Website
		When Admin/User/Staff is on Manage Program page
		Then Admin/User/Staff counts number of rows as 5 in a table

#Edit Functionality
  
  #Background: Admin Logged on to LMS Website
 	Scenario: Validates Edit button in Program Details window
		Given Admin is on Manage Program page
		When Admin Clicks on Edit buttton 
		Then Admin see header text as "Program Details"
	Scenario: Edit Program Name in Program Details window
		Given Admin Clicks on "Edit" button
		When Admin Clicks on Save button after updating Name
		Then Admin see Success message "Updated Program Name"
	Scenario: Edit Program Description in Program Details window
		When Admin  Clicks on Save button after updating  Description
		Then Admin see Success message"Updated Description"
	Scenario: Edit Program Status in Program Details window
		When Admin  Clicks on Save button after Changing  status
		Then Admin see Success message "Updated Status"
	Scenario: Click on Cancel button in Program Details window
		When Admin Clicks on Cancel button
		Then Admin see a Program Details window getting closed
		
	#Background: Admin/User/Staff Logged on to LMS Website
	Scenario: Verifys Edited Program Name/Program Description 
		#Given Admin/User/Staff is on Manage Program page
		When Admin/User/Staff Enters edited Program Name in Search
		Then Entry for the edited  Program Name is shown
		
	#Background: User/Staff Logged on to LMS Website
		Scenario: User/Staff Validate Edit button
		Given User/Staff is on Manage Program page 
		When User/Staff Clicks on Edit buttton
		Then User/Staff see a Error message  "Only Admin have Access"
		
#Delete Functionality
	#Background: Admin Logged on to LMS Website
	Scenario: Verify Delete Functionality 
		Given Admin is on Manage Program page
		When Admin Clicks on any Delete button located on the right side
		Then Admin see header text as "Delete Confirm"
	#Background: Admin is on Manage Program page	
	Scenario: Click on Yes button in Delete Confirm window
		#Given Admin Clicks on any Delete button located on the right side
		When Admin Clicks on Yes  button
		Then Admin see Success message "Program Deleted Succesfully"
	Scenario: Click on No  button in Delete Confirm window
		When Admin Clicks on No button
		Then Admin can see Program Name not deleted
	#Background: Admin/User/Staff Logged on to LMS Website
	Scenario: Validate Deleted Program Name
		#Given Admin/User/Staff  is on Manage Program page
		When Admin/User/Staff Enters deleted  Program Name in Search
		Then Admin/User/Staff finds no results
	#Background: User/Staff Logged on to LMS Website
	Scenario:	 User/Staff Validates Delete button	
		Given User/Staff is on Manage Program page
		When User/Staff Clicks on Delete buttton
		Then User/Staff see a Error message "Only Admin have Access"	

#Delete Multiple Records Functionality
 	Scenario: Verify the state of Delete button on left hand side
 		Given Admin/User/Staff Logged on to LMS Website
 		When Admin/User/Staff is on Manage Program page
 		Then Admin/User/Staff see the Delete button on the top left hand side as Disabled 
 	#Background: Admin/User/Staff Logged on to LMS Website
  Scenario: Validates Multiple Program Selection
  	#Given Admin/User/Staff is on Manage Program page
  	When Admin/User/Staff selects more than one Program Name using checkbox
  	Then Admin/User/Staff see the Delete button on the top left hand side as Enabled
  #Background: Admin/User/Staff is on Manage Program page
  Scenario: Verifys Deletion of Multiple Records
  	Given Admin selects more than one Program Name using checkbox
  	When Admin Clicks on Enabled Delete button on the top left hand side
  	Then Admin see header text as "Delete Confirm"
  Scenario: Click on Yes button in Delete Confirm window
  	Given Admin Clicks on Enabled Delete button after selecting  more than one Program Name
		When Admin Clicks on Yes  button
		Then Admin see Success message "Program Deleted Succesfully"
  Scenario: Click on No button in Delete Confirm window
  	When Admin Clicks on No button
  	Then Admin can see Program Names not deleted
  #Background: Admin/User/Staff Logged on to LMS Website 
  Scenario: Verify Deleted Program Names
  	#Given Admin/User/Staff  is on Manage Program page
  	When Admin/User/Staff Enters deleted  Program Names in Search 
  	Then Admin/User/Staff finds no results
  #Background: User/Staff/ Logged on to LMS Website
  Scenario: Deletion of Multiple Records
  	Given User/Staff selects more than one Program Name using checkbox
 		When User/Staff Clicks on Enabled Delete button on the top left hand side
 		Then User/Staff see a Error message "Only Admin have Access"

#CheckBox Functionality
	#Background: Admin/User/Staff Logged on to LMS Website
	Scenario: Verify Checkbox Functionality
		#Given Admin/User/Staff is on Manage Program page
		When Admin/User/Staff Selects First checkbox left to Program Name
		Then Admin/User/Staff see all the checkboxes in the Program page get selected
		











 
 
 
 






















 
 
 
 
 
 
 
 



  



  
 

 

 










 
 

 


  



 









 



 





























  
 
 
 
 
 























































