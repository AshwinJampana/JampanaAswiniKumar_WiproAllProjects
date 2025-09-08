package Testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrossBrowser_Testing {
	WebDriver driver;
	 @Test
	  public void chrome() throws InterruptedException
	  {
		 driver =new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String act=driver.getTitle();
		  Assert.assertEquals(act,expt,"Title valdation fail");
		  Thread.sleep(3000);
		  System.out.println("FLIPKART -THREAD ID:"+Thread.currentThread().getId());
		  driver.quit();
	  }
	 @Test
	  public void firefox() throws InterruptedException
	  {
		 driver =new FirefoxDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String act=driver.getTitle();
		  Assert.assertEquals(act,expt,"Title valdation fail");
		  Thread.sleep(3000);
		  System.out.println("FLIPKART -THREAD ID:"+Thread.currentThread().getId());
		  driver.quit();
	  }
	 @Test
	  public void edge() throws InterruptedException
	  {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\New folder\\edgedriver_win64\\msedgedriver.exe");
		 driver =new EdgeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  String expt="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		  String act=driver.getTitle();
		  Assert.assertEquals(act,expt,"Title valdation fail");
		  Thread.sleep(3000);
		  System.out.println("FLIPKART -THREAD ID:"+Thread.currentThread().getId());
		  driver.quit();
	  }
}
