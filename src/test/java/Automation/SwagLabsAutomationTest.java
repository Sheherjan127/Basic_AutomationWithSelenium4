package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsAutomationTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
//Login Using wrong User ID & Password
	
	driver.findElement(By.id("user-name")).sendKeys("Standard User1");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secretsauce");
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
//Login Using right User ID & Password
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
	Thread.sleep(2000);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);

//Check cross nav bar
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("react-burger-cross-btn")).click();
	Thread.sleep(2000);

	//*[@id="add-to-cart-sauce-labs-backpack"]
// Add to cart Product
	
	
	WebElement dropdown= driver.findElement(By.className("product_sort_container"));
	Select selectObject = new Select(dropdown);
	selectObject.selectByVisibleText("Price (high to low)"); 
	
	
	 
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("shopping_cart_container")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-sauce-labs-onesie")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
	Thread.sleep(2000);
	driver.findElement(By.id("continue-shopping")).click();
	Thread.sleep(2000);
	WebElement dropdown1= driver.findElement(By.className("product_sort_container"));
	Select selectObject1 = new Select(dropdown1);
	selectObject1.selectByVisibleText("Price (low to high)");
	Thread.sleep(1000);
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("about_sidebar_link")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("logout_sidebar_link")).click();
	driver.close();

	/*driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click(); 
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("shopping_cart_container")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("remove-sauce-labs-oneside")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("continue-shopping")).click();
	Thread.sleep(2000);
	
	WebElement dropdown1= driver.findElement(By.className("product_sort_container"));
	Select selectObject1 = new Select(dropdown1);
	selectObject1.selectByVisibleText("Price (low to high)");
	Thread.sleep(1000);
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("about_sidebar_link")).click();
	Thread.sleep(1000);
	*/
	
	
	//driver.findElement(By.id("logout_sidebar_link")).click();
	//driver.findElement(By.id("logout_sidebar_link")).click();
	
	//driver.close();
	

}
}
	


