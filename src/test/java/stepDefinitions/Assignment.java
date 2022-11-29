package stepDefinitions;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;



public class Assignment extends BaseClass {

	@Given("Admin\\/User\\/Staff is on LMS Website {string}")
	public void admin_user_staff_is_on_lms_website(String title) {
		driver.manage().window().maximize();
		ap = new AssignmentPage(driver);
		String Actualtitle = ap.ValidateHomepagetitle();
	    String Expectedtitle = "page title";
	    Assert.assertEquals(Expectedtitle, Actualtitle);
	    System.out.println(Actualtitle);
	}
	
	@When("Admin\\/User\\/Staff clicks on Assignment page")
	public void admin_user_staff_clicks_on_assignment_page() {
		ap.ClickOnAssignmment();
	}

	@Then("Admin\\/User\\/Staff should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String header) {
		String Actualheader = ap.ValidateHeader();
	    String Expectedheader = "Manage Assignment";
	    Assert.assertEquals(Expectedheader, Actualheader);
	    System.out.println(Actualheader);
	}

	@Then("Admin\\/User\\/Staff should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String msg) {
		String Actualfooter = ap.ValidateFooter();
	    String Expectedheader = "In Total there are 3 Assignments";
	    Assert.assertEquals(Expectedheader, Actualfooter);
	    System.out.println(Actualfooter);
	}
	//paginator

	@Then("Admin\\/User\\/Staff should see a Paginator text {string}")
	public void admin_user_staff_should_see_a_paginator_text(String msg) {
		String Actualfootertext = ap.ValidateFootertext();
	    String Expectedfootertext = "In Total there are 3 Assignments";
	    Assert.assertEquals(Expectedfootertext, Actualfootertext);
	    System.out.println(Actualfootertext);
	}
	@Given("Admin\\/User\\/Staff is on the Assignment Page")
	public void admin_user_staff_is_on_the_assignment_page() {
	    
	}

	@When("Admin\\/User\\/Staff clicks on Enabled paginator-next buttone")
	public void admin_user_staff_clicks_on_enabled_paginator_next_buttone() {
	    ap.ClickonNextbutton();
	}

	@Then("Admin\\/User\\/Staff should navigated to next page {string}")
	public void admin_user_staff_should_navigated_to_next_page(String string) {
		String Actualfootertext = ap.ValidateNextpagetitle();
	    String Expectedfootertext = "correspondingpage";
	    Assert.assertEquals(Expectedfootertext, Actualfootertext);
	    System.out.println(Actualfootertext);
	}
	@When("Admin\\/User\\/Staff clicks on Enabled paginator-prevoius button")
	public void admin_user_staff_clicks_on_enabled_paginator_prevoius_button() {
	   ap.ClickonPreviousbutton();
	}

	@Then("Admin\\/User\\/Staff should navigated to prevoius page {string}")
	public void admin_user_staff_should_navigated_to_prevoius_page(String string) {
		String Actualfootertext = ap.ValidatePrevoiustpagetitle();
	    String Expectedfootertext = "correspondingpage";
	    Assert.assertEquals(Expectedfootertext, Actualfootertext);
	    System.out.println(Actualfootertext);
	}

