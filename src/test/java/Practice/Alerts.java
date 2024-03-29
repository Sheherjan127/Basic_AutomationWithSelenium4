package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//js alert
		driver.findElement(By.xpath("//button[@onclick ='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(2000);

		alert1.accept();
		if(driver.getPageSource().contains("you successfully clicked an alert"))
			System.out.println("=====================");

		//js confirm
		driver.findElement(By.xpath("//button[@onclick ='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		Thread.sleep(2000);
		alert2.dismiss();
		if(driver.getPageSource().contains("You CLicked: Cancel"))
			System.out.println("==================");

		//js prompt
		driver.findElement(By.xpath("//button[@onclick ='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert3.sendKeys("Automation Step By Step"); 

		Thread.sleep(2000);
		alert3.accept();
		if(driver.getPageSource().contains("You entered: Automation Step By Step"))
			System.out.println("You entered: Automation Step By Step");
		System.out.println("==================");
		System.out.println("You entered: Automation Step By Step");
		System.out.println("You entered: Automation Step By Step");
		System.out.println("You entered: AUtomation Step By Step");
		System.out.println("You entered: Automation Step By Step");
		System.out.println("You entered: Automation Step By Step");
		
		
		
		
		driver.close();
		driver.quit();
	}
}
