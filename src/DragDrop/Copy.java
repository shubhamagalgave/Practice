package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]"));
		WebElement target=driver.findElement(By.cssSelector("#trash"));
		act.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(1000);
		
		WebElement source1 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]"));
		WebElement target1 =driver.findElement(By.cssSelector("#trash"));		
		act.dragAndDrop(source1, target1).build().perform();
		
		Thread.sleep(1000);
		
		WebElement source2 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]"));
		WebElement target2 =driver.findElement(By.cssSelector("#trash"));
		act.dragAndDrop(source2, target2).build().perform();
		Thread.sleep(1000);
		
		WebElement source3 = driver.findElement(By.xpath("//body/div[1]/ul[1]/li[1]"));
		WebElement target3 =driver.findElement(By.cssSelector("#trash"));
		act.dragAndDrop(source3, target3).build().perform();
	}
	

}
