package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayShopby {
	WebDriver driver;
	@Given("Open ebay website in default browser")
	public void open_ebay_website_in_default_browser() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	}

	@When("click on shopby category")
	public void click_on_shopby_category() throws InterruptedException {
		driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.cssSelector("a[_sp=\"m570.l3410\"]")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[3]/span/a")).click();
		  Thread.sleep(6000);
		  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
		  Thread.sleep(3000);
	   driver.close();
	}

	@Then("successfuul shopby category")
	public void successfuul_shopby_category() {
	 System.out.println("Successful shop by category");
	}

}
