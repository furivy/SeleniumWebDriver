package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 1. Create the instance of chromedriver
			WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with facebook
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
			WebElement SignUp = driver.findElement(By.linkText("Create new account"));
			SignUp.click();
			
		// Locate the month dropdown and get all options
	        List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));

	    // Print all month values
	        for (WebElement month : months) {
	            System.out.println(month.getText());
	        }
	        
	        WebElement defaultYear = driver.findElement(By.xpath("//select[@id='year']/option[@selected='1']"));

	        System.out.println("Default year is: " + defaultYear.getText());

	    // Close browser
	        driver.quit();
	    }
	}
			
	