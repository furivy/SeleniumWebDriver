package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String uname = "standard_user";
		String pwd = "secret_sauce";
		
		// 1. Create the instance of chromedriver
		WebDriver driver = new ChromeDriver();

		// 2. Launch the browser with swaglabs
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement Cred = driver.findElement(By.className("login_credentials"));
		System.out.print(Cred.getText());
		
		// 1. Using ID 
		WebElement UserName = driver.findElement(By.id("user-name"));
		
		//2. Using Name
		WebElement Password = driver.findElement(By.name("password"));
		
		// 1. Using ID 
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		
		
		// Enter User Name
		UserName.sendKeys(uname);
		
		// Enter Password
		Password.sendKeys(pwd);
		
		
		// Click on Login Btn
		LoginBtn.click();
		
		// Close The Browser
	driver.close();
}

}


