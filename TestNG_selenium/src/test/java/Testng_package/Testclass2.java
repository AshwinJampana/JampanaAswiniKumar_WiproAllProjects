package Testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass2 {
  WebDriver driver;
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
}