    @When("Admin\\/User\\/Staff clicks on Enabled paginator-last button")
    public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
         ap.ClickonLastpagebutton();
    }

   @Then("Admin\\/User\\/Staff should navigated to last page")
   public void admin_user_staff_should_navigated_to_last_page() {
    
    }
   @When("Admin\\/User\\/Staff clicks on Enabled paginator-first button")
   public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
       ap.ClickonFirstpagebutton();
   }

   @Then("Admin\\/User\\/Staff should navigated to first page")
   public void admin_user_staff_should_navigated_to_first_page() {
      
   }
   @When("Admin\\/User\\/Staff clicks Search bar and enter the requested Assignment")
   public void admin_user_staff_clicks_search_bar_and_enter_the_requested_assignment() {
       int assignment = 3;
       String assignmentString;
       
       switch(assignment) {
       
       case 1:
    	   assignmentString = "Sql Assignment";
    	   break;
       case 2:
    	   assignmentString = "Selenium Assignment";
    	   break;
       case 3:
    	   assignmentString = "Dev Assignmet";
    	   break;
    	   
       }
       ap.ClickonSearch();
    }
   

   @Then("The requested assignment details should be displayed")
   public void the_requested_assignment_details_should_be_displayed() {
       
   }
   @When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
   public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {
	   
	   
      //before filter
	   List<WebElement> assignmentname = ap.AssignmentName1();
	   String[]beforesort_assignment = new String[assignmentname.size()];
	  
	   //get the text in to the array
	   for(int i=0;i<assignmentname.size();i++) {
		   beforesort_assignment[i]= assignmentname.get(i).getText().trim();
	   }
	  System.out.println("******before sort function********"+beforesort_assignment);
	
	   //sort function
	  Arrays.sort(beforesort_assignment);
	  System.out.println("*********after sort by java*****************"+beforesort_assignment);
	  
	  ap.ClickonAscendingArrow();
	  assignmentname = ap.AssignmentName1(); 	   
	  String[]aftersort_assignment = new String[assignmentname.size()]; 
	   
	//get the text in to the array
	   for(int i=0;i<assignmentname.size();i++) {
		   aftersort_assignment[i]= assignmentname.get(i).getText().trim();
	   }
	   System.out.println("*********after sort function*****************"+aftersort_assignment);
	  
	  
	   Assert.assertEquals(beforesort_assignment, aftersort_assignment);
	   System.out.println("**************sort verified*****************");
   }

   @Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
   public void admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
       
	   
   }
   @When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
   public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
	   
	      //before filter
		   List<WebElement> description = ap.AssignmentDescription();
		   String[]beforesort_description = new String[description.size()];
		  
		   //get the text in to the array
		   for(int i=0;i<description.size();i++) {
			   beforesort_description[i]= description.get(i).getText().trim();
		   }
		  System.out.println("******before sort function********"+beforesort_description);
		
		   //sort function
		  Arrays.sort(beforesort_description);
		  System.out.println("*********after sort by java*****************"+beforesort_description);
		  
		  ap.ClickonAscendingDescriptionArrow();
		  description = ap.AssignmentDescription(); 	   
		  String[]aftersort_description = new String[description.size()]; 
		   
		//get the text in to the array
		   for(int i=0;i<description.size();i++) {
			   aftersort_description[i]= description.get(i).getText().trim();
		   }
		   System.out.println("*********after sort function*****************"+aftersort_description);
		  
		  
		   Assert.assertEquals(beforesort_description, aftersort_description);
		   System.out.println("**************sort verified*****************");
	   }
   

   @Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
   public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {

   }
   @When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
   public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() {
	   //before filter
	   List<WebElement> duedate = ap.AssignmentDuedate();
	  String[]beforesort_duedate = new String [duedate.size()];
	  
	   //get the text in to the array
	   for(int i=0;i<duedate.size();i++) {
		   beforesort_duedate[i]= duedate.get(i).getText();
	   }
	  System.out.println("******before sort function********"+beforesort_duedate);
	
	   //sort function
	  Arrays.sort(beforesort_duedate);
	  System.out.println("*********after sort by java*****************"+beforesort_duedate);
	  
	  ap.ClickonAscendingDuedateArrow();
	  duedate = ap.AssignmentDuedate(); 	   
	  String[]aftersort_duedate = new String[duedate.size()]; 
	   
	//get the text in to the array
	   for(int i=0;i<duedate.size();i++) {
		   aftersort_duedate[i]= duedate.get(i).getText().trim();
	   }
	   System.out.println("*********after sort function*****************"+aftersort_duedate);
	  
	  
	   Assert.assertEquals(beforesort_duedate, aftersort_duedate);
	   System.out.println("**************sort verified*****************");
   }
   

   @Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
   public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
	   
   }
   @When("Verify Assignment Grade are displayed in Ascending order")
   public void verify_assignment_grade_are_displayed_in_ascending_order() {
	 //before filter
	   List<WebElement> grade = ap.AssignmentDuedate();
	  String[]beforesort_grade = new String [grade.size()];
	  
	   //get the text in to the array
	   for(int i=0;i<grade.size();i++) {
		   beforesort_grade[i]= grade.get(i).getText();
	   }
	  System.out.println("******before sort function********"+beforesort_grade);
	
	   //sort function
	  Arrays.sort(beforesort_grade);
	  System.out.println("*********after sort by java*****************"+beforesort_grade);
	  
	  ap.ClickonAscendingDuedateArrow();
	  grade = ap.AssignmentDuedate(); 	   
	  String[]aftersort_grade = new String[grade.size()]; 
	   
	//get the text in to the array
	   for(int i=0;i<grade.size();i++) {
		   aftersort_grade[i]= grade.get(i).getText().trim();
	   }
	   System.out.println("*********after sort function*****************"+aftersort_grade);
	  
	  
	   Assert.assertEquals(beforesort_grade, aftersort_grade);
	   System.out.println("**************sort verified*****************");
        }
   
     @Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
     public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
       
      }
     @When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
     public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
    	 
         //before filter
   	   List<WebElement> assignmentname = ap.AssignmentName1();
   	   String[]beforesort_assignment = new String[assignmentname.size()];
   	  
   	   //get the text in to the array
   	   for(int i=0;i<assignmentname.size();i++) {
   		   beforesort_assignment[i]= assignmentname.get(i).getText().trim();
   	   }
   	  System.out.println("******before sort function********"+beforesort_assignment);
   	
   	   //sort function
   	  Arrays.sort(beforesort_assignment);
   	  System.out.println("*********after sort by java*****************"+beforesort_assignment);
   	  
   	  ap.ClickonDescendingArrow();
   	  assignmentname = ap.AssignmentName1(); 	   
   	  String[]aftersort_assignment = new String[assignmentname.size()]; 
   	   
   	//get the text in to the array
   	   for(int i=0;i<assignmentname.size();i++) {
   		   aftersort_assignment[i]= assignmentname.get(i).getText().trim();
   	   }
   	   System.out.println("*********after sort function*****************"+aftersort_assignment);
   	  
   	  
   	   Assert.assertEquals(beforesort_assignment, aftersort_assignment);
   	   System.out.println("**************sort verified*****************");
      }
     
     @Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
     public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
         
     }
     @When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
     public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
    	//before filter
		   List<WebElement> description = ap.AssignmentDescription();
		   String[]beforesort_description = new String[description.size()];
		  
		   //get the text in to the array
		   for(int i=0;i<description.size();i++) {
			   beforesort_description[i]= description.get(i).getText().trim();
		   }
		  System.out.println("******before sort function********"+beforesort_description);
		
		   //sort function
		  Arrays.sort(beforesort_description);
		  System.out.println("*********after sort by java*****************"+beforesort_description);
		  
		  ap.ClickonDescendingDescriptionArrow();
		  description = ap.AssignmentDescription(); 	   
		  String[]aftersort_description = new String[description.size()]; 
		   
		//get the text in to the array
		   for(int i=0;i<description.size();i++) {
			   aftersort_description[i]= description.get(i).getText().trim();
		   }
		   System.out.println("*********after sort function*****************"+aftersort_description);
		  
		  
		   Assert.assertEquals(beforesort_description, aftersort_description);
		   System.out.println("**************sort verified*****************");
	   }
     

     @Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
     public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
        
     }
     @When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
     public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow() {
    	//before filter
  	   List<WebElement> grade = ap.AssignmentDuedate();
  	  String[]beforesort_grade = new String [grade.size()];
  	  
  	   //get the text in to the array
  	   for(int i=0;i<grade.size();i++) {
  		   beforesort_grade[i]= grade.get(i).getText();
  	   }
  	  System.out.println("******before sort function********"+beforesort_grade);
  	
  	   //sort function
  	  Arrays.sort(beforesort_grade);
  	  System.out.println("*********after sort by java*****************"+beforesort_grade);
  	  
  	  ap.ClickonDescendingGradeArrow();
  	  grade = ap.AssignmentDuedate(); 	   
  	  String[]aftersort_grade = new String[grade.size()]; 
  	   
  	//get the text in to the array
  	   for(int i=0;i<grade.size();i++) {
  		   aftersort_grade[i]= grade.get(i).getText().trim();
  	   }
  	   System.out.println("*********after sort function*****************"+aftersort_grade);
  	  
  	  
  	   Assert.assertEquals(beforesort_grade, aftersort_grade);
  	   System.out.println("**************sort verified*****************");
     }

     @Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
     public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
        
     }
     @When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
     public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
    	//before filter
  	   List<WebElement> grade = ap.AssignmentDuedate();
  	  String[]beforesort_grade = new String [grade.size()];
  	  
  	   //get the text in to the array
  	   for(int i=0;i<grade.size();i++) {
  		   beforesort_grade[i]= grade.get(i).getText();
  	   }
  	  System.out.println("******before sort function********"+beforesort_grade);
  	
  	   //sort function
  	  Arrays.sort(beforesort_grade);
  	  System.out.println("*********after sort by java*****************"+beforesort_grade);
  	  
  	  ap.ClickonDescendingGradeArrow();
  	  grade = ap.AssignmentDuedate(); 	   
  	  String[]aftersort_grade = new String[grade.size()]; 
  	   
  	//get the text in to the array
  	   for(int i=0;i<grade.size();i++) {
  		   aftersort_grade[i]= grade.get(i).getText().trim();
  	   }
  	   System.out.println("*********after sort function*****************"+aftersort_grade);
  	  
  	  
  	   Assert.assertEquals(beforesort_grade, aftersort_grade);
  	   System.out.println("**************sort verified*****************");
          }
     
     @Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
     public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
         
     }
    //Add New assignment 
     
     @Given("Staff is on Manage Assignment page")
     public void staff_is_on_manage_assignment_page() {
         
     }

     @When("Staff clicks a Add new assignment button")
     public void staff_clicks_a_add_new_assignment_button() {
        ap.ClickonAddNewAssignment();
     }

     @Then("Staff should see Assignment details window")
     public void staff_should_see_assignment_details_window() {
    	 ap.AssignmentDetails();
     }
     @Given("Admin\\/User is on Manage Assignment page")
     public void admin_user_is_on_manage_assignment_page() {
         
     }

     @When("Admin\\/User clicks a Add New Assignment button")
     public void admin_user_clicks_a_add_new_assignment_button() {
        ap.ClickonAddNewAssignment();
     }

     @Then("Admin\\/User should see a message {string}")
     public void admin_user_should_see_a_message(String msg) {
    	 String Actualmessage = ap.Alert();
	     Assert.assertTrue(Actualmessage.contains(msg));
     }
     @Given("Staff is on  Assignment Details page")
     public void staff_is_on_assignment_details_page() {
         
     }

     @When("Staff  clicks on Save after leaving all the fields empty")
     public void staff_clicks_on_save_after_leaving_all_the_fields_empty() {
        ap.ClickOnSave();
     }

     @Then("Staff should see an error message {string}")
     public void staff_should_see_an_error_message(String msg) {
    	 String Actualmessage = ap.Alert();
	     Assert.assertTrue(Actualmessage.contains(msg));
     }
     @When("Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate")
     public void staff_clicks_save_button_after_entering_assignment_name_assignment_description_assignment_grade_and_duedate() {
        ap.StaffEnterAssignmentDetails();
        ap.ClickOnSave();
     }

     @Then("Staff should see a message {string}")
     public void staff_should_see_a_message(String msg) {
    	 String Actualmessage = ap.Alert();
	     Assert.assertTrue(Actualmessage.contains(msg));
     }
     @When("Staff clicks cancel button with entering all fields")
     public void staff_clicks_cancel_button_with_entering_all_fields() {
          ap.StaffEnterAssignmentDetails();
          ap.ClickOnCancel();
     }
     @Then("Staff should see a Assignment details window is closed")
     public void staff_should_see_a_assignment_details_window_is_closed() {
         
     }
     @Given("Admin\\/User\\/Staff is on Assignments page")
     public void admin_user_staff_is_on_assignments_page() {
         
     }

     @When("Admin\\/User\\/Staff clicks on Assignment")
     public void admin_user_staff_clicks_on_assignment() {
    	 ap.ClickOnAssignmment();
     }

     @Then("Admin\\/User\\/Staff should see a newly added Assignment")
     public void admin_user_staff_should_see_a_newly_added_assignment() {
        ap.NewAssignment();
     }

