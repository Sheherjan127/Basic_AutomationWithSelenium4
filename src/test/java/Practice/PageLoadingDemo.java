package Practice;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadingDemo {
public static void main(String[] args) {
	
	//ChromeOptions options = new ChromeOptions();
	//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	
	ChromeOptions options1 = new ChromeOptions();
	options1.setPageLoadStrategy(PageLoadStrategy.EAGER);
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://google.com");
	driver.get("https://google.com");
	driver.get("https://google.com");
	driver.get("https://google.com");
    driver.quit();
}
}
