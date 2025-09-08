package Testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ebay_ed{
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\New folder\\edgedriver_win64\\msedgedriver.exe");
		  driver =new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
  @Test
  public void search() throws InterruptedException {
	  driver.get("https://www.ebay.com/");
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  
	  String[] searches= {"watch","phone","laptop"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  search=driver.findElement(By.id("gh-ac"));
			  search.clear();  
		  
	  } 
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-logo")).click();
  }

  
  @AfterClass
  public void afterClass(){
	  driver.close();
  }
  
}