@Given("Staff is on Assignment  page")
public void staff_is_on_assignment_page() {
    
}

@When("Staff clicks manage button under Assignment Grade")
public void staff_clicks_manage_button_under_assignment_grade() {
    ap.ClickOnManagebutton();
}

@Then("Staff should be navigated to Grade Window")
public void staff_should_be_navigated_to_grade_window() {
    
}
@When("Staff clicks an edit Assignment button")
public void staff_clicks_an_edit_assignment_button() {
   ap.ClickOnEditbutton();
}

@Then("Staff should see a Assignment details window")
public void staff_should_see_a_assignment_details_window() {
    
}
@Given("Staff is on Assignment Details page1")
public void staff_is_on_assignment_details_page1() {
    
}

@When("Staff clicks Save button  after edits Assignment Name")
public void staff_clicks_save_button_after_edits_assignment_name() {
   ap.ClickOnEditbutton();
	ap.ClickOnSave();
}

@Then("Staff should see  message {string}")
public void staff_should_see_message(String msg) {
	 String Actualmessage = ap.Alert();
     Assert.assertTrue(Actualmessage.contains(msg));
}
@When("Staff clicks Save button  after edits Assignment Description")
public void staff_clicks_save_button_after_edits_assignment_description() {
   ap.ClickOnEditbutton();
   ap.ClickOnSave();
}

