package Testng_package;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PageClass {
    WebDriver driver;
    WebDriverWait wait;
    
    By email = By.id("userid");
    By passw = By.id("pass");
    By cont = By.id("signin-continue-btn");
    By submit = By.id("sgnBt");
    By search = By.id("gh-ac");
    By eb = By.id("gh-logo");
    By cat = By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]");
    
    public PageClass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void username() {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        username.sendKeys("jayavenkatasaijayadeep.k@gmail.com");
    }
    
    public void cont() {
        wait.until(ExpectedConditions.elementToBeClickable(cont)).click();
    }
    
    public void passw() {
        WebElement pass = wait.until(ExpectedConditions.visibilityOfElementLocated(passw));
        pass.sendKeys("suG!i_399AN.PLN");
    }
    
    public void submit() {
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
    }
    
    public void search_in() {
        WebElement sc = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        String[] searches = {"watch","phone","laptop"};
        for(String s : searches) {
            sc.sendKeys(s);
            sc.sendKeys(Keys.ENTER);
            sc = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
            sc.clear();
        }
    }
    
    public void ebay() {
        WebElement s = wait.until(ExpectedConditions.elementToBeClickable(eb));
        s.click();
    }
    
    public void addtocart() throws InterruptedException {
        WebElement a = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        a.sendKeys("VIVOS1PRO MOBILE black color");
        
        wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("img[alt=\"For Vivo Y21 Y20 Y91C Y50 V17 Y19 S1 Pro V17 Y11 Wallet Leather Shockproof Case\"]"))).click();
        
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        
        WebElement addToCartBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.id("atcBtn_btn_1")));
            addToCartBtn.click();
            
                Thread.sleep(5000);
        
        
        
        driver.close();
        driver.switchTo().window(tabs.get(0));
        
        js.executeScript("window.scrollBy(0,-400)");
        driver.findElement(eb).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class=\"gh-cart__icon\"]"))).click();
        new WebDriverWait(driver, Duration.ofSeconds(20))
        .until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[data-test-id=\"cart-remove-item\"]")))
        .click();

        driver.findElement(eb).click();
    }
    
    public void changeadd() {
        WebElement elementToHover = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector("div[class=\"gh-nav__left-wrap\"]")));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).build().perform();
        
        driver.get("https://accountsettings.ebay.com/uas");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("account-settings-link-PI"))).click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("individual_personal_info_address_edit_button"))).click();
        js.executeScript("window.scrollBy(0,400)");
        
        WebElement inp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addressLine1")));
        inp.clear();
        inp.sendKeys("HIG-15,Near Nexus Mall");
        
        WebElement ct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
        ct.clear();
        ct.sendKeys("Hyderabad");
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select>option[value=\"TS\"]"))).click();
        
        WebElement pc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postalCode")));
        pc.clear();
        pc.sendKeys("500085");
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("address_edit_submit_button"))).click();
    }
    
    public void shopbyc() {
        wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]"))).click();
        
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[_sp=\"m570.l3410\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("/html/body/div[2]/div[2]/section[2]/section/div/ul/li[3]/span/a"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a"))).click();
    }
    
    public void shopbyca() {
        wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("select>option[value=\"12576\"]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-search-btn"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("/html/body/div[2]/div[2]/section[1]/div/nav/ul/li[1]/a"))).click();
    }
}