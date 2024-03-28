package Pak2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 WebElement Search=driver.findElement(By.id("src"));
		 Search.sendKeys("Swargate, Pune",Keys.TAB);
		 Search.click();
		 
		
		WebElement Search1 = driver.findElement(By.id("dest"));
		Search1.sendKeys("Mapusa, Goa",Keys.TAB);
		Search1.click();
		
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//*[text()=19]")).click();
	    
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();



		
	}

}
