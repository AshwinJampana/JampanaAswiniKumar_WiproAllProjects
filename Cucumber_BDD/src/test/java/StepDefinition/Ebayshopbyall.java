package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebayshopbyall {
WebDriver driver;
@Given("Open ebay in default browsersd")
public void open_ebay_in_default_browsersd() {
	driver=new ChromeDriver();
    driver.get("https://www.ebay.com/");
    driver.manage().window().maximize();
}

@When("click on shopby category all")
public void click_on_shopby_category_all() throws InterruptedException {
	driver.findElement(By.cssSelector("select>option[value=\"12576\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-search-btn")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
	  Thread.sleep(3000);
	  driver.close();
    
}

@Then("successful shobycategory all")
public void successful_shobycategory_all() {
System.out.println("Successful shop by category all");
}
}
