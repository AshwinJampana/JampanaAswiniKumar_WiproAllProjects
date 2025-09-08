package StepDefinition;
import java.util.ArrayList;
import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

public class EbayAddtocart { 
	WebDriver driver; 
	@Given("Ebay website should be opened in default browser") 
	public void ebay_website_should_be_opened_in_default_browser(){ 
		driver=new ChromeDriver(); driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); }
	@When("clcik on signin and complete signin")
	public void clcik_on_signin_and_complete_signin() throws InterruptedException {
		WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
		login.click();
		Thread.sleep(10000);
		WebElement name=driver.findElement(By.id("userid"));
		name.sendKeys("ashwin.jampana0706@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("ashwin@1234");
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(4000);
	}
	
	@When("click on search and add ana item to the cart")
	public void click_on_search_and_add_ana_item_to_the_cart() throws InterruptedException {
		driver.findElement(By.id("gh-logo")).click();
    	Thread.sleep(3000);
    	WebElement ns=driver.findElement(By.id("gh-ac"));
    	ns.sendKeys("mobile phones");
    	ns.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	driver.findElement(By.cssSelector("img[alt=\"Apple iPhone XR 64 GB Black Unlocked Lot of 4\"]")).click();
  		Thread.sleep(6000);
  		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
  		driver.switchTo().window(tabs.get(1));
  		JavascriptExecutor js=(JavascriptExecutor)driver;
  		js.executeScript("window.scrollBy(0,400)");
  		driver.findElement(By.id("atcBtn_btn_1")).click();
  		Thread.sleep(7000);
  		driver.close();
  		driver.switchTo().window(tabs.get(0));
  		Thread.sleep(3000);
  		js.executeScript("window.scrollBy(0,-400)");
  		driver.findElement(By.id("gh-logo")).click();
	}
	
	@Then("successful add to cart")
	public void successful_add_to_cart() {
		System.out.print("Successful add to cart");

	}
}

//
//import java.util.ArrayList;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class EbayAddtocart {
//	WebDriver driver;
//	@Given("Ebay website should be opened in default browser")
//	public void ebay_website_should_be_opened_in_default_browser() {
//		driver=new ChromeDriver();
//	    driver.get("https://www.ebay.com/");
//	    driver.manage().window().maximize();
//	}
//
//	@When("clcik on signin and complete signin")
//	public void clcik_on_signin_and_complete_signin() throws InterruptedException {
//		  WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
//		  login.click();
//		  Thread.sleep(10000);
//		  WebElement name=driver.findElement(By.id("userid"));
//		  name.sendKeys("ashiwn.jampana0706@gmail.com");
//		  driver.findElement(By.id("signin-continue-btn")).click();
//		  Thread.sleep(3000);
//		  WebElement pass=driver.findElement(By.id("pass"));
//		  pass.sendKeys("ashwin@123");
//		  driver.findElement(By.id("sgnBt")).click();
//		  Thread.sleep(4000);  
//	}
//
//	@When("click on search and add ana item to the cart")
//	public void click_on_search_and_add_ana_item_to_the_cart() throws InterruptedException {
//		  driver.findElement(By.id("gh-logo")).click();
//		  Thread.sleep(3000);
//		  WebElement ns=driver.findElement(By.id("gh-ac"));
//		  ns.sendKeys("VIVOS1PRO MOBILE black color");
//		  ns.clear();
//		  Thread.sleep(3000);
//		  driver.findElement(By.cssSelector("img[alt=\"For Vivo Y21 Y20 Y91C Y50 V17 Y19 S1 Pro V17 Y11 Wallet Leather Shockproof Case\"]")).click();
//		  Thread.sleep(6000);
//		  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//		  driver.switchTo().window(tabs.get(1));
//		  JavascriptExecutor js=(JavascriptExecutor)driver;
//		  js.executeScript("window.scrollBy(0,400)");
//		  driver.findElement(By.id("atcBtn_btn_1")).click();
//		  Thread.sleep(7000);
//		  driver.close();
//		  driver.switchTo().window(tabs.get(0));
//		  Thread.sleep(3000);
//		  js.executeScript("window.scrollBy(0,-400)");
//		  driver.findElement(By.id("gh-logo")).click();
//		  driver.close();
//		}
//	
//
//	@Then("successful add to cart")
//	public void successful_add_to_cart() {
//		System.out.print("Successful add to cart");
//	   
//	}
//
//}
