package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbaySearchStep {
	WebDriver driver;
	
	@Given("Ebay website should opened in homepage")
	public void ebay_website_should_opened_in_homepage() {
		driver=new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	  
	}

	@When("click on vaalues and enter search term")
	public void click_on_vaalues_and_enter_search_term() throws InterruptedException {
		Thread.sleep(1000);
		WebElement search=driver.findElement(By.id("gh-ac"));
		String[] searches= {"watch","phone","laptop"};
		for(String s:searches) {
			  search.sendKeys(s);
			  search.sendKeys(Keys.ENTER);
			  
			  Thread.sleep(3000);
			  search=driver.findElement(By.id("gh-ac"));
			  search.clear();  
			  
		} 
		search=driver.findElement(By.id("gh-ac"));
	  driver.close();
	}

	@Then("Successfull search")
	public void successfull_search() {
	   System.out.println("Successful search");
	}


}


//driver.get("https://www.ebay.com/");
//WebElement search=driver.findElement(By.id("gh-ac"));
//
//String[] searches= {"watch","phone","laptop"};
//for(String s:searches) {
//	  search.sendKeys(s);
//	  search.sendKeys(Keys.ENTER);
//	  Thread.sleep(3000);
//	  if(!s.equals("laptop")) {
//		  search=driver.findElement(By.id("gh-ac"));
//		  search.clear();  
//	  }
//} 
//Thread.sleep(3000);