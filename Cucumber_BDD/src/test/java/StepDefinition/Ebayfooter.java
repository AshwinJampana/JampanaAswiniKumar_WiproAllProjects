package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebayfooter {
	WebDriver driver;
	@Given("open in desfault browser")
	public void open_in_desfault_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	}

	@When("click on facebook and check working")
	public void click_on_facebook_and_check_working() throws InterruptedException {
		driver.findElement(By.cssSelector("a[_exsp=\"m571.l2942\"]")).click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.close();
	    
	}

	@Then("successful footer working")
	public void successful_footer_working() {
	    System.out.println("Successful working footer link");
	}




}
