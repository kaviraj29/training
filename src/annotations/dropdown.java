package annotations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	
  @Test
  public void checkboxes() {
	  
	  WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  
	  driver.get("https://jquery-az.com/jquery/demo.php?ex=152.0_1");
	  
	  WebElement drpclick =driver.findElement(By.cssSelector("button#btndropdown"));
		drpclick.click();
	
		driver.findElement(By.cssSelector("button[value='Clear']")).click();
		drpclick.click();

		//List<WebElement>all=driver.findElements(By.cssSelector("ul.dropdown-menu>li>label.radio-btn"));
		
		List<WebElement>all = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
//		for (WebElement el : all) {
//			
//			if(el.getText().equals("jQuery"))
//			{
//				el.click();
//				
//			}
//			else if(el.getText().equals("HTML"))
//			{
//				el.click();
//			}
//			
//			
//		}
		
		for (WebElement selall : all) {
			
			if(!selall.isSelected())
			{
				selall.click();
			}
			
		}
		
		

	  
	  
	  
  }
}
