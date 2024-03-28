package MouseKeybordOperation;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement body = driver.findElement(By.xpath("/html/body"));
		body.sendKeys(Keys.ESCAPE);
		
		body.sendKeys(Keys.F5);
		driver.close();
	}
}
/**
 * possible ways to refresh the browser:
 * 1. driver.navigate().refresh();
 * 2. sendKeys(Keys.F5)
 * 3. by hitting same URL again
 * 4. ctrl+R
 */

