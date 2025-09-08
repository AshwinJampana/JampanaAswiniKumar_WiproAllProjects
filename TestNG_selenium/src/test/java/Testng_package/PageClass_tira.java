package Testng_package;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass_tira {
	
	
	By search = By.id("search");
	By logo=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/span/a/img");
	By men=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[6]/div/div/a");
	By shampoo=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[6]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/a");
	By prl=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div[4]/div[2]/div/div[2]/div/div/div/div[1]/a/div/div[1]/div[1]/div[3]");
	By acbtn=By.xpath("//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[3]/div/div[2]/div[2]/div/button");
	WebDriver driver;
    WebDriverWait wait;
	public PageClass_tira(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void search() {
		WebElement sc = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		  String[] searches= {"hair","shampoo","facecare","perfumes"};
		  for(String s:searches) {
			  sc.clear();
			  sc.sendKeys(s);
			  sc.sendKeys(Keys.ENTER);
			  sc=wait.until(ExpectedConditions.visibilityOfElementLocated(search));
			  sc=driver.findElement(By.id("search"));
		  } 
		  wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).click();
    }
	public void atc() {
		WebElement sc = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
		WebElement menh = wait.until(ExpectedConditions.visibilityOfElementLocated(men));
		WebElement shamp=wait.until(ExpectedConditions.visibilityOfElementLocated(shampoo));
		
		Actions actions = new Actions(driver);
        actions.moveToElement(menh).build().perform();
        shamp.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(prl)).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(acbtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).click();
        
        
	}
	
}
