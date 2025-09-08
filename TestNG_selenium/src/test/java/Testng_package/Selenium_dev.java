package Testng_package;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_dev {
	WebDriver driver;
	boolean testfail=false;
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}
	
	
	
  @Test(priority=1)
  public void title() {
	  String expt="Selenium dev";
	  String act=driver.getTitle();
	  Assert.assertEquals(act, expt,"Title validation failed");  
  }
  
  @Test(priority=2)
  public void url() {
	  if (testfail) {
          driver.quit();
      }
	  String expurl="https://www.selenium.dev/";
	  String acurl=driver.getCurrentUrl();
	  Assert.assertEquals(acurl, expurl,"URL  validation failed");
	  
  }
  
  @AfterClass
  public void afterClass(){
	  driver.close();
  }
  
}
