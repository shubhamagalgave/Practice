package MouseKeybordOperation;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("/html/body"));
		element.sendKeys(Keys.ESCAPE);
		
		//Scrolling using page down button
		for(int i=0; i<=10; i++)
		{
			element.sendKeys(Keys.PAGE_DOWN);//10times scroll down
			Thread.sleep(1000);
		}
		
		//scroll top of the Page
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		
		//Scroll bottom of the page
		
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	}

}
