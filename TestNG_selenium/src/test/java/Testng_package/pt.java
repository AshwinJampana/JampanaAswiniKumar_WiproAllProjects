package Testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pt {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
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










//<suite name="ParallelSuite" parallel="classes" thread-count="3">
//<test name="ParallelTestExecution">
//    <classes>
//        <class name="Testng_package.pt"/>
//        <class name="Testng_package.ebay_fox"/>
//         <class name="Testng_package.ebay_ed"/>
//    </classes>
//</test>
//</suite>