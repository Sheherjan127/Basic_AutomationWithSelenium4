package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v108.log.model.ViolationSetting.Name;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {
public static void main(String[] args) {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	//Navigate to the URL
	//driver.get("https://money.rediff.com/qainers");
	//Max the window
	driver.manage().window().maximize();
	
	//Xpath Axis 
	//Self Node
	//driver.findElement(By.xpath("//a[contains(.,'Raj Televesion Newto')]/self::a")).click();
	
	//Parent Node
	
	//driver.get("https://money.rediff.com/qainers");
	//get CurrentURL();
	String desired_url="https://opensource-demo.orangehrmlive.com";
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	//get title()
	String act_title=driver.getTitle();
	System.out.println(act_title);
	String desired_title="OrangeHRM";
	//verify
	if(act_title.equals(desired_url))
	{
		System.out.println("pass"); 
				
	}
	else {
		System.out.println("fail");
	}
	
	//getting Page all source code
	String ps=driver.getPageSource();
	System.out.println(ps);
	
	
	
	
}
}
      