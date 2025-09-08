package Testng_package;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_all_pom {
	WebDriver driver;
	  @Test(priority=1)
	  public void login() throws InterruptedException {
		  PageClass pg=new PageClass(driver);
		  driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		  pg.username();
		  
		  pg.cont();
		  
		  pg.passw();
		  
		  pg.submit();
		 
	  }
	  @Test(priority=2)
	  public void searchmultipleitems() throws InterruptedException {
		  PageClass pg=new PageClass(driver);
		  pg.search_in();
		  	
		  pg.ebay();
		  
	  }
	  
	  
	 @Test(priority=3)
	  public void addtocart1() throws InterruptedException  {
		  PageClass pg=new PageClass(driver);
		  pg.addtocart();
		 
		  
		  
	  }
	 
	  //@Test(priority=4)
	  public void changeloginname() throws InterruptedException {
		  WebElement elementToHover = driver.findElement(By.cssSelector("div[class=\"gh-nav__left-wrap\"]"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(elementToHover).build().perform();
		  Thread.sleep(3000);
		  
		  
		  driver.get("https://accountsettings.ebay.com/uas");
		  Thread.sleep(3000);
		  driver.findElement(By.id("account-settings-link-PI")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("individual_username_edit_button")).click();
		  Thread.sleep(3000);
		  WebElement inp=driver.findElement(By.id("user_name"));
		  inp.clear();
		  inp.sendKeys("jayadeep");
		  driver.findElement(By.id("username_submit_edit_btn")).click();
		  Thread.sleep(5000);
		  WebElement name=driver.findElement(By.id("userid"));
		  name.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
		  driver.findElement(By.id("signin-continue-btn")).click();
		  Thread.sleep(3000);
		  WebElement pass=driver.findElement(By.id("pass"));
		  pass.sendKeys("suG!i_399AN.PLN");
		  driver.findElement(By.id("sgnBt")).click();
		  Thread.sleep(4000);  
		  
	  }
	  @Test(priority=4)
	  public void changeaddress() throws InterruptedException {
		 PageClass pg=new PageClass(driver);
		 pg.changeadd();
		 
		  
	  }
	  
	 @Test(priority=5)
	  public void shopbycategory() throws InterruptedException{
		 PageClass pg=new PageClass(driver);
		 pg.shopbyc();
	  }

	  @Test(priority=6)
	  public void shopbycategoryall() throws InterruptedException{
		 
		  PageClass pg=new PageClass(driver);
			 pg.shopbyca();
	  }
	  

	  
	  
	  
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  driver =new ChromeDriver();
		  driver.get("https://www.ebay.com/");
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		  
		 
		  
	  }

	  @AfterTest
	  public void afterTest() {
		 
		  driver.close();
	  }

	
}
