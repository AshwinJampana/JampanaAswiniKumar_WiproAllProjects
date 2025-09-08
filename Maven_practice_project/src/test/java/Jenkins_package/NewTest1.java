package Jenkins_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(2000);
	  
  }
}
