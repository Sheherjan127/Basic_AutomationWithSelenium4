package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//sendkeys()
		/*
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium"+ Keys.ENTER);
		*/
		
		//KeysDown() 
		/*driver.get("https://google.com"); 
		driver.findElement(By.name("q")).sendKeys("selenium"+ Keys.ENTER);
		Actions actionProvider = new Actions(driver);
		Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		Thread.sleep(2000);
		driver.quit();
		*/
		
		//keyUp()
		driver.get("https://google.com");
		Actions actions = new Actions(driver);
		WebElement searchbox = driver.findElement(By.name("q"));
		actions.keyDown(Keys.SHIFT).sendKeys(searchbox, "Selenium")
		.keyUp(Keys.SHIFT).sendKeys("Selenium").perform();
		Thread.sleep(2000);
		searchbox.clear();
		Thread.sleep(2000);
		driver.quit();
		
		
		//ClearUp()
		
	}

}