@Then("Staffs should see  message {string}")
public void staffs_should_see_message(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}
@When("Staff clicks Save button After edits Assignment Grade")
public void staff_clicks_save_button_after_edits_assignment_grade() {
    ap.ClickOnEditbutton();
    ap.ClickOnSave();
}
@When("Staff clicks Save button After edits Assignment DueDate")
public void staff_clicks_save_button_after_edits_assignment_due_date() {
	ap.ClickOnEditbutton();
    ap.ClickOnSave();
}
@When("Staff clicks cancel button")
public void staff_clicks_cancel_button() {
    ap.ClickOnCancel();
}

@Then("Staff Should see a Assignment Details Page is closed")
public void staff_should_see_a_assignment_details_page_is_closed() {
   
}
@When("Admin\\/User clicks Edit button")
public void admin_user_clicks_edit_button() {
    ap.ClickOnEditbutton();
}
@Given("Admin\\/User\\/Staff is on Assignment page")
public void admin_user_staff_is_on_assignment_page() {
    
}

@When("Admin\\/User\\/Staff clicks on Assignment Name")
public void admin_user_staff_clicks_on_assignment_name() {
    ap.ClickonAssignmentName();
}

@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
public void admin_user_staff_should_be_navigated_to_assignment_google_form_page() {
    
}
@Given("Admin is on Assignment page")
public void admin_is_on_assignment_page() {
	
}

