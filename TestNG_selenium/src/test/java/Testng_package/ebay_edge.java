package Testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ebay_edge{
	WebDriver driver;
	
	
	
	 
  //@Test(priority=1)
  public void login() throws InterruptedException {
	  WebElement login=driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a"));
	  login.click();
	  //Thread.sleep(10000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("suG!i_399AN.PLN");
	  driver.findElement(By.id("sgnBt")).click();
	  //Thread.sleep(4000); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
  @Test(priority=2)
  public void searchmultipleitems() throws InterruptedException {
	  driver.get("https://www.ebay.com/");
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  
	  String[] searches= {"watch","phone","laptop"};
	  for(String s:searches) {
		  search.sendKeys(s);
		  search.sendKeys(Keys.ENTER);
		  //Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  if(!s.equals("laptop")) {
			  search=driver.findElement(By.id("gh-ac"));
			  search.clear();  
		  }
	  } 
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	  
  }
  //@Test(priority=3)
  public void addtocart() throws InterruptedException {
	  
	  driver.findElement(By.id("gh-logo")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  WebElement ns=driver.findElement(By.id("gh-ac"));
	  ns.sendKeys("VIVOS1PRO MOBILE black color");
	  
	  driver.findElement(By.cssSelector("img[alt=\"For Vivo Y21 Y20 Y91C Y50 V17 Y19 S1 Pro V17 Y11 Wallet Leather Shockproof Case\"]")).click();
	  //Thread.sleep(6000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,400)");
	  driver.findElement(By.id("atcBtn_btn_1")).click();
	  //Thread.sleep(7000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.close();
	  driver.switchTo().window(tabs.get(0));
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  js.executeScript("window.scrollBy(0,-400)");
	  driver.findElement(By.id("gh-logo")).click();
	  //driver.findElement(By.xpath("//*[@id=\"gh-ac-wrap\"]/button")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  driver.findElement(By.cssSelector("span[class=\"gh-cart__icon\"]")).click();
	  driver.findElement(By.cssSelector("button[data-test-id=\"cart-remove-item\"]")).click();
	  driver.findElement(By.id("gh-logo")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
	  
  }
  //@Test(priority=2)
  public void changeloginname() throws InterruptedException {
	  WebElement elementToHover = driver.findElement(By.cssSelector("div[class=\"gh-nav__left-wrap\"]"));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(elementToHover).build().perform();
	  Thread.sleep(3000);
	  
	  
	  driver.get("https://accountsettings.ebay.com/uas");
	  Thread.sleep(3000);
	  driver.findElement(By.id("account-settings-link-PI")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("individual_username_edit_button")).click();
	  Thread.sleep(3000);
	  WebElement inp=driver.findElement(By.id("user_name"));
	  inp.clear();
	  inp.sendKeys("jayadeep");
	  driver.findElement(By.id("username_submit_edit_btn")).click();
	  Thread.sleep(5000);
	  WebElement name=driver.findElement(By.id("userid"));
	  name.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
	  driver.findElement(By.id("signin-continue-btn")).click();
	  Thread.sleep(3000);
	  WebElement pass=driver.findElement(By.id("pass"));
	  pass.sendKeys("suG!i_399AN.PLN");
	  driver.findElement(By.id("sgnBt")).click();
	  Thread.sleep(4000);  
	  
  }
  //@Test(priority=4)
  public void changeaddress() throws InterruptedException {
	  WebElement elementToHover = driver.findElement(By.cssSelector("div[class=\"gh-nav__left-wrap\"]"));
	  Actions actions = new Actions(driver);
	  actions.moveToElement(elementToHover).build().perform();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.get("https://accountsettings.ebay.com/uas");
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.findElement(By.id("account-settings-link-PI")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,400)");
	  
	  driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  js.executeScript("window.scrollBy(0,400)");
	  WebElement inp=driver.findElement(By.id("addressLine1"));
	  inp.clear();
	  inp.sendKeys("HIG-15,Near Nexus Mall");
			  
	  WebElement ct=driver.findElement(By.id("city"));
	  ct.clear();
	  ct.sendKeys("Hyderabad");	  
	  
	  driver.findElement(By.cssSelector("select>option[value=\"TS\"]"));
	  
	  
	  WebElement pc=driver.findElement(By.id("postalCode"));
	  pc.clear();
	  pc.sendKeys("500085");	
	
	  
	  driver.findElement(By.id("address_edit_submit_button")).click();
	  //Thread.sleep(5000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	 
	  
  }
  
  @Test(priority=5)
  public void shopbycategory() throws InterruptedException{
	  
	  driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.cssSelector("a[_sp=\"m570.l3410\"]")).click();
	  //Thread.sleep(4000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[3]/span/a")).click();
	  //Thread.sleep(6000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @Test(priority=6)
  public void shopbycategoryall() throws InterruptedException{
	  
	  driver.findElement(By.cssSelector("select>option[value=\"12576\"]")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.id("gh-search-btn")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a")).click();
	  //Thread.sleep(3000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
  }
  

  
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\New folder\\edgedriver_win64\\msedgedriver.exe");
	  driver =new EdgeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.manage().window().maximize();
	  //Thread.sleep(5000);
	  
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
