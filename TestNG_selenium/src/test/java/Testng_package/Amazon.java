package Testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	
	@BeforeTest
	public void t() {
		driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=13905050251723794525&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147349&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	  @Test (priority = 1)
	  public void login() throws InterruptedException {
		  driver.findElement(By.id("nav-link-accountList")).click();
		  WebElement login = driver.findElement(By.id("ap_email_login"));
		  login.sendKeys("8886801300");
		  login.sendKeys(Keys.ENTER);
		  WebElement password = driver.findElement(By.id("ap_password"));
		  password.sendKeys("j12@KOTA");
		  password.sendKeys(Keys.ENTER);
	  }
	  
	  @Test(priority=2)
	  public void multiplesearch() {
		  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		  
		  String[] searches= {"watch","phone","laptop"};
		  for(String s:searches) {
			  search.sendKeys(s);
			  search.sendKeys(Keys.ENTER);
			  search=driver.findElement(By.id("twotabsearchtextbox"));
			  search.clear();
	  }
	  }
	  @Test(priority=3)
	  public void addtocartdelete() throws InterruptedException {
		  WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		  search.sendKeys("vivo s1 pro");
		  search.sendKeys(Keys.ENTER);

		  driver.findElement(By.cssSelector("button[id=\"a-autoid-1-announce\"]")).click();

		 WebElement cart = driver.findElement(By.cssSelector("a[id=\"nav-cart\"]"));
		  cart.click();
		  
		  
		  WebElement delete = driver.findElement(By.cssSelector("span[data-a-selector=\"decrement-icon\"]"));
		  delete.click();  
	  }

	  @Test(priority=4)
	  public void searchByCat() {
			 driver.findElement(By.id("searchDropdownBox")).click();
			  driver.findElement(By.cssSelector("select>option[value=\"search-alias=stripbooks\"]")).click();
			  WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
			  search.sendKeys("Harry Potter");
			  search.sendKeys(Keys.ENTER);
		}
	  
	  @Test(priority=5)
	  public void ChangeLanguage() {
		  driver.findElement(By.cssSelector("a[class=\"nav-a nav-a-2 icp-link-style-2\"]")).click();
			  
			  driver.findElement(By.id("icp-language-translation-hint")).click();
			  
			  driver.findElement(By.id("icp-save-button")).click();;
		}
	  @Test(priority=6)
	  public void ChangeCountry() {
		  driver.findElement(By.id("nav-logo-sprites")).click();
			  
			  driver.findElement(By.id("icp-touch-link-country")).click();
			  
			  driver.findElement(By.cssSelector("span[class=\"a-button-text a-declarative\"]")).click();
			  driver.findElement(By.id("icp-dropdown_6")).click();
		}
	  
	  @Test(priority=7)
	  public void TodayDeals() throws InterruptedException {
			 driver.findElement(By.id("nav-logo-sprites")).click();
			  
			  driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_gb\"]")).click();
			  
			  Thread.sleep(3000);
		}
	  
	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
	  
	  
}

