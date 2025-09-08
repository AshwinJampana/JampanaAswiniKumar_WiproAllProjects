package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayremoveitemStep {
	WebDriver driver;
	
	@Given("ebay site should be opened in default browser")
	public void ebay_site_should_be_opened_in_default_browser() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
	}

	@When("click on sigin and complete signin process")
	public void click_on_sigin_and_complete_signin_process() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		  login.click();
		  Thread.sleep(10000);
		  WebElement name=driver.findElement(By.id("userid"));
		  name.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
		  driver.findElement(By.id("signin-continue-btn")).click();
		  Thread.sleep(3000);
		  WebElement pass=driver.findElement(By.id("pass"));
		  pass.sendKeys("suG!i_399AN.PLN");
		  driver.findElement(By.id("sgnBt")).click();
		  Thread.sleep(4000); 
	}

	@When("click on cart and remove item from cart")
	public void click_on_cart_and_remove_item_from_cart() throws InterruptedException {
		driver.findElement(By.cssSelector("span[class=\"gh-cart__icon\"]")).click();
		  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
		  driver.findElement(By.id("gh-logo")).click();
		  Thread.sleep(3000);
		  driver.close();
	    
	}

	@Then("successful remove from cart")
	public void successful_remove_from_cart() {
		System.out.println("Successful remove from cart");
	   
	}

}

