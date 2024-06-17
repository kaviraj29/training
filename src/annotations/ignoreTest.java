package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ignoreTest {
	
	WebDriver driver;
	
  @Test(enabled=true)
  public void sample9() {
	  
	  driver.get("https://flex.com/");
	  
  }
  @Test(enabled=true)
  public void sample10() {
	  
	  driver.get("https://www.saucedemo.com/");
	  
  }
  
  @Test(enabled=false)
  public void sample11() {

	  
	  driver.get("https://www.india.ford.com/about-ford/careers/");
	  
  }
  
  @BeforeMethod
  public void sample1() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }
  
  @AfterMethod
  public void sample2() {
	  driver.close();
  }
  
  
  
}
