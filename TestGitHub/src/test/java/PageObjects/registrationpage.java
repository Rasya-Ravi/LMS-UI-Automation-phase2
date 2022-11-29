package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class registrationpage {
	WebDriver driver;
	By userName = By.id("id_username");
	By passWord = By.id("id_password1");
	By confirmPassWord = By.id("id_password2");
	By register =By.xpath("//input[@value='Register']");
	
	
	public registrationpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}	
	public void enterUserName()
	{
		driver.findElement(userName).sendKeys("Srt678*Ks");
	}
	public void enterPassword()
	{
		driver.findElement(passWord).sendKeys("1234!@#$");
	}
	public void enterConfirmPassword()
	{
		driver.findElement(confirmPassWord).sendKeys("1234!@#$");
	}
	public void clickOnRegisterBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(register).click();
	}

}
