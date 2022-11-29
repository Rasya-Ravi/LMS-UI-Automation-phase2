package stepDefinitions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.BatchPage;

public class BatchStep extends BaseClass {

	@When("Admin\\/User\\/Staff Clicks on Batch button")
	public void admin_user_staff_clicks_on_batch_button() {
		bp = new BatchPage(driver);
		bp.clickOnBatchBtn() ;
	}

	@Then("Admin\\/User\\/Staff see header text as {string}")
	public void admin_user_staff_see_header_text_as(String header) {
		String actualheader = bp.validateheader();
		Assert.assertTrue(actualheader.contains(header));
	}

	@When("Admin\\/User\\/Staff is on Manage Batch page as title {string}")
	public void admin_user_staff_is_on_manage_batch_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertEquals(title, actualtitle);
	}

	@Then("Admin\\/User\\/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String footer) {
		String actualfooter = bp.validatefooter();
		Assert.assertTrue(actualfooter.contains(footer));
	}

	@Given("Admin\\/User\\/Staff Logged on to LMS Website as title {string}")
	public void admin_user_staff_logged_on_to_lms_website_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertEquals(title, actualtitle);
	}

	@Then("Admin\\/User\\/Staff  see the text as {string}")
	public void admin_user_staff_see_the_text_as(String expectedtext) {
		bp = new BatchPage(driver);
		String actualtext = bp.gettextForValidation();
		System.out.println("**********************************" + actualtext);
		Assert.assertTrue(actualtext.contains(expectedtext));
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
	public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
		bp = new BatchPage(driver);
		bp.clickOnNextBtn();
	}

	@Then("Admin\\/User\\/Staff see Paginator text as {string}")
	public void admin_user_staff_see_paginator_text_as(String expectedtext) throws InterruptedException {
		Thread.sleep(1000);
		String actualtext = bp.gettextForValidation();
		System.out.println("**********************************" + actualtext);
		Assert.assertTrue(actualtext.contains(expectedtext));
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button")
	public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
		bp.clickOnPreviousBtn();
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button")
	public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
		bp.clickOnLastBtn();
	}

	@Then("Admin\\/User\\/Staff see Page number navigated to {string}")
	public void admin_user_staff_see_page_number_navigated_to(String pagenum) {
		// String currentpage=
		bp.textcurrentpage();
		// System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+String.valueOf(currentpage));
		// Assert.assertEquals(currentpage, pagenum);
	}

	@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button")
	public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
		bp.clickOnFirstBtn();
	}

	@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}")
	public void admin_user_staff_see_the_search_text_box_has_text_as(String search) {
		bp = new BatchPage(driver);
		bp.validateSearchbutton();
	}

	@When("Admin\\/User\\/Staff enters Batch Name to be searched")
	public void admin_user_staff_enters_batch_name_to_be_searched() {
		bp = new BatchPage(driver);
		bp.enterInSearchBtn("sdet");
	}

	@Then("Entries for the searched BatchName are shown")
	public void entries_for_the_searched_batch_name_are_shown() {
		bp = new BatchPage(driver);
		bp.validateSearch();
	}

	@When("Admin\\/User\\/Staff enters Batch Description to be searched")
	public void admin_user_staff_enters_batch_description_to_be_searched() {
		bp.enterInSearchBtn("Automation testing");
	}

	@Then("Entries for the searched Batch Description are shown")
	public void entries_for_the_searched_batch_description_are_shown() {
		bp.validateSearch();

	}

	@When("Admin\\/User\\/Staff enters Batch Status to be searched")
	public void admin_user_staff_enters_batch_status_to_be_searched() {
		bp.enterInSearchBtn("current");
	}

	@Then("Entries for the searched Batch Status are shown")
	public void entries_for_the_searched_batch_status_are_shown() {
		bp.validateSearch();
	}

	@When("Admin\\/User\\/Staff enters No Of Classes to be searched")
	public void admin_user_staff_enters_no_of_classes_to_be_searched() {
		bp.enterInSearchBtn("20");

	}

	@Then("Entries for the searched No Of Classes are shown")
	public void entries_for_the_searched_no_of_classes_are_shown() {
		bp.validateSearch();
	}

	@When("Admin\\/User\\/Staff enters Program Name to be searched")
	public void admin_user_staff_enters_program_name_to_be_searched() {
		bp.enterInSearchBtn("Automation");
	}

	@Then("Entries for the searched Program Name are shown")
	public void entries_for_the_searched_program_name_are_shown() {
		bp.validateSearch();

	}

