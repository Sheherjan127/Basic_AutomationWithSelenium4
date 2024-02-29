package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//find element
		driver.get("https://google.com");
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep (2000);
	
		driver.quit();
	}
}
