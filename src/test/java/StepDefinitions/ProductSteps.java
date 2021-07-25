package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {
	
	
	WebDriver driver = BaseClass.driver;
	
	@Given("^- User has opened the SwagLabs application$")
    public void _user_has_opened_the_swaglabs_application() throws Throwable {
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.saucedemo.com/");
    
    }
	
	@When("^- User enters correct username \"([^\"]*)\"$")
    public void _user_enters_correct_username_something(String username) throws Throwable {
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='user-name']"));
    	UserName.sendKeys("standard_user");
      
    }
	
	@And("^- User enters correct password \"([^\"]*)\"$")
    public void _password_and_click_on_login_button_something(String password) throws Throwable {
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
    	Password.sendKeys("secret_sauce");
    	
     
    }
	
	@And("^- User click on Login button$")
    public void user_click_on_login_button() throws Throwable {
    	
    	WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
    
    }
	
    @Given("^User should be landed on the Product page$")
    public void user_should_be_landed_on_the_product_page() throws Throwable {
        
    	WebElement title = driver.findElement(By.xpath("//*[@class='title']"));
    	title.isDisplayed();
    	System.out.println("Landed in Product Page");
    	
    }

    @And("^User selects Product and clicks on Add to Cart button \"([^\"]*)\"$")
    public void user_selects_product_and_clicks_on_add_to_cart_button_something(String product) throws Throwable {
    	
    	WebElement btnAddCrt = driver.findElement(By.xpath("//*[text() = '" + product + "']//following::button[1]"));
		btnAddCrt.click();
		System.out.println("Product Added to My Cart");
    
    }
    
    @And("^- User selects Product and clicks on Add to Cart button$")
    public void user_selects_product_and_clicks_on_add_to_cart_button(DataTable table) throws Throwable {
    	
    	String Product1 = table.cell(0, 0);
    	String Product2 = table.cell(1, 0);
    	String Product3 = table.cell(2, 0);
    	String Product4 = table.cell(3, 0);
    	
    	WebElement adProduct1 = driver.findElement(By.xpath("//*[text() = '" + Product1 + "']//following::button[1]"));
    	adProduct1.click();
    	WebElement adProduct2 = driver.findElement(By.xpath("//*[text() = '" + Product2 + "']//following::button[1]"));
    	adProduct2.click();
    	WebElement adProduct3 = driver.findElement(By.xpath("//*[text() = '" + Product3 + "']//following::button[1]"));
    	adProduct3.click();
    	WebElement adProduct4 = driver.findElement(By.xpath("//*[text() = '" + Product4 + "']//following::button[1]"));
    	adProduct4.click();
		System.out.println("Product Added to My Cart");
    
    }

    @Then("^User should able to see the product in My Cart$")
    public void user_should_able_to_see_the_product_in_my_cart() throws Throwable {
    	
    	WebElement ShoppingCart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    	ShoppingCart.click();
    	System.out.println("Landed in My Cart Page");
    	Thread.sleep(3000);
    
    }
    
    @And("^User Click on Logout$")
    public void user_click_on_logout() throws Throwable {
    	
    	WebElement menu = driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
    	menu.click();
    	WebElement logoutbtn = driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
    	logoutbtn.click();
    	Thread.sleep(2000);

    }

}
