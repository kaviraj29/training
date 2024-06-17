package date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class date1 {
	
	@Test
	public void datepicker() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=10.0_3");
		
		WebElement dat =driver.findElement(By.cssSelector("input#dateofbirth"));
		dat.click();
		
		datepicker1 pickdate = new datepicker1();
		pickdate.datpicker(driver, "8", 5, 1997);
		
		
		
		
	}

}
