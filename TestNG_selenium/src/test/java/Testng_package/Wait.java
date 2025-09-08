package Testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wait {
	WebDriver driver;
  @BeforeTest
  public void implicitwait() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
  }
  @Test
  public void openpage()
  {
	 
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  String act=driver.getTitle();
	  Assert.assertEquals(act,expt,"Title valdation fail");
	  
	  
	  WebElement search=driver.findElement(By.name("q"));
	  search.sendKeys("watch");
	  search.sendKeys(Keys.ENTER);
	  System.out.println("Search element is  clicked");
	  WebElement search1=driver.findElement(By.name("q1234567"));
	  search1.click();
	  
	  driver.close();
  }
  
}
