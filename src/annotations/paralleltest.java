package annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltest {
WebDriver driver;

	
	@Test
	  public void sample9() {
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
		  driver.get("https://flex.com/");
		  
	  }
	  @Test
	  public void sample10() {
		  
		  
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
		  
		  driver.get("https://www.saucedemo.com/");
		  
	  }
}
