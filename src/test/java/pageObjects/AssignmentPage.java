package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentPage {
	WebDriver driver;
	
    By lmstitle = By.xpath("//title");
	By Assignment_link = By.xpath("//Assignment");
	By Header =By.xpath("//header");
	By Footer = By.xpath("//footer");
	By Footertext = By.xpath("//footertext");
	By Next_btn = By.xpath("//nextbutton");
	By Nextpagetitle = By.xpath("//next");
	By Previous_btn = By.xpath("//prevoiusbutton");
	By previouspagetitle = By.xpath("//prevoius");
	By Lastpage_btn = By.xpath("//lastpage");
	By Fisrtpage_btn = By.xpath("//firstpagebutton");
	By Search = By.xpath("search");
	By Ascending_arrow = By.xpath("//Ascending name");
	By Assignment_name1 = By.xpath("//tr/td[1]");
	By Ascendingdescription_arrow = By.xpath("//Ascending description");
	By Assignmentdescription1 = By.xpath("//tr/td[2]");
	By Ascendingdate_arrow = By.xpath("//ascending date");
	By Assignmentduedate1 = By.xpath("//tr/td[3]");
	By Ascendinggrade_arrow = By.xpath("//ascending grade");
	By Assignmentgrade1 = By.xpath("//ascending grade");
	By Descendingname_arrow = By.xpath("//descending name");
	By Descendingdescription_arrow = By.xpath("//Descending description");
	By Descendingduedate_arrow = By.xpath("//Descending duedate");
	By Descendinggrade_arrow = By.xpath("//Descending grade");
	By Addnewassignment_btn = By.xpath("//button");
	By Assignmentdetails = By.xpath("//assignmentdetails");
	By Alert = By.xpath("//div[@class='alert alert-primary']");
	By Save_button = By.xpath("//save");
	By Assignmentname= By.xpath("//assignmentname");
	By Assignmentdescription= By.xpath("//assignmentdescription");
	By Assignmentgrade= By.xpath("//assignmentgrade");
	By Assignmentduedate= By.xpath("//assignmentduedate");
	By Cancel_btn = By.xpath("//cancelbutton");
	By Newassignment = By.xpath("//new assignment");
	By Manage_button = By.xpath("//manage");
	By Edit_button = By.xpath("//edit");
	By Submit_btn = By.xpath("//submit");
	By email = By.xpath("//email");
	By Namefield = By.xpath("//firstnamelastname");
	By Favanimal = By.xpath("//favorite");
	By Favcolor = By.xpath("//color");
	By Clearform = By.xpath("//clear");
	By Switchaccount = By.xpath("//switch");
	By Delete_btn = By.xpath("//delete");
	By Yes_btn = By.xpath("//yes");
	By No_btn = By.xpath("//no");
	By Topleftdelete = By.xpath("//delete");
	By Checkboxassignmentname = By.xpath("//checkbox");
	By Checkbox = By.xpath("//checkbox");
	
	public AssignmentPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String ValidateHomepagetitle() {
		String actualtitle = driver.findElement(lmstitle).getText();
		return actualtitle;
	}
	
	public void ClickOnAssignmment() {
		driver.findElement(Assignment_link).click();
	}
	public String ValidateHeader() {
		String actualheader = driver.findElement(Header).getText();
		return actualheader;
	}
	public String ValidateFooter() {
		String actualfooter = driver.findElement(Footer).getText();
		return actualfooter;
	}
	public String ValidateFootertext() {
		String actualfootertext = driver.findElement(Footertext).getText();
		return actualfootertext;
	}
	
	public void ClickonNextbutton() {
		driver.findElement(Next_btn).click();
		
	}
	public String ValidateNextpagetitle() {
		String nextpagetitle = driver.findElement(Nextpagetitle).getText();
		return nextpagetitle;
	}
	public void ClickonPreviousbutton() {
		driver.findElement(Previous_btn).click();
	}
	public String ValidatePrevoiustpagetitle() {
		String prevpagetitle = driver.findElement(previouspagetitle).getText();
		return prevpagetitle;
	}
	public void ClickonLastpagebutton() {
		driver.findElement(Lastpage_btn).click();
	}
	public void ClickonFirstpagebutton() {
		driver.findElement(Fisrtpage_btn).click();
	}
	public void ClickonSearch() {
		driver.findElement(Search).click();
	}
    public void ClickonAscendingArrow() {
	driver.findElement(Ascending_arrow).click();
    }
    public List<WebElement> AssignmentName1() {
    	driver.findElement(Assignment_name1);
		return AssignmentName1();
        }
    public void ClickonAscendingDescriptionArrow() {
    	driver.findElement(Ascendingdescription_arrow).click();
        }
    public List<WebElement> AssignmentDescription() {
    	driver.findElement( Assignmentdescription1);
		return AssignmentDescription();
        }
    public void ClickonAscendingDuedateArrow() {
    	driver.findElement(Ascendingdate_arrow).click();
        }
    public List<WebElement> AssignmentDuedate() {
    	driver.findElement( Assignmentduedate1);
		return AssignmentDuedate();
        }
    public void ClickonAscendingGradeArrow() {
    	driver.findElement(Ascendinggrade_arrow).click();
        }
    public List<WebElement> AssignmentGrade() {
    	driver.findElement( Assignmentgrade1);
		return AssignmentGrade();
        }
    public void ClickonDescendingArrow() {
    	driver.findElement(Descendingname_arrow).click();
        }
    public void ClickonDescendingDescriptionArrow() {
    	driver.findElement(Descendingdescription_arrow).click();
        }
    public void ClickonDescendingDuedateArrow() {
    	driver.findElement(Descendingduedate_arrow).click();
    	
        }
    public void ClickonDescendingGradeArrow() {
    	driver.findElement(Descendinggrade_arrow).click();
        }
    public void ClickonAddNewAssignment() {
    	driver.findElement(Addnewassignment_btn).click();
        }
    public void AssignmentDetails() {
    	driver.findElement(Assignmentdetails).isDisplayed();
        }

	public String Alert() {
		String AlertMsg =driver.findElement(Alert).getText();
		System.out.println("ALERT#################"+AlertMsg);
		return AlertMsg;
	}
	public void ClickOnSave() {
		driver.findElement(Save_button).click();
	}
	public void StaffEnterAssignmentDetails() {
		driver.findElement(Assignmentname).sendKeys("sql");
	
		driver.findElement(Assignmentdescription).sendKeys("sql practice");
	
		driver.findElement(Assignmentgrade).sendKeys("A");

		driver.findElement(Assignmentduedate).sendKeys("12/11/2022");
	}
	public void ClickOnCancel() {
		driver.findElement(Cancel_btn).click();
	}
	public void NewAssignment() {
		driver.findElement(Newassignment).isDisplayed();
	}
	public void ClickOnManagebutton() {
		driver.findElement(Manage_button).click();
	}
	public void ClickOnEditbutton() {
		driver.findElement(Edit_button).click();
	}
	public void ClickonAssignmentName() {
		driver.findElement(Assignmentname).click();
	}
	public void ClickonSubmit() {
		driver.findElement(Submit_btn).click();
	}
	
	public void Enteremail() {
		driver.findElement(email).sendKeys("abcd");
	}
	public void EnterNamefield() {
		driver.findElement(Namefield).sendKeys("abcd");
	}
	public void EnterFavoriteAnimal() {
		driver.findElement(Favanimal).sendKeys("abcd");
	}
	public void EnterFavoriteColor() {
		driver.findElement(Favcolor).sendKeys("abcd");
	}
	public void ClickonFavoriteColor() {
		driver.findElement(Favcolor).click();
	}
	public void ClickonFavoriteAnimal() {
		driver.findElement(Favanimal).click();
	}
	public void Clickonemail() {
		driver.findElement(email).click();
	}
	public void ClickonNamefield() {
		driver.findElement(Namefield).click();
	}
	public void ClickonClearForm() {
		driver.findElement(Clearform).click();
	}
	public void ClickonSwitchAccount() {
		driver.findElement(Switchaccount).click();
	}
	public void ClickonDelete() {
		driver.findElement(Delete_btn).click();
	}
	public void ClickonYes() {
		driver.findElement(Yes_btn).click();
	}
	public void ClickonNo() {
		driver.findElement(No_btn).click();
	}
	public void ClickonTopLeftDelete() {
		driver.findElement(Topleftdelete).click();
	}
	public void ClickonTopLeftCheckboxofAssignmentName() {
		driver.findElement(Checkboxassignmentname).click();
	}
	public void EnabledTopLeftDelete() {
		driver.findElement(Topleftdelete).isDisplayed();
	}

	public void ClickonCheckbox() {
		driver.findElement(Checkbox).click();
	}
	
}