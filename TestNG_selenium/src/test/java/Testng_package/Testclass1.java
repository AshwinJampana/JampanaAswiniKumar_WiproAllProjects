package Testng_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class Testclass1 {
	WebDriver driver;
  @Test
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
  @BeforeClass
  public void beforeClass() {
  }

}
