package Testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Ebay_testing {
	WebDriver driver;
  @Test
  public void search() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("watch");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
//	  Thread.sleep(4000);
	  
//	  WebElement search1=driver.findElement(By.id("gh-ac"));
//	  search1.clear();
//	  search1.sendKeys("phone");
//	  search1.sendKeys(Keys.ENTER);
	  
	  
	  
//	  String[] searches= {"watch","phone","laptop"};
//	  for(String s:searches) {
//		  search.sendKeys(s);
//		  search.sendKeys(Keys.ENTER);
//		  search=driver.findElement(By.id("gh-ac"));
//		  search.clear();
//		   
//	  }

	  
	  
  }
  @Test
  public void search1() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("mobile");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
  @Test(priority=1)
  public void search2() throws InterruptedException {
	  
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("laptop");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver =new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() {
	  Assert.assertTrue(true,"no error");
	  driver.close();
  }

}
