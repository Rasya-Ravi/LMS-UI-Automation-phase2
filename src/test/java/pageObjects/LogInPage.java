package pageObjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver  driver;
	By loginBtn= By.xpath("//button");
	By username=By.id("email");
	By password=By.id("pass");
	By code=By.xpath("//code");
	By header=By.xpath("//h1");
	By erroemesg=By.xpath("//div[@class='_9ay7']");
	By forgotpswd=By.xpath("//div/a[text()='Forgot password?']");
	By emailaddress=By.xpath("//input[@name='email']");
	By email =By.id("identifierId");
	By clickNext=By.xpath("//span[text()='Next']");
	By pswd=By.xpath("//a[text()='password']");
	By continueBtn=By.xpath("[value='1']");
	By veriCode=By.id("code");
	By continueVerific= By.id("continue");
	By clickHere=By.xpath("//a[text()='clickhere']");
	By newPassword=By.id("newpassword");
	By reTypePassword=By.id("repassword");
	By verifcodemail=By.xpath("//a[text()='code']");
	By gmailverficationcode=By.xpath("//a[text()='code']");
	By submit=By.id("submit");
	By cancelBtn=By.xpath("//a[text()='cancel']");
	public LogInPage(WebDriver driver) {
		
		this.driver=driver;
	}
	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}
	public void enterUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void enterCode(String cod) {
		driver.findElement(code).sendKeys(cod);
	}
	public String validateHeader() {
		String actualHeader= driver.findElement(header).getText();
		return actualHeader;
	}
	public String validateerrormesg() {
		String actualerrormesg= driver.findElement(erroemesg).getText();
		return actualerrormesg;
	}
	public void clickOnForgotPswd() {
		driver.findElement(forgotpswd).click();
	}
	public void enterEmailAddress(String email) {
		driver.findElement(emailaddress).sendKeys(email);
	}
	public void clickOnContinueBtn() {
		driver.findElement(continueBtn).click();
	}
	public void enterVerificationCode(String code) {
		driver.findElement(veriCode).sendKeys(code);
	}
	public void clickOnContinueVerification() {
		driver.findElement(continueVerific).click();
	}
	public void clickHere() {
		driver.findElement(clickHere).click();
	}
	public void enternewpassword(String newpswd) {
		driver.findElement(newPassword).sendKeys(newpswd);
	}
	public void enterreTypePassword(String repswd) {
      driver.findElement(reTypePassword).sendKeys(repswd);		
	}
	public String entergmailcredentials() {
		driver.findElement(email).sendKeys("dummy@gmail.com");
		driver.findElement(clickNext).click();
		driver.findElement(pswd).sendKeys("abcd123");
		driver.findElement(clickNext).click();
		driver.findElement(verifcodemail).click();
		String code= driver.findElement(gmailverficationcode).getText();
       return code;
		
	}
	public void clicksubmit() {
		driver.findElement(submit).click();
	}
	public void clickcancelBtn() {
		
		driver.findElement(cancelBtn).click();
		
	}
	public void checkEmptyfield() {
	String newpswd=driver.findElement(username).getText();
		StringUtils.isEmpty(newpswd);
		String retypepswd=driver.findElement(password).getText();
		StringUtils.isEmpty(retypepswd);
	}
}
