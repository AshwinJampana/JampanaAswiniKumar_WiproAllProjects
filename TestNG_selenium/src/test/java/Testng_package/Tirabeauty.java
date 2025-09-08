package Testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Tirabeauty {
	
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		  driver =new ChromeDriver();
		  driver.get("https://www.tirabeauty.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  PageClass_tira pg=new PageClass_tira(driver);
	  }
	
	
  @Test
  public void multiple_searches() throws InterruptedException {
	  PageClass_tira pg=new PageClass_tira(driver);
	  pg.search();
  }
  @Test
  public void addtocart() throws InterruptedException {
	  PageClass_tira pg=new PageClass_tira(driver);
	  pg.atc();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  }

}
