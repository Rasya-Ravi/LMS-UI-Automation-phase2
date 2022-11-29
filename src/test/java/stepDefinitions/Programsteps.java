package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPage;

public class Programsteps extends BaseClass {

//HeaderValidation

	@Given("Admin\\/User\\/Staff Logged on to LMS Website {string}")
	public void admin_user_staff_logged_on_to_lms_website(String url) 
	{
		driver.get(url);  
	}

	@When("Admin\\/User\\/Staff  is on Manage Program page")
	public void admin_user_staff_is_on_manage_program_page() {
		System.out.println("lands on Manage Program page" +driver);
	}
	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String Header) 
	{
		pp=new ProgramPage(driver);
		String actualHeader = pp.validateHeader();
		System.out.println("************" +actualHeader);
		Assert.assertTrue(actualHeader.contains(Header)); 
	}

//FooterValidation  
	
	@Then("Admin\\/User\\/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as() 
	{
		pp=new ProgramPage(driver);
		pp.footertext();
		
	}

//PaginatorValidation
	
	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String pagination)
	{
	  pp.validatePagination(pagination); 
	}
		
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button()
	{
	    pp.nextbutton();
	}
	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String string)
	{
	  System.out.println("see Paginator text as Showing 6 to 9 of 9 entries"); 
	}
	@When("Admin\\/User\\/Staff Clicks on Enabled paginator prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button()
	{
	  pp.prevbutton();  
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button()
	{
	    pp.Lastbutton();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to()
	{
	    System.out.println("see Page number navigated");
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button()
	{
	    pp.Firstbutton();
	}
//Search TextBox Functionality
	
	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String string)
	{
	   
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
	    
	}

	@Then("Entries for the searched Program Name are shown")
	public void entries_for_the_searched_program_name_are_shown() {
	    
	}

	@When("Admin\\/User\\/Staff enters Program Description to be searched")
	public void admin_user_staff_enters_program_description_to_be_searched() {
	    
	}

	@Then("Entries for the searched Program Description are shown")
	public void entries_for_the_searched_program_description_are_shown() {
	    
	}

	@When("Admin\\/User\\/Staff enters Program Status to be searched")
	public void admin_user_staff_enters_program_status_to_be_searched() {
	    
	}

	@Then("Entries for the searched Program Status are shown")
	public void entries_for_the_searched_program_status_are_shown() {
	   
	}
//#Ascending order Functionality
	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
	 pp.ascending();  
	}

	
//#Descending order Functionality
	
	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
	pp.descending(); 
	}
	
//#Add A New Program Functionality
	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_manage_program_page() {
	  pp.addnewfuncion();  
	}

	@When("Admin Clicks on  {string} button")
	public void admin_clicks_on_button(String string) {
	    
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String string) {
	   
	}

	@When("Admin Clicks on Save button with out entering  details")
	public void admin_clicks_on_save_button_with_out_entering_details() {
	    
	}

	@Then("Admin see Error message {string}")
	public void admin_see_error_message(String string) {
	    
	}

	@When("Admin Clicks on Save button after entering all details")
	public void admin_clicks_on_save_button_after_entering_all_details() {
	    
	}

	@Then("Admin see Success message {string}")
	public void admin_see_success_message(String string) {
	   
	}

	@When("Admin Clicks on Save button after entering Name alone")
	public void admin_clicks_on_save_button_after_entering_name_alone() {
	    
	}

	@When("Admin Clicks on Save button after entering Description alone")
	public void admin_clicks_on_save_button_after_entering_description_alone() {
	    
	}

	@When("Admin Clicks on Save button after selecting Status alone")
	public void admin_clicks_on_save_button_after_selecting_status_alone() {
	    
	}

	@When("Admin Clicks on Cancel button")
	public void admin_clicks_on_cancel_button() {
	    
	}
//
	@Then("Admin see a Program Details window getting closed")
	public void admin_see_a_program_details_window_getting_closed() {
	    
	}

	@When("Admin\\/User\\/Staff Enters newly added  Program Name in Search")
	public void admin_user_staff_enters_newly_added_program_name_in_search() {
	   
	}

	@Then("Entry for the newly added Program Name is shown")
	public void entry_for_the_newly_added_program_name_is_shown() {
	    
	}

	@Given("User\\/Staff is on Manage Program page")
	public void user_staff_is_on_manage_program_page() {
	   
	}

	@When("User\\/Staff Clicks on  {string} button")
	public void user_staff_clicks_on_button(String string) {
	    
	}

	@Then("User\\/Staff see a Error message {string}")
	public void user_staff_see_a_error_message(String string) {
	    
	}
//#Number of rows in a Table
	
	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
	   pp.numberofrows(); 
	}
