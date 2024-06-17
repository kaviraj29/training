package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

//before class
public class BACTest {
	WebDriver driver;
	
	
  @Test
  public void sample3() {
	  
	  driver.get("https://www.cognizant.com/us/en/about-cognizant/contact-us");
	  
  }
  
  @Test
  public void sample4() {
	  
	  driver.get("https://www.infosys.com/careers.html");
	  
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();

	  
  }

}
