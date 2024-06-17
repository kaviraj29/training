package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityTest {
	
	WebDriver driver;

	
	@Test(priority=2)
	  public void sample9() {
		  
		  driver.get("https://flex.com/");
		  
	  }
	  @Test(priority=3)
	  public void sample10() {
		  
		  driver.get("https://www.saucedemo.com/");
		  
	  }
	  
	  @Test(priority=1)
	  public void sample11() {

		  
		  driver.get("https://www.india.ford.com/about-ford/careers/");
		  
	  }
	  
	  @BeforeClass
	  public void sample1() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver=new FirefoxDriver();
		  
		  
		  
	  }
	  
	  
	  
	  @AfterClass
	  public void sample2() {
		  driver.close();
	  }
}
	  
	  