//Ascending order Functionality
	@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
		bp = new BatchPage(driver);
		bp.clickOnAscendingBName();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {

		bp = new BatchPage(driver);
		bp.validateAscentingOrder();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
		bp.clickOnAscenBDescription();
	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
		bp.validateAscentingOrder();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
	public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
		bp.clickonBStatusAscentingArrow();
	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
		bp.validateAscentingOrder();
	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classess Ascending Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_ascending_arrow() {
		bp.clickonNumofClassesAscArrow();
	}

	@Then("Admin\\/User\\/Staff see the No Of Classess displayed in Ascending order")
	public void admin_user_staff_see_the_no_of_classess_displayed_in_ascending_order() {
		bp.validateAscentingOrder();

	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
	public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		bp.clickOnProgramNameAscArrow();
	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
	public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
		bp.validateAscentingOrder();

	}

	// Descending order Functionality
	@When("Admin\\/User\\/Staff Clicks on Batch Name Descending  Arrow")
	public void admin_user_staff_clicks_on_batch_name_descending_arrow() {
		bp = new BatchPage(driver);
		bp.clickOnBatchNameDescentArrow();
	}

	@Then("Admin\\/User\\/Staff see the Batch Name displayed in Descending order")
	public void admin_user_staff_see_the_batch_name_displayed_in_descending_order() {
		bp.validateDescentingOrderName();
	}

	@When("Admin\\/User\\/Staff Clicks on Batch Description Descending Arrow")
	public void admin_user_staff_clicks_on_batch_description_descending_arrow() {
		bp.clickOnBatchDescriptionDescentArrow();

	}

	@Then("Admin\\/User\\/Staff see the Batch Description displayed in Descending order")
	public void admin_user_staff_see_the_batch_description_displayed_in_descending_order() {
		bp.validateDescentingOrderDesc();

	}

	@When("Admin\\/User\\/Staff Clicks on Batch Status Descending Arrow")
	public void admin_user_staff_clicks_on_batch_status_descending_arrow() {
		bp.clickOnBatchStatusDescentArrow();

	}

	@Then("Admin\\/User\\/Staff see the Batch Status displayed in Descending order")
	public void admin_user_staff_see_the_batch_status_displayed_in_descending_order() {
		bp.validateDescentingOrderBStatus();

	}

	@When("Admin\\/User\\/Staff Clicks on No Of Classess Descending Arrow")
	public void admin_user_staff_clicks_on_no_of_classess_descending_arrow() {
		bp.clickOnNoOfClassessDescentArrow();

	}

	@Then("Admin\\/User\\/Staff see the No Of Classess displayed in Descending order")
	public void admin_user_staff_see_the_no_of_classess_displayed_in_descending_order() {
		bp.validateDescentingOrderClass();

	}

	@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
	public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		bp.clickOnProgramNameDescentArrow();

	}

	@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
	public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {

		bp.validateDescentingOrderProgram();
	}

	// Number Of rows
	@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
	public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer expectedrows) {
		int actualrows = driver.findElements(By.xpath("//table[@id='example']//tbody/tr")).size();
		System.out.println("Number of rows : " + actualrows);
		Assert.assertEquals(String.valueOf(actualrows), String.valueOf(expectedrows));
		WebElement currentpage = driver
				.findElement(By.xpath("//div[@id='example_paginate']/span/a[@class='paginate_button current']"));
		System.out.println(currentpage.getText());
	}
//Validate new batch page
	@Given("Admin is on Manage Batch page as title {string}")
	public void admin_is_on_manage_batch_page_as_title(String title) {
		String actualtitle = driver.getTitle();
		Assert.assertEquals(title, actualtitle);
	}

	@When("Admin Clicks on  A New Batch button")
	public void admin_clicks_on_a_new_batch_button() {
		//bp.clickOnNewBatchBtn();
	}

	@Then("Admin see header text as {string}")
	public void admin_see_header_text_as(String header) {
		String actualheader = bp.validateheader();
		Assert.assertTrue(actualheader.contains(header));
	}

