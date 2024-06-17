package annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tester{
	WebDriver driver;

	@Test
	public void dash() {
			WebDriverManager.chromedriver().setup();
			
			 driver =new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
			driver.findElement(By.cssSelector("button[type='submit']")).click();
			
			WebElement dash = driver.findElement(By.xpath("(//h6)[1]"));
			String expected = "Dashboard";
			String actual = dash.getText();
			Assert.assertEquals(expected, actual);
			
			driver.findElement(By.xpath("(//a)[7]")).click();

		}
	
	@Test(dataProvider="testdata")//String otherid1, String license, String marital
	
	public void excell(String user1, String last1, String empid1 ) {
		
		 WebElement user=driver.findElement(By.cssSelector("input[name='firstName']"));
		 user.clear();
		 user.sendKeys(user1);
		 
		 
		 WebElement last=driver.findElement(By.cssSelector("input[name='lastName']"));
		 last.clear();
		 last.sendKeys(last1);
		 
		 WebElement empid=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]))"));
		 empid.clear();
		 empid.sendKeys(empid1);
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

	}

