package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
public static void main(String[] args) {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	
	//Navigate to the URL
	//driver.get("https://www.ebay.com/");
	
	//Max the window
	driver.manage().window().maximize();
	
	//Absolute Xpath
	//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T Shirts");
	//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
	
	//Relative Xpath
	
	//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts For Man");
	//driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	
	//OR Operation 
    
	//driver.findElement(By.xpath("//input[@id='gh-ac'or @name='_nkw']")).sendKeys("Shirts for men");
//And Operator

//starts with
	//driver.findElements(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).set(100, null);
//Contains Method()
	
	//driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("Shirt for kids");
	
	
//Navigate to the URL
	driver.get("https://money.rediff.com/gainers");

//Xpath Axes
//Self Node
	driver.get("https://money.rediff.com/gainers");
	String selfnode= driver.findElement(By.xpath("//a[contains(.,'SBL Infratech')]/self::a")).getText();
	System.out.println("the self node id"+selfnode);
	
//Parent Node
    String parentnode= driver.findElement(By.xpath("//a[contains(.,'SBL Infratech')]/parent::td")).getText();
    System.out.println("the parent node id"+parentnode);
    
//Child Node
  List<WebElement>childnode=driver.findElements(By.xpath("//a[contains(.,'SBL Infratech')]/ancestor::tr/child::td"));
  System.out.println("the number of child nodes are:"+childnode.size());
  
//Ancestor Node
  String ancestornode= driver.findElement(By.xpath("//a[contains(.,'SBL Infratech')]/ancestor::tr")).getText();
  System.out.println("The Ancestor Node is"+ancestornode);
  
//Following Node
  List<WebElement>followingnode= driver.findElements(By.xpath("//a[contains(.,'SBL Infratech')]/following::*"));
  System.out.println("No of the following elements from the cureent HTML tag is"+followingnode.size());
  driver.close();
//Following Sibling Node
  List<WebElement>followingsiblingnode= driver.findElements(By.xpath("//a[contains(.,'SBL Infratech')]/ancestor::tr/following-sibling::*"));
  System.out.println("No of the following elements from the cureent HTML tag is"+followingsiblingnode.size());
//Preceding Node
  List<WebElement>precedingnode= driver.findElements(By.xpath("//a[contains(.,'SBL Infratech')]/preceding::*"));
  System.out.println("No of the preceding node are"+precedingnode.size());
 
//Preceding Sibling Node
  List<WebElement>precedingsibling= driver.findElements(By.xpath("//a[contains(.,'SBL Infratech')]/ancestor::tr/preceding-sibling::*"));
  System.out.println("No of the preceding sibling node are -"+precedingsibling.size());
//Preceding Sibling Node

}
}
