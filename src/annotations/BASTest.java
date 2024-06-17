package annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;

public class BASTest {
	WebDriver driver;
	
  @Test
  public void sample7() {
	  driver.get("https://flex.com/");
  }
  
  @Test
  public void sample8() {
	  driver.get("https://www.nttdata.com/global/en/");
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();

  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();

  }

}
