package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class BAMTest {
	
	WebDriver driver;
	
  @Test
  public void sample1() {
	  
	  
	  
	 // driver.get("https://www.saucedemo.com/");
	 WebElement username= driver.findElement(By.cssSelector("input#user-name"));
	 username.sendKeys("standard_user");
	 driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	 
	  
	  
  }

	/*
	 * @Test public void sample2() {
	 * 
	 * 
	 * driver.get("https://www.honeywell.com/in/en"); }
	 */
	
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");

  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();

  }

}
