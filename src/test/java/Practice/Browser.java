package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


	driver.get("https://google.com");
	/*
	driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
    driver.findElement(By.linkText("Alert")).click();
    
	/*Refresh/Back/Forward
	 
    String originalwindow =driver.getWindowHandle();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	driver.switchTo().window(originalwindow);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.switchTo().newWindow(WindowType.TAB);
	
    
    //Window Size
    driver.manage().window().getSize();getwidth();
    driver.manage().window().getSize();getheight();

    Dimension size= driver.manage().window().getSize();getwidth();
    System.out.println(size.getWidth());
    System.out.println(size.getHeight());
    
    driver.manage().window().setSize(new Dimension(800,200));
    
    driver.manage().window().getPosition();getX();
    driver.manage().window().getPosition();getY();
    Point Position= driver.manage().window().getPosition();
    System.out.println(Position.getX());
    System.out.println(Position.getY());
    
    driver.manage().window().setPosition(new Point(800,200));
    
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.manage().window().minimize();
   Thread.sleep(2000);
   driver.manage().window().fullscreen();
    
	//File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(srcFile,new File("./image1.png"));
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("./image.png"));
	//particular Element
	
	WebElement element= driver.findElement(By.cssSelector("#logo"));
	File scrFile1 = element.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile1, new File("./image1.png"));
	
	
	*/
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement button = driver.findElement(By.name("btnI"));
	js.executeScript("arguments(0).click();",button);
	Thread.sleep(3000);
	
	
	
  driver.close();
  

}

private static void getY() {
	// TODO Auto-generated method stub
	
}

private static void getX() {
	// TODO Auto-generated method stub
	
}

private static void getheight() {
	// TODO Auto-generated method stub
	
}

private static void getwidth() {
	// TODO Auto-generated method stub
	
}
}
