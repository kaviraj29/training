package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class BATTest {
	WebDriver driver;
	
  @Test
  public void sample5() {
	  
	  driver.get("https://www.india.ford.com/about-ford/careers/");
  }
  
  @Test
  public void sample6() {
	  
	  driver.get("https://www.techmahindra.com/en-in/?f=2481256003");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();

	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();

  }

}