@When("Admin clicks on Assignment Name")
public void admin_clicks_on_assignment_name() {
	ap.ClickonAssignmentName();
}

@Then("Admin should see a warning message {string}")
public void admin_should_see_a_warning_message(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}

@Given("Admin\\/User\\/Staff is on Assignment  Google form page")
public void admin_user_staff_is_on_assignment_google_form_page() {
    
}

@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
public void admin_user_staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
	ap.Enteremail();
	ap.EnterNamefield();
	ap.EnterFavoriteAnimal();
	ap.EnterFavoriteColor();
	ap.ClickonSubmit();
}

@Then("Admin\\/User\\/Staff entered google forms successfully")
public void admin_user_staff_entered_google_forms_successfully() {
    
}
@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
public void admin_user_staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
    ap.Clickonemail();
    ap.ClickonNamefield();
    ap.ClickonFavoriteAnimal();
    ap.ClickonFavoriteColor();
    ap.ClickonSubmit();
}

@Then("Admin\\/User\\/Staff should get a warning message {string}")
public void admin_user_staff_should_get_a_warning_message(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}
@When("Admin\\/User\\/Staff clicks clear form button after entering all questions and mail id")
public void admin_user_staff_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
	ap.Enteremail();
	ap.EnterNamefield();
	ap.EnterFavoriteAnimal();
	ap.EnterFavoriteColor();
	ap.ClickonClearForm();
}

