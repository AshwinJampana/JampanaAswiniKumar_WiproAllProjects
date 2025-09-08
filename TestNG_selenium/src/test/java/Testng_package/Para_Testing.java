package Testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Para_Testing {
	WebDriver driver;
	
	@BeforeClass
   public void beforeClass() {
		//driver =new ChromeDriver();
		//driver.manage().window().maximize();
		
		
	  }
  @Test(priority=4)
  public void eBay() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.get("https://ebay.com");
	  Thread.sleep(3000);
	  driver.quit();
	  System.out.println("E-BAY -THREAD ID:"+Thread.currentThread().getId());
  }
  @Test(priority=3)
  public void amazon() throws InterruptedException
  {
	  driver =new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  String exp="https://www.amazon.in/";
	  String ac=driver.getCurrentUrl();
	  Assert.assertEquals(ac,exp,"Url valdation fail");
	  Thread.sleep(3000);
	  System.out.println("AMAZON -THREAD ID:"+Thread.currentThread().getId());
	  driver.quit();
	  
  }
  
  @Test(priority=1)
  public void flipkart() throws InterruptedException
  {
	  driver =new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String act=driver.getTitle();
	  Assert.assertEquals(act,expt,"Title valdation fail");
	  Thread.sleep(3000);
	  System.out.println("FLIPKART -THREAD ID:"+Thread.currentThread().getId());
	  driver.quit();
  }
  
 
  @Test(priority=2)
  public void Zerobank() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/index.html");
	  WebElement search=driver.findElement(By.id("searchTerm"));
	  search.sendKeys("online banking");
	  search.sendKeys(Keys.ENTER);
	  Assert.assertTrue(true,"Search button is not clickable");
	  System.out.println("ZERO BANK -THREAD ID:"+Thread.currentThread().getId());
	  Thread.sleep(3000);
	  
	 
	  driver.quit();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
