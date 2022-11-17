package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		//Setup the chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//Launch the driver
		ChromeDriver driver = new ChromeDriver();
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
			//svg Icon(Right Corner '+' button)
				WebElement findElement2 = driver.findElement(By.xpath("//span[@id = 'tt-for-7:2001;a']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", findElement2);
				Thread.sleep(10000);
				//Click New Task
				driver.findElement(By.xpath("//span[text() = 'New Task']")).click();
				//Enter Bootcamp in Subject Field
				WebElement findElement3 = driver.findElement(By.xpath("//input[@id = 'combobox-input-105']"));
				findElement3.sendKeys("Bootcamp");
				String name = findElement3.getAttribute("value");
				//Click subject field
				driver.findElement(By.xpath("//a[text() = 'Not Started']")).click();
				//Click 'Waiting on Someone else'
				driver.findElement(By.xpath("//a[@title = 'Waiting on someone else']")).click();
				//Click 'Save' button
				driver.findElement(By.xpath("//div[@class = 'bottomBarRight slds-col--bump-left']/button")).click();
				if(name.contains("Bootcamp")) {
					System.out.println("Task 'Bootcamp' is Created");
				}else {
					System.out.println("Task Not Created");
				}

				
				
				
				
			 

	}

}