@Then("The Assignment Google form cleared successfully")
public void the_assignment_google_form_cleared_successfully() {
    
}
@When("Admin\\/User\\/Staff clicks Switch account link")
public void admin_user_staff_clicks_switch_account_link() {
   ap.ClickonSwitchAccount();
}

@Then("Admin\\/User\\/Staff should be switched over the account Successfully")
public void admin_user_staff_should_be_switched_over_the_account_successfully() {
   
}
@When("Staff clicks on delete button on the right side")
public void staff_clicks_on_delete_button_on_the_right_side() {
   ap.ClickonDelete();
}

@Then("Staff should see a Delete Confirmation window")
public void staff_should_see_a_delete_confirmation_window() {
    
}
@Given("Staff is on Delete Confirmation window")
public void staff_is_on_delete_confirmation_window() {
    
}

@When("Staff clicks Yes")
public void staff_clicks_yes() {
    ap.ClickonYes();
}

@Then("Staff Should see {string}")
public void staff_should_see(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}

@When("Staff clicks No")
public void staff_clicks_no() {
    ap.ClickonNo();
}

@Then("Confirmation delete window should be closed successfully")
public void confirmation_delete_window_should_be_closed_successfully() {
    
}
@Given("Admin is on Manage Assignment page")
public void admin_is_on_manage_assignment_page() {
   
}

@When("Admin clicks on delete button")
public void admin_clicks_on_delete_button() {
    ap.ClickonDelete();
}

@Then("Admin should see a message {string}")
public void admin_should_see_a_message(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}
@Given("Admin\\/User\\/Staff is on Manage Assignment page")
public void admin_user_staff_is_on_manage_assignment_page() {
    
}

@When("Admin\\/User clicks on delete button")
public void admin_user_clicks_on_delete_button() {
   ap.ClickonDelete();
}

@Then("Admin\\/User\\/Staff should see a message {string}")
public void admin_user_staff_should_see_a_message(String msg) {
	String Actualmessage = ap.Alert();
    Assert.assertTrue(Actualmessage.contains(msg));
}
@When("Admin\\/User\\/Staff clicks on delete button on the top left")
public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {
    ap.ClickonTopLeftDelete();
}

@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
public void admin_user_staff_should_see_a_disabled_delete_button() {
    
}
@When("Staff clicks delete button on the top after selecting multiple checkbox")
public void staff_clicks_delete_button_on_the_top_after_selecting_multiple_checkbox() {
    ap.ClickonTopLeftDelete();
}


@Then("Staff should see a  Delete confirm window")
public void staff_should_see_a_delete_confirm_window() {
   
}
@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
public void admin_user_staff_clicks_check_box_on_the_left_side_to_the_assignment_name() {
    ap.ClickonTopLeftCheckboxofAssignmentName();
}

@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
public void admin_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
    ap.EnabledTopLeftDelete();
}
@When("Admin clicks check box on the left side to the Assignment Name")
public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
    ap.ClickonTopLeftCheckboxofAssignmentName();
}
@When("Admin\\/User\\/Staff clicks individual checkbox button")
public void admin_user_staff_clicks_individual_checkbox_button() {
    ap.ClickonCheckbox();
}

@Then("Admin\\/User\\/Staff should see a delete button on the top left")
public void admin_user_staff_should_see_a_delete_button_on_the_top_left() {
   ap.EnabledTopLeftDelete();
}
@When("Admin clicks individual checkbox button")
public void admin_clicks_individual_checkbox_button() {
    ap.ClickonCheckbox();
}



     










}
