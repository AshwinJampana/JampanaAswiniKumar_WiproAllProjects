package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebaychangeadd {
WebDriver driver;
@Given("ebay site should be opened in default browse")
public void ebay_site_should_be_opened_in_default_browse() {
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();

}

@When("click on signin and complete process")
public void click_on_signin_and_complete_process() throws InterruptedException {
	WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
	  login.click();
	  Thread.sleep(10000);
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("ashwin.jampana0706@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(3000);
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("ashwin@123");
	  driver.findElement(By.id("sgnBt")).click();
	  Thread.sleep(4000); 
}

@When("hover on account and complete change address")
public void hover_on_account_and_complete_change_address() throws InterruptedException {
	 WebElement elementToHover = driver.findElement(By.cssSelector("span>div[class=\"gh-flyout is-left-aligned\"]"));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(elementToHover).build().perform();
	  Thread.sleep(5000);
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l3399\"]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("account-settings-link-PI")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,400)");
	  
	  driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,400)");
	  WebElement inp=driver.findElement(By.id("addressLine1"));
	  inp.clear();
	  inp.sendKeys("HIG-15,Near Nexus Mall");
			  
	  WebElement ct=driver.findElement(By.id("city"));
	  ct.clear();
	  ct.sendKeys("Hyderabad");	  
	  
	  driver.findElement(By.cssSelector("select>option[value=\"TS\"]"));
	  
	  
	  WebElement pc=driver.findElement(By.id("postalCode"));
	  pc.clear();
	  pc.sendKeys("500085");	
	
	  
	  driver.findElement(By.id("address_edit_submit_button")).click();
	  Thread.sleep(5000);
	driver.close();
    
}

@Then("successful chang address")
public void successful_chang_address() {
   System.out.println("successful  change addres");
}

}
