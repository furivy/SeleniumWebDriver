package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Create the instance of chromedriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// 4. Tag Name
		
		WebElement Header = driver.findElement(By.tagName("H2"));
		System.out.println(Header.getText());
		
		// 5. LinkText
		
		//WebElement ForgotPwd = driver.findElement(By.linkText("Forgotten password?"));
		//ForgotPwd.click();
		
		//6. Partial LinkText
		
		//WebElement ForgotPwdNew = driver.findElement(By.linkText("Forgotten"));
		//ForgotPwdNew.click();


	}

}


