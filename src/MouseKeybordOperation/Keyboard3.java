package MouseKeybordOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard3 {

	public static void main(String[] args) {
	//	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		
		//type first name as admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));//type admin and select all
		
		//in first name field use ctrl+c
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"c"));//copy the content
		
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
		
	

	}

}
