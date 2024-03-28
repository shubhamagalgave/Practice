package DragDrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);
		List <WebElement> sourceelement=driver.findElements(By.xpath("//*[@id=\"gallery\"]"));
		WebElement target =driver.findElement(By.cssSelector("#trash"));
		
		act.dragAndDrop(sourceelement.get(0), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceelement.get(1), target).build().perform();
     	Thread.sleep(1000);
		act.dragAndDrop(sourceelement.get(2), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceelement.get(3), target).build().perform();
	}

}
