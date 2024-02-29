package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		Actions actions = new Actions(driver);
		//actions.moveToElement(boxA);
		//actions.clickAndHold();
		//actions.moveToElement(boxD);
		//actions.release().perform();
		//actions.contextClick(boxD);
		actions.doubleClick(boxD);
		actions.build().perform();
		*/
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drag2= driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drag2);
		actions.build().perform();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");
		System.out.println("I'm going to Ireland, Dublin");
		System.out.println("Wanna go to ");
			
		
	}

}

