package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import StepDefinitions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
    @Given("^User has opened the SwagLabs application$")
    public void user_has_opened_the_swaglabs_application() throws Throwable {
    	
    	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.saucedemo.com/");
    
    }

    @Then("^User should be landed on the home page$")
    public void user_should_be_landed_on_the_home_page() throws Throwable {
    
    }

    @And("^User enters correct username \"([^\"]*)\"$")
    public void user_enters_correct_username_something(String username) throws Throwable {
    	
    	WebElement UserName = driver.findElement(By.xpath("//input[@id='user-name']"));
    	UserName.sendKeys(username);
   
    }

    @And("^User enters correct Password \"([^\"]*)\"$")
    public void user_enters_correct_password_something(String password) throws Throwable {
    	
    	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
    	Password.sendKeys(password);
    
    }

    @And("^User clicks on Login button$")
    public void user_clicks_on_login_button() throws Throwable {
    	
    	WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
    
    }

    @And("^User should be able to see the Welcome message$")
    public void user_should_be_able_to_see_the_welcome_message() throws Throwable {
    
    }
    
    @And("^User enters incorrect Password \"([^\"]*)\"$")
    public void user_enters_incorrect_password_something(String password) throws Throwable {
    	
    	WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
    	Password.sendKeys(password);
    
    }
    
    @Then("^User should be getting Error Message\"([^\"]*)\"$")
    public void user_should_be_getting_error_message(String error) throws Throwable {
    	
    	WebElement Error = driver.findElement(By.xpath("//*[@class='error-message-container error']"));
    	    	
    	String ActError = Error.getText();
    	assertEquals(ActError, error);
    
    }

}
