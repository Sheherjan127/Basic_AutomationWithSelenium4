package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOM {
public static void main(String[] args) {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	 
	

	
	//Navigate to the demoqa website
    driver.get("https://books-pwakit.appspot.com/");
     //Max the window
	driver.manage().window().maximize();
    //This is thE shadow host. Root element
    WebElement shadowHost = driver.findElement(By.tagName("book-app"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
   // WebElement shadowDomOne = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
    SearchContext shadowDomOne = (SearchContext) js.executeScript("return arguments[0].shadowRoot", shadowHost);
   // WebElement appHeader=shadowDomOne.findElement(By.tagName("app-header")); because of https://github.com/SeleniumHQ/selenium/issues/10025

    WebElement appHeader=shadowDomOne.findElement(By.cssSelector("app-header"));// So had to use css , here passes tag name.
    WebElement app_toolbar=appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
    WebElement book_input_decorator=app_toolbar.findElement(By.tagName("book-input-decorator"));
    WebElement search=book_input_decorator.findElement(By.cssSelector("input#input"));
    search.sendKeys("Please search something");
    
}
}
