package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
        //Launch the browser
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//load the url
		driver.get("http://en-gb.facebook.com/");
      //maximize the browser window
		driver.manage().window().maximize();
		//implicit wait
		
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		findElement.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sanjana");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gottipamula");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9951747455");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Testleaf123456!");
		 driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_day']/option[@value='2']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_month']/option[@value='2']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		 driver.findElement(By.xpath("//select[@name='birthday_year']/option[@value='1995']")).click();
		 driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		 

	}

}
