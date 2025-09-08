package Jenkins_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://zero.webappsecurity.com/index.html");
	  Thread.sleep(2000);
	  
  }
}
