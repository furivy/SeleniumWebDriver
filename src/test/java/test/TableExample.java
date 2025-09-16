package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create the instance of chromedriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with WebTable
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// Find out total num of rows

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		System.out.println("total num of rows are " + rows.size());

		// Find out total num of columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("total num of columns are " + columns.size());
		
		/*System.out.println("First column name is " + columns.get(0).getText());
		System.out.println("Second column name is " + columns.get(1).getText());
		System.out.println("Third column name is " + columns.get(2).getText()); */

		//using for loop print the column names
		for (int i=0;i<columns.size();i++) {
			System.out.println("Column name is " + columns.get(i).getText());
		}
		
		// using for each loop
		
		for(WebElement col:columns) {
			System.out.println(col.getText());
		}
		// Find the country for the given company
		String Company = "Island Trading";
		WebElement CountryName = driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]"));
		System.out.println("Country name is " + CountryName.getText());


	}
}