@When("Admin Clicks on Save button with out entering  details")
public void admin_clicks_on_save_button_with_out_entering_details() {
   bp.clickOnSaveBtn();
}

@Then("Admin see Error message {string}")
public void admin_see_error_message(String errormesg) {
	String actualmesg = bp.validateerrormesg();
	Assert.assertTrue(actualmesg.contains(errormesg));
}

@When("^Admin Clicks on Save button after entering Name alone$")
public void admin_clicks_on_save_button_after_entering_name_alone(DataTable name) {
     List<List<String>>data=name.cells();
    bp.enterName(data.get(0).get(0));
    bp.clickOnSaveBtn();
}

@When("^Admin Clicks on Save button after entering Description alone$")
public void admin_clicks_on_save_button_after_entering_description_alone(DataTable description) {
	 List<List<String>>data=description.cells();
	    bp.enterDescription(data.get(0).get(0));
	    bp.clickOnSaveBtn();
}

@When("Admin Clicks on DropDown Menu")
public void admin_clicks_on_drop_down_menu() {
	bp=new BatchPage(driver);
   bp.clickOnDropDown();
}

@Then("Admin see list of all Program Names")
public void admin_see_list_of_all_program_names() {
	bp.dropdownValidate();
}

@Given("Admin Clicks on  A New Batch button and  Clicks on DropDown Menu in Batch Details window")
public void admin_clicks_on_a_new_batch_button_and_clicks_on_drop_down_menu_in_batch_details_window() {
    bp.clickOnNewBatchBtn();
    bp.clickOnDropDown();
}

@When("Admin Clicks on Save button after selecting a Program Name only from the dropdown")
public void admin_clicks_on_save_button_after_selecting_a_program_name_only_from_the_dropdown() {
	bp.selectprogramName();
   bp.clickOnSaveBtn();
}

@When("Admin Clicks on Save button after entering Status alone")
public void admin_clicks_on_save_button_after_entering_status_alone() {
	bp.selectStatus();
	bp.clickOnSaveBtn();
}
@When("Admin Clicks on Save button after entering only Number Of Classes")
public void admin_clicks_on_save_button_after_entering_only_number_of_classes(DataTable numclass) {
	 List<List<String>>data=numclass.cells();
	 bp.enterNumClass(data.get(0).get(0));
	    bp.clickOnSaveBtn();
}

@When("Admin Clicks on Save Button after entering all details")
public void admin_clicks_on_save_button_after_entering_all_details() {
   bp.enterName("Sdet");
   bp.enterDescription("Automation");
   bp.selectprogramName();
   bp.selectStatus();
   bp.enterNumClass("10");
}

@Then("Admin see Success message {string}")
public void admin_see_success_message(String errormesg) {
	String actualmesg = bp.validateerrormesg();
	Assert.assertTrue(actualmesg.contains(errormesg));
}


@When("Admin Clicks on Cancel button")
public void admin_clicks_on_cancel_button() {
    bp=new BatchPage(driver);
    bp.clickOnSaveBtn();
bp.clickOnCancelBtn();
}

@Then("Admin see a Batch Details window getting closed")
public void admin_see_a_batch_details_window_getting_closed() {
	
	bp.validateclosewindow();
}
@When("Admin\\/User\\/Staff Enters newly added  Batch Name in Search")
public void admin_user_staff_enters_newly_added_batch_name_in_search() {
    bp=new BatchPage(driver);
	bp.enternewBatchName();
}

@Then("Entry for the newly added Batch Name is shown")
public void entry_for_the_newly_added_batch_name_is_shown() {
    bp.validateSearch();
}

@Given("User\\/Staff is on Manage Batch page as title {string}")
public void user_staff_is_on_manage_batch_page_as_title(String title) {
	String actualtitle = driver.getTitle();
	Assert.assertEquals(title, actualtitle);
}

@When("User\\/Staff\\/Staff Clicks on A New Batch button")
public void user_staff_staff_clicks_on_a_new_batch_button() {
    bp.clickOnNewBatchBtn();
}

