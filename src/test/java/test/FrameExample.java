
package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create the instance of firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with website
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Switch to the frame using id
		
		driver.switchTo().frame("frame1");
		WebElement FrameHeader = driver.findElement(By.tagName("h1"));
		System.out.println(FrameHeader.getText());


	}

}
