package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParaBankRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// 1. Create the instance of Firefox 
			WebDriver driver = new FirefoxDriver();

			// 2. Launch the browser with Para Bank
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
			WebElement RegisterBtn = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
			RegisterBtn.click();
				
			//3.Enter firstname 
			WebElement FirstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
			FirstName.sendKeys("Ivy");
				
			//4. Enter lastname 
			WebElement LastName = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
			LastName.sendKeys("Soriano");
			
			//5.Enter address 
			WebElement Address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
			Address.sendKeys("Puting Bato");
			
			WebElement City = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
			City.sendKeys("Manila");
			
			WebElement State = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
			State.sendKeys("PH");
			
			WebElement ZipCode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
			ZipCode.sendKeys("1550");
			
			WebElement PhoneNum = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
			PhoneNum.sendKeys("09123456789");
			
			WebElement SSN = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
			SSN.sendKeys("09123456789");
			
			WebElement username = driver.findElement(By.xpath("//input[@id='customer.username']"));
			username.sendKeys("furivy");
			
			WebElement passwrd = driver.findElement(By.xpath("//input[@id='customer.password']"));
			passwrd.sendKeys("Admin123");
			
			WebElement rptpasswrd = driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
			rptpasswrd.sendKeys("Admin123");
				

	}

}
