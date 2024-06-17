package annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert1 {
	
	WebDriver driver;
	
  @Test
  public void hardAssert() {
	  
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver();
	  
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
	 // WebElement logo = driver.findElement(By.xpath("(//img)"));
	  
	  String actualTitle =driver.getTitle();
	  String expectedTitle ="Registe";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  SoftAssert sft = new SoftAssert();
	  sft.assertEquals(actualTitle, expectedTitle);
	  
	  driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Kumar");
	  
	  sft.assertAll();

	  
	  
	  
	  
  }
}
