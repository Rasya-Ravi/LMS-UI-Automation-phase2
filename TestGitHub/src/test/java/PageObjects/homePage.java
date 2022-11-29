package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
	WebDriver driver;
	
	By getStart = By.xpath("//button[@class='btn']");
	By dropdownDataStructure= By.xpath("//div[@class='nav-item dropdown']") ; 
	By selectanyDataStrucureItem=By.xpath("//div[@class='dropdown-menu show']/a[3]");
	By alertMessage1 =By.xpath("//div[@class='alert alert-primary']"); 
	By getStartBtn =By.xpath("//h5[text()='Array']"); 
	
	  public homePage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	  public void clickOnGetStarted() {
			driver.findElement(getStart).click();
		}
	  public void clickOnDataStructure() throws InterruptedException {
			driver.findElement(dropdownDataStructure).click();
			Thread.sleep(2000);
		}
	  public void selectDataStrucureItem() throws InterruptedException {
			driver.findElement(selectanyDataStrucureItem).click();
			Thread.sleep(2000);
		}
	  public void alert() throws InterruptedException {
			driver.findElement(alertMessage1).getText();
			Thread.sleep(3000);

		}
	  public void clickOnbtnGetStart() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(getStartBtn).click();
			System.out.println("Clicked on Getstart");
		}
}
