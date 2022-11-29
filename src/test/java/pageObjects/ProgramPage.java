package pageObjects;

import java.util.Arrays;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProgramPage {

	WebDriver driver;
	
	By header=By.xpath("//div[@class='_9bp-']");
	By Footer=By.xpath("//div[@id='footer']");
	By pagination =By.xpath("//div[@class='_4bp-']");
	By NextButton=By.id("paginate_next");
	By PrevButton=By.id("paginate_prev");
	By firstButton=By.id("fname");
	By lastButton=By.id("lname");
	By Sort=By.xpath("//*[@id='sort']");
	By list=By.xpath("//div[@class='_4bp-']");
	By addnew=By.xpath("//*[@id='addnew']");
	By name=By.xpath("//*[@id='name']");
	By desc=By.xpath("//*[@id='description']");
	By active=By.xpath("//*[@id='active']");
	By save=By.xpath("//*[@id='save']");
	By confirmaton1=By.xpath( "//h1[normalize-space()='New program has been created']");
	By confirmation2=By.xpath("//h2[normalize-space()='please enter name']");
	By confirmation3=By.xpath("//h2[normalize-space()='please enter description']");
	By confirmation4=By.id("confirmation4");
	By rows=By.xpath("//table[@class='table table-condensed table-hover event-list']/tbody/tr");
	By edit=By.id("edit");
	By delete=By.id("delete");
	By yes=By.id("yes");
	By checkbox=By.id("checkbox");
	By checkboxes=By.id("checkboxes");
	
	public ProgramPage(WebDriver driver) 
	{
		this.driver=driver;
	
	}
	public String validateHeader() {
		String actualheader=driver.findElement(header).getText();
		return actualheader;
	}
	
	public void footertext() // Manage Program Page heading display status
	{
		String ActTitle = driver.findElement(Footer).getText();
		String ExpTitle = "In total there are 9 programs.";
		if (ActTitle.contains(ExpTitle)) {
			System.out.println("Verified the title for ..." + ExpTitle);
		} else
			System.out.println("Title verification went wrong...");

	}
	public String validatePagination(String paginate)
	{
		driver.findElement(pagination);
		return paginate;
	}
	public void nextbutton() 
	{
		boolean next= driver.findElement(NextButton).isEnabled();
		if(next=true)
		{
			driver.findElement(NextButton).click();	
		}
	}
		public void prevbutton() 
		{
			boolean prev= driver.findElement(PrevButton).isEnabled();
			if(prev=true)
			{
				driver.findElement(PrevButton).click();	
			}
				
		}
		public void Firstbutton() 
		{
			boolean first= driver.findElement(firstButton).isEnabled();
			if(first=true)
			{
				driver.findElement(NextButton).click();	
			}
		}
			public void Lastbutton() 
			{
				boolean last= driver.findElement(lastButton).isEnabled();
				if(last=true)
				{
					driver.findElement(PrevButton).click();	
				}
					
			}
			public void ascending() {
				driver.findElement(Sort).click();
				boolean flag = false;
				driver.findElements(list);
				int size = 5;
				String[] actual = new String[size];
				String[] sorted = new String[size];

				for (int i = 0; i < size; i++) {
					actual[i] = sorted[i] = driver.findElement(By.xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i + "]]"))
							.getText();
				}

				
				Arrays.sort(sorted);

				
				for (int i = 0; i < size; i++) {
					if (!actual[i].equals(sorted[i])) {
						System.out.println("The elements the webpage are not sorted");
						System.out.println("expected " + sorted[i] + " but actual " + actual[i] + " at row " + i);
						flag = true;
					}
				}
			}
			public void descending() {
				Actions actions = new Actions(driver);
				actions.doubleClick().perform();
				
				boolean flag = false;
				driver.findElements(list);
				int size = 5;
				String[] actual = new String[size];
				String[] sorted = new String[size];

				for (int i = 0; i < size; i++) {
					actual[i] = sorted[i] = driver.findElement(By.xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i + "]]"))
							.getText();
				}

				
				Arrays.sort(sorted);

				
				for (int i = 0; i < size; i++) {
					if (!actual[i].equals(sorted[i])) {
						System.out.println("The elements the webpage are not sorted");
						System.out.println("expected " + sorted[i] + " but actual " + actual[i] + " at row " + i);
						flag = true;
					}

				}
			}
			public void addnewfuncion() {
				
				String winHandleBefore = driver.getWindowHandle();

				
				driver.findElement(active).click();

			
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}

				
				driver.findElement(name).sendKeys("selenium");
				driver.findElement(desc).sendKeys("gjhture");
				driver.findElement(active).click();
				driver.findElement(save).click();
				

				if (((WebElement) name).getAttribute(" ") == null) {
					System.out.println(driver.findElement(confirmation2));
				} else if (((WebElement) desc).getAttribute(" ") == null) {
					System.out.println(driver.findElement(confirmation3));
				}
			

			driver.close();

			
			driver.switchTo().window(winHandleBefore);

			}

			public int numberofrows() {
				int count = ((java.util.List<WebElement>) rows).size();
				System.out.println("Number of Row : " + count);
				return count;
			}
			public void edit() {
				
				String winHandleBefore = driver.getWindowHandle();

				
				driver.findElement(edit).click();
				
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}

			
				driver.findElement(name).sendKeys("selenium");
				driver.findElement(desc).sendKeys("gjhture");
				driver.findElement(active).click();
				driver.findElement(save).click();
				driver.findElement(confirmation3);
				if (((WebElement) name).getAttribute(" ") == null) {
					System.out.println(driver.findElement(confirmaton1)); 
				} else if (((WebElement) desc).getAttribute(" ") == null) {
					System.out.println(driver.findElement(confirmation3));
				}

			
			driver.close();

			
			driver.switchTo().window(winHandleBefore);

			
			}
			public void delete() {
				
				String winHandleBefore = driver.getWindowHandle();
				driver.findElement(checkbox).click();

				driver.findElement(delete).click();
				
				for (String winHandle : driver.getWindowHandles()) {
					driver.switchTo().window(winHandle);
				}

				
				driver.findElement(yes).click();
				driver.findElement(confirmation4);

				
				driver.close();

			
				driver.switchTo().window(winHandleBefore);

			}
			public void deletemultiplerecords() {
				WebElement[] checkboxes = null;
				for (WebElement el : checkboxes) {
					if (!el.isSelected()) {
						el.click();
					}
				}
				driver.findElement(delete).click();

			}
}