//#Edit Functionality
	
	@When("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {
	    pp.edit();
	}

	
	@When("Admin Clicks on Save button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {
	    
	}

	@When("Admin  Clicks on Save button after updating  Description")
	public void admin_clicks_on_save_button_after_updating_description() {
	    
	}
	@Then("Admin see Success message\"Updated Description\"")
	public void admin_see_success_message_updated_description() {
	    
	}
	@When("Admin  Clicks on Save button after Changing  status")
	public void admin_clicks_on_save_button_after_changing_status() {
	   
	}

	@When("Admin\\/User\\/Staff Enters edited Program Name in Search")
	public void admin_user_staff_enters_edited_program_name_in_search() {
	    
	}

	@Then("Entry for the edited  Program Name is shown")
	public void entry_for_the_edited_program_name_is_shown() {
	    
	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
	    
	}
	
	// #Delete Functionality
	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
	   pp.delete(); 
	}

	@When("Admin Clicks on Yes  button")
	public void admin_clicks_on_yes_button() {
	    
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
	    
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
	    
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
	    
	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
	   
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
	    
	}

	

//#Delete Multiple Records Functionality
	
	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	 pp.deletemultiplerecords();   
	}

	@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox")
	public void admin_user_staff_selects_more_than_one_program_name_using_checkbox() {
	    
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
	    
	}

	@Given("Admin selects more than one Program Name using checkbox")
	public void admin_selects_more_than_one_program_name_using_checkbox() {
	    
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    
	}

	@Given("Admin Clicks on Enabled Delete button after selecting  more than one Program Name")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name() {
	    
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {
	    
	}

	@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {
	    
	}

	@Given("User\\/Staff selects more than one Program Name using checkbox")
	public void user_staff_selects_more_than_one_program_name_using_checkbox() {
	   
	}

	@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side")
	public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	    
	}
	
//#CheckBox Functionality	
	@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name")
	public void admin_user_staff_selects_first_checkbox_left_to_program_name() {
	    
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected() {
	    
	}
	

//------
@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
    
}

@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow")
public void admin_user_staff_clicks_on_program_description_ascending_arrow() {
   
}

@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order")
public void admin_user_staff_see_the_program_description_displayed_in_ascending_order() {
    
}

@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow")
public void admin_user_staff_clicks_on_program_status_ascending_arrow() {
    
}

@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order")
public void admin_user_staff_see_the_program_status_displayed_in_ascending_order() {
    
}

@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin\\/User\\/Staff Clicks on Program Description Descending Arrow")
public void admin_user_staff_clicks_on_program_description_descending_arrow() {
    
}

@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending order")
public void admin_user_staff_see_the_program_description_displayed_in_descending_order() {
    
}

@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow")
public void admin_user_staff_clicks_on_program_status_descending_arrow() {
   
}

@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order")
public void admin_user_staff_see_the_program_status_displayed_in_descending_order() {
    
}

@Given("Admin\\/User\\/Staff Logged on to LMS Website")
public void admin_user_staff_logged_on_to_lms_website() {
    
}

}

