package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grpTest {
	
	WebDriver driver;
	
	@Test(groups= {"companies"})
	  public void sample9() {
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		  driver.get("https://flex.com/");
		  
	  }
	
	  @Test(groups= {"demosite"})
	  public void sample10() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		  driver.get("https://www.saucedemo.com/");
		  
	  }
	  
	  @Test(groups= {"demosite"})
	  public void sample15() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		  driver.get("https://omayo.blogspot.com/");
		  
	  }
	  
	  
	  @Test(groups= {"companies"})
	  public void sample11() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();

		  
		  driver.get("https://www.india.ford.com/about-ford/careers/");
		  
	  }
	  
	 
	  
	  
	  
	  
}
