package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Commands {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();

	//Nevigate the URL
	driver.get("https://demoqa.com/browser-windows");
	
	//max the window
	driver.manage().window().maximize();
	
	//verify of the current url page
	String urlofpage= driver.getCurrentUrl();
	System.out.println("The url of the page is"+urlofpage);
	
	//verify the url
	if(urlofpage.equals("https://demoqa.com/browser-windows"))
	{
		System.out.println("The URL is verified");
	}
	else {
		System.out.println("The URL is not verified");  
		
	}
    //Title of the page
	String title= driver.getTitle();
	System.out.println("The page title is"+title);
	//verify the title
	if(title.equals("DEMOQA"))
	{
      System.out.println("The tile is verified");
	}
	else {
		System.out.println("The title is not verified"); 
		
	}
	//length of the page
	int titlelength= driver.getTitle().length();
	System.out.println("The page title length is"+ titlelength);
	
	//pagesource
	String ps= driver.getPageSource();
	System.out.println("The page source is "+ps);
	//Length of page source
	int pslength= driver.getPageSource().length();
	System.out.println("The page source length is "+pslength);
	//click()
	driver.findElement(By.xpath("//button[@id='tabButton']")).click();
	//Close()
	/*driver.close();
	Thread.sleep(5000);
	driver.close();
	*/
	//quit()
	driver.close();
	Thread.sleep(5000);
	driver.quit();
	//forward 
	//driver.navigate().forward();
	//get location
	/*WebElement element=driver.findElement(By.id("txtUsername"));
	Point point= element.getLocation();
	System.out.println("X coordinate "+point.x);
	System.out.println("Y coordinate "+point.y);
	*/
	//print parent window handle
	String parentwindowhandle= driver.getWindowHandle();
	System.out.println("The parent window handle is "+parentwindowhandle);
	//click 3 times
	for(int i=1;i<=3;i++)
	{
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(3000);
	}
	for(int i=1; i<=3; i++) 
	{
		driver.findElement(By.xpath("//botoon[@id='tabButton']")).click();
		Thread.sleep(3000);
	}
	for(int i=1; i<=3; i++)
	{
		driver.findElement(By.xpath(parentwindowhandle));
		driver.findElement(By.xpath(parentwindowhandle));
		driver.findElement(By.xpath(parentwindowhandle));
		driver.findElement(By.xpath(parentwindowhandle));
		driver.findElement(By.xpath("//botoon[@id='tabButton']")).click();
		
	}
}
}
