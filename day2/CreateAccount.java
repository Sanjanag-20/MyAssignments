package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
			 //Accounts tab
			 WebElement findElement3 = driver.findElement(By.xpath("//span[text()='Accounts']"));
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", findElement3);
			//New Button
			 driver.findElement(By.xpath("//div[@title='New']")).click();
				//AccountName Field
			 WebElement findElement4 = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input"));
			 findElement4.sendKeys("Sanjana.G");
			 String name = findElement4.getAttribute("value");
				//Ownership Field
    WebElement findElement5 = driver.findElement(By.xpath("//div[@class = 'slds-input__icon-group slds-input__icon-group_right']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				 executor1.executeScript("arguments[0].click()",findElement5);
				//driver.findElement(By.xpath("//span[text() = 'Public']")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@name = 'SaveEdit']")).click();
				
				if(name.contains("Sanjana.G")) {
					System.out.println("AccountName is Created");
				}else {
					System.out.println("TestCase is Failed");
				}
	}

}
