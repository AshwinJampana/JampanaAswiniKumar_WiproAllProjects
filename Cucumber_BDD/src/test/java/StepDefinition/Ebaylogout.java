package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebaylogout {
	WebDriver driver;
	@Given("open in default browser")
	public void open_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	}

	@When("click on sign and sigin")
	public void click_on_sign_and_sigin() throws InterruptedException {
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

	@When("hover on account settings and logout")
	public void hover_on_account_settings_and_logout() throws InterruptedException {
		WebElement elementToHover = driver.findElement(By.cssSelector("span>div[class=\"gh-flyout is-left-aligned\"]"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(elementToHover).build().perform();
		  Thread.sleep(5000);
		  driver.findElement(By.cssSelector("a[_sp=\"m570.l2622\"]")).click();
		  Thread.sleep(5000);  
		  driver.close();
	    
	}

	@Then("successful logout")
	public void successful_logout() {
	    System.out.print("Successful logout");
	}

}
