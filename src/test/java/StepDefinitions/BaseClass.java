package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	
public static WebDriver driver;
	
	@Before
	public void setup() {
		
		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}
	
	@After
	public void teardown() throws InterruptedException {
		
		driver.quit();
	}

}
