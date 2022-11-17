package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOpportunities {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
        //Launch the browser
		 ChromeDriver driver=new ChromeDriver(); 
		//load the url
		driver.get("http://login.salesforce.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      //maximize the browser window
			driver.manage().window().maximize();
			//enter the username
			WebElement findElement = driver.findElement(By.id("username"));
			findElement.sendKeys("hari.radhakrishnan@qeagle.com");
			//enter the password
			 driver.findElement(By.id("password")).sendKeys("Testleaf$321");
			 driver.findElement(By.id("Login")).click();
			 driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			 driver.findElement(By.xpath("//button[text()='View All']")).click();
			 WebElement findElement2 = driver.findElement(By.xpath("//p[@class='slds-truncate'][text()='Sales']"));
			 findElement2.click();
			 Thread.sleep(5000);
			//Oppurtunities Element
			 WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", findElement3);
			//New Button
			 driver.findElement(By.xpath("//div[@title='New']")).click();
			//Oppurtunity Name
			 WebElement findElement4 = driver.findElement(By.xpath("//input[@name='Name']"));
			  findElement4.sendKeys("Salesforce Automation by Sanjana");
			  String inputText =  findElement4.getAttribute("value");
				System.out.println("Oppurtunity Name Entered is: " + " " +inputText);
				Thread.sleep(2000);
				//CloseDate
				driver.findElement(By.xpath("//input[@name = 'CloseDate']")).click();
				//Current Day Date
				driver.findElement(By.xpath("//span[text() = '17']")).click();
				//Stage Dropdown click
				driver.findElement(By.xpath("//div[@class = 'slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']//button")).click();
				//Click option from drodown list
				driver.findElement(By.xpath("//span[@title = 'Needs Analysis']")).click();
				//Save Button
				driver.findElement(By.xpath("//button[@name = 'SaveEdit']")).click();
				if(inputText.contains("Salesforce Automation by Sanjana")) {
					System.out.println("TestCase is Passed");
				}else {
					System.out.println("TestCase is Failed");
				}
				
			
			
			 
			 
			
	}

}
