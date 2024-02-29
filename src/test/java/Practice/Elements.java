package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


		driver.get("https://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//WebElement searchBox= driver.findElement(By.name("q"));
		//searchBox.sendKeys("ABCD",Keys.ENTER);
		//driver.navigate().to("https://trytestingthis.netlify.app/");
		//List<WebElement>option= driver.findElements(By.name("Optionwithcheck[]"));
		//for (WebElement element: option) {
			//System.out.println(element.getText());
		//}
	//	driver.findElement(By.cssSelector("#fname")).sendKeys("Automate");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		
		driver.findElement(RelativeLocator.with (By.tagName("input")).above(loginButton)).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
