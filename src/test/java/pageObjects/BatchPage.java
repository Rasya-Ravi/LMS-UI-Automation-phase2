package pageObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class BatchPage {

	  WebDriver  driver;

	public BatchPage(WebDriver driver) {
		this.driver =  driver;
	}
	public String parentwindow=driver.getWindowHandle(); 
	By clkBatchBtn = By.xpath("//div[@class='element-list collapse show']");
	By headertext = By.xpath("//div[text()='Practice Form']");
	By footertext = By.xpath("//footertext");
	By clknextBtn = By.xpath("//span[text()='Next']");
	By clkprevBtn = By.xpath("//span[text()='Previous']");
	By clkLastBtn = By.xpath("//lastbutton");
	By pagenumber = By.xpath("//pagenumber");
	By clkFirstBtn = By.xpath("//firstbutton");
	By searchtxt = By.id("search");
	By textValidate = By.xpath("//div[@class='_2MImiq']/span");
	By clickBNAscentingArrow = By.xpath("//th[text()='Position']");
	By batchDescAscentingArrow = By.xpath("//th[text()='Position']");
	By bStatusAscentingArrow = By.xpath("");
	By numofClassesAscArrow = By.xpath("");
	By programNameAscArrow = By.xpath("");
	By batchNameDescentArrow = By.xpath("//th[text()='Position']");
	By batchDescDescentingArrow = By.xpath("//th[text()='Position']");
	By bStatusDescentingArrow = By.xpath("");
	By numofClassesDescArrow = By.xpath("");
	By programNameDescArrow = By.xpath("");
	By newBatchBtn = By.xpath("");
	By saveBtn = By.xpath("//div[@class='mat-grid-tile-content']/mat-card");
	By errormesg = By.xpath("");
	By entername = By.id("");
	By enterDescription = By.id("");
	By dropdown = By.id("oldSelectMenu");
	By dropdownSelect = By.id("oldSelectMenu");
	By status = By.id("status");
	By numclass = By.id("numclass");
	By cancelBtn = By.xpath("//*[@id='mat-dialog-4']/app-product-details/mat-dialog-content/div/div[2]/mat-dialog-actions/button[1]");
	By batchName = By.id("search");
	By editbtn =By.id("edit");
	By deletebtn=By.id("delete");
	By yesbtn =By.id("yes");
	By noBtn=By.id("no");
	By checkbox1=By.id("check1");
	By checkbox2=By.id("check2");
	public void clickOnBatchBtn() {
		driver.findElement(clkBatchBtn).click();
	}

	public String validateheader() {
		String header = driver.findElement(headertext).getText();
		return header;
	}

	public String validatefooter() {
		String footer = driver.findElement(footertext).getText();
		return footer;
	}

	public String gettextForValidation() {
		String text = driver.findElement(textValidate).getText();
		return text;
	}

	public void clickOnNextBtn() {
		driver.findElement(clknextBtn).isEnabled();
		driver.findElement(clknextBtn).click();
	}

	public void clickOnPreviousBtn() {
		driver.findElement(clkprevBtn).isEnabled();
		driver.findElement(clkprevBtn).click();
	}

	public void clickOnLastBtn() {
		driver.findElement(clkLastBtn).isEnabled();
		driver.findElement(clkLastBtn).click();
	}

	public void clickOnFirstBtn() {
		driver.findElement(clkFirstBtn).isEnabled();
		driver.findElement(clkFirstBtn).click();
	}

	public void textcurrentpage() {
		for (int i = 1; i <= 6; i++) {
			String currentpagenum = driver.findElement(By.xpath("//nav[@class='yFHi8N']/a[" + i + "]")).getText();
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&" + currentpagenum);
		}
	}

	public void validateSearch() {
		driver.findElement(searchtxt).isDisplayed();
		String searchword=driver.findElement(searchtxt).getText();
		if(driver.getPageSource().contains(searchword))
		{
			System.out.println("The word found");
		}
		else
		{
			System.out.println("No Results");
		}
		driver.findElement(searchtxt).clear();;

	}

	public void enterBatchname() {
		driver.findElement(searchtxt).sendKeys("Sdet82");
	}

	public void enterInSearchBtn(String text) {
		driver.findElement(searchtxt).sendKeys(text);
		
	}

	public void clickOnAscendingBName() {
		driver.findElement(clickBNAscentingArrow).click();
	}

	public void validateAscentingOrder() {
		List<String> ascenting = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			ascenting.add(beforesort.getText());
			System.out.println("**************" + ascenting);

		}
		boolean isSorted = ascenting.stream().sorted().collect(Collectors.toList()).equals(ascenting);
		System.out.println(isSorted);
		System.out.println("**************" + ascenting);
		Assert.assertTrue(isSorted);

	}

	public void clickOnAscenBDescription() {
		driver.findElement(batchDescAscentingArrow).click();
	}

	public void validateAscentingOrderDesc() {
		List<String> ascenting = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			ascenting.add(beforesort.getText());
			System.out.println("**************" + ascenting);

		}
		boolean isSorted = ascenting.stream().sorted().collect(Collectors.toList()).equals(ascenting);
		System.out.println(isSorted);
		System.out.println("**************" + ascenting);
		Assert.assertTrue(isSorted);

	}

	public void clickonBStatusAscentingArrow() {
		driver.findElement(bStatusAscentingArrow).click();
	}

	public void validateAscentingOrderStatus() {
		List<String> ascenting = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			ascenting.add(beforesort.getText());
			System.out.println("**************" + ascenting);

		}
		boolean isSorted = ascenting.stream().sorted().collect(Collectors.toList()).equals(ascenting);
		System.out.println(isSorted);
		System.out.println("**************" + ascenting);
		Assert.assertTrue(isSorted);

	}

	public void clickonNumofClassesAscArrow() {
		driver.findElement(numofClassesAscArrow).click();
	}

	public void validateAscentingOrderClasses() {
		List<String> ascenting = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			ascenting.add(beforesort.getText());
			System.out.println("**************" + ascenting);
		}
		boolean isSorted = ascenting.stream().sorted().collect(Collectors.toList()).equals(ascenting);
		System.out.println(isSorted);
		System.out.println("**************" + ascenting);
		Assert.assertTrue(isSorted);

	}

	public void clickOnProgramNameAscArrow() {
		driver.findElement(programNameAscArrow).click();
	}

	public void validateAscentingOrderProg() {
		List<String> ascenting = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			ascenting.add(beforesort.getText());
			System.out.println("**************" + ascenting);
		}
		boolean isSorted = ascenting.stream().sorted().collect(Collectors.toList()).equals(ascenting);
		System.out.println(isSorted);
		System.out.println("**************" + ascenting);
		Assert.assertTrue(isSorted);

	}

	public void validateDescentingOrderName() {
		
		List<String> descending = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			descending.add(beforesort.getText());
		}
		System.out.println("**************" + descending);
		boolean isSorted = descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.equals(descending);
		System.out.println(isSorted);
		Assert.assertTrue(isSorted);
	}

	public void clickOnBatchNameDescentArrow() {
		driver.findElement(batchNameDescentArrow).click();
	}

	public void clickOnBatchDescriptionDescentArrow() {
		driver.findElement(batchDescDescentingArrow).click();
	}

	public void validateDescentingOrderDesc() {
		List<String> descending = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			descending.add(beforesort.getText());
		}
		System.out.println("**************" + descending);
		boolean isSorted = descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.equals(descending);
		System.out.println(isSorted);
		Assert.assertTrue(isSorted);
	}

	public void clickOnBatchStatusDescentArrow() {
		driver.findElement(bStatusDescentingArrow).click();
	}

	public void validateDescentingOrderBStatus() {
		List<String> descending = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			descending.add(beforesort.getText());
		}
		System.out.println("**************" + descending);
		boolean isSorted = descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.equals(descending);
		System.out.println(isSorted);
		Assert.assertTrue(isSorted);
	}

	public void clickOnNoOfClassessDescentArrow() {
		driver.findElement(numofClassesDescArrow).click();
	}

	public void validateDescentingOrderClass() {
		List<String> descending = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			descending.add(beforesort.getText());
		}
		System.out.println("**************" + descending);
		boolean isSorted = descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.equals(descending);
		System.out.println(isSorted);
		Assert.assertTrue(isSorted);
	}

	public void clickOnProgramNameDescentArrow() {
		driver.findElement(programNameDescArrow).click();
	}

	public void validateDescentingOrderProgram() {
		List<String> descending = new ArrayList();
		for (int i = 1; i <= 5; i++) {
			WebElement beforesort = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]"));
			descending.add(beforesort.getText());
		}
		System.out.println("**************" + descending);
		boolean isSorted = descending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.equals(descending);
		System.out.println(isSorted);
		Assert.assertTrue(isSorted);
	}

	public void clickOnNewBatchBtn() {
		driver.findElement(newBatchBtn).click();
	}

	public void clickOnSaveBtn() {
		driver.findElement(saveBtn).click();
	}

	public String validateerrormesg() {
		String errormsg = driver.findElement(errormesg).getText();
		return errormsg;
	}

	public void enterName(String name) {
		driver.findElement(entername).sendKeys(name);
	}

	public void enterDescription(String desc) {
		driver.findElement(enterDescription).sendKeys(desc);
	}

	public void clickOnDropDown() {
		driver.findElement(dropdown).click();
	}

	public void dropdownValidate() {
		Select select = new Select(driver.findElement(dropdownSelect));
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println("List Of programs" + option.getText());
		}
	}

	public void selectprogramName() {
		Select select = new Select(driver.findElement(dropdownSelect));
		select.selectByIndex(4);

	}

	public void selectStatus() {
		WebElement selectstatus=driver.findElement(status);
		selectstatus.click();
	}

	public void enterNumClass(String num) {
		driver.findElement(numclass).sendKeys(num);
	}

	public void clickOnCancelBtn() {
		driver.findElement(cancelBtn).click();
	}

	public void enternewBatchName() {
		driver.findElement(batchName).sendKeys("sdet");

	}

	public void clickOnEditBtn() {
		driver.findElement(editbtn).click();
	}

	public void updateName() {
		driver.findElement(entername).sendKeys("sdet82");
		
	}

	public void updateDesc() {
driver.findElement(enterDescription).sendKeys("Qualitiy");		
	}

	public void updateProgramName() {
		driver.findElement(dropdown).click();
		Select select = new Select(driver.findElement(dropdownSelect));
		select.selectByIndex(7);
	}

	public void updateStatus() {
		WebElement selectstatus=driver.findElement(status);
		selectstatus.click();
	}

	public void updateNumClasses() {
		driver.findElement(numclass).sendKeys("2");
	}

	public void validateentry() {
		driver.findElement(searchtxt).isDisplayed();
		
	}

	public void clickOnDeleteBtn() {
		driver.findElement(deletebtn).click();
		
	}

	public void clickOnYesBtn() {
		driver.findElement(yesbtn).click();
		
	}

	public void validateProgramName() {
		driver.findElement(dropdownSelect).isDisplayed();
		
	}

	public void clickOnNoBtn() {
		driver.findElement(noBtn).click();
		
	}

	public void validateDeleteBtn() {
		WebElement delete=driver.findElement(By.xpath("//deletebutton"));
		boolean isEnabled =delete.isEnabled();
		if (!isEnabled) {
			System.out.println("Delete Button is diabled");
		}
		else
		{
			System.out.println("Delete Button is enabled");

		}
		
	}

	public void clickOnCheckbox() {
		driver.findElement(checkbox1).click();
		driver.findElement(checkbox2).click();

	}

	public void clickleftsideDeleteBtn() {
		driver.findElement(By.id("delete")).click();
	}

	public void clickFirstCheckbox() {
		driver.findElement(By.id("Firstcheckbox")).click();
	}

	public void validateCheckBox() {
		WebElement checkBoxElement = driver.findElement(By.xpath("label[for='hobbies-checkboxs']"));
		boolean isSelected = checkBoxElement.isSelected();
				
		if(isSelected == true) {
			System.out.println("All checkbox were selected");		}
	}

	public void validateSearchbutton() {
		driver.findElement(searchtxt).isDisplayed();
		if(driver.getPageSource().contains("search"))
		{
			System.out.println("The word found");
		}
		
	}
	public void validateclosewindow() {
		if(driver.getWindowHandle() != parentwindow) {
			System.out.println("Batch Details window is not closed");
			}
			else 
				System.out.println("Batch Details window is closed");
	}
}
		