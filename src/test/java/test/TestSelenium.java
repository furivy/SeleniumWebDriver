package test;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create the instance of chromedriver
		WebDriver driver = new ChromeDriver();

		// 2. Launch the browser with google.com
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.close();
	}

}
