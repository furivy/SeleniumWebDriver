package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 1. Create the instance of firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with google
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// 3. To search today is tuesday
		WebElement SearchArea = driver.findElement(By.xpath("//*[@title='Search']"));
		SearchArea.sendKeys("today is tuesday");

		// 4. Select all the text and delete it
		//SearchArea.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.DELETE));

		// 5. Search for another string
		SearchArea.sendKeys("what is the day today?");

	}

}