@Then("User\\/Staff see a Error message {string}")
public void user_staff_see_a_error_message(String errormesg) {
	String actualmesg = bp.validateerrormesg();
	Assert.assertTrue(actualmesg.contains(errormesg));
}
//Edit functionality
@When("Admin Clicks on Edit buttton")
public void admin_clicks_on_edit_buttton() {
   bp.clickOnEditBtn();
}

@When("Admin Clicks on Save button after updating Name")
public void admin_clicks_on_save_button_after_updating_name() {
    bp.updateName();
    bp.clickOnSaveBtn();
}

@When("Admin Clicks on Save Button after updating Description")
public void admin_clicks_on_save_button_after_updating_description() {
   bp.updateDesc();
   bp.clickOnSaveBtn();
}
@When("Admin Clicks on Save button after Selecting another Program Name")
public void admin_clicks_on_save_button_after_selecting_another_program_name() {
    bp.updateProgramName();
    bp.clickOnSaveBtn();
}
@When("Admin Clicks on Save button after updating Status")
public void admin_clicks_on_save_button_after_updating_status() {
   bp.updateStatus();
   bp.clickOnSaveBtn();
}

@When("Admin Clicks on Save button after updating No Of Classes")
public void admin_clicks_on_save_button_after_updating_no_of_classes() {
    bp.updateNumClasses();
    bp.clickOnSaveBtn();
}

@When("Admin\\/User\\/Staff  Enters edited Batch Name\\/Batch Description in Search")
public void admin_user_staff_enters_edited_batch_name_batch_description_in_search() {
    bp.enterInSearchBtn("sdet82");
}

@Then("Entry for the edited  Batch Name\\/Batch Description is shown")
public void entry_for_the_edited_batch_name_batch_description_is_shown() {
   bp.validateentry();
}

@When("User\\/Staff Clicks on Edit buttton")
public void user_staff_clicks_on_edit_buttton() {
    bp.clickOnEditBtn();
}

@When("Admin Clicks on any Delete button located on the right side")
public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
   bp.clickOnDeleteBtn();
}

@When("Admin Clicks on Yes  button")
public void admin_clicks_on_yes_button() {
   bp.clickOnYesBtn();
}

@When("Admin Clicks on No button")
public void admin_clicks_on_no_button() {
   bp.clickOnNoBtn(); 
}

@Then("Admin can see Program Name not deleted")
public void admin_can_see_program_name_not_deleted() {
    bp.validateProgramName();
}

@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search")
public void admin_user_staff_enters_deleted_program_name_in_search() {
    bp.enterInSearchBtn("Automation");
}

@Then("Admin\\/User\\/Staff finds no results")
public void admin_user_staff_finds_no_results() {
    bp.validateSearch();
}

@When("User\\/Staff Clicks on Delete buttton")
public void user_staff_clicks_on_delete_buttton() {
   bp.clickOnDeleteBtn();
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
  bp.validateDeleteBtn();
}

@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
public void admin_user_staff_selects_more_than_one_batch_name_using_checkbox() {
   bp.clickOnCheckbox();
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled() {
   bp.validateDeleteBtn();
}

@Given("Admin selects more than one Batch Name using checkbox")
public void admin_selects_more_than_one_batch_name_using_checkbox() {
    
}

@When("Admin Clicks on Enabled Delete button on the top left hand side")
public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
    bp.clickleftsideDeleteBtn();
}

@Given("Admin Clicks on Enabled Delete button after selecting  more than one Batch Name")
public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_batch_name() {
   
}

@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search")
public void admin_user_staff_enters_deleted_program_names_in_search() {
    bp.enterInSearchBtn("SDETTest");
}

@Given("User\\/Staff selects more than one Batch  Name using checkbox")
public void user_staff_selects_more_than_one_batch_name_using_checkbox() {
   bp.clickOnCheckbox();
}

@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
public void user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
    bp.clickleftsideDeleteBtn();
}

@When("Admin\\/User\\/Staff Selects First checkbox left to Batch Name")
public void admin_user_staff_selects_first_checkbox_left_to_batch_name() {
   bp.clickFirstCheckbox();
}

@Then("Admin\\/User\\/Staff see all the checkboxes in the Batch page get selected")
public void admin_user_staff_see_all_the_checkboxes_in_the_batch_page_get_selected() {
    bp.validateCheckBox();
}

}
