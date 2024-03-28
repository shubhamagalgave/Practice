package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://etrain.info/in");
		driver.manage().window().maximize();
		
		String homePageId = driver.getWindowHandle();
		
		//Get Current window unique id
		System.out.println("Home page id  " +homePageId );
		
		//click on linkdin to open the linkdin
		
		driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/trippozo']")).click();
		
		//Get all window unique id which are opened by in selenium webdriver
		
		Set<String> allWindId =driver.getWindowHandles();
		System.out.println("All Window  id  "+allWindId);
		
		//Remove home window id from all window id then WE WLL get child window id
		
		allWindId.remove(homePageId);
		
		System.out.println("From removing home window id ,All Window  id  "+allWindId);
		//get child window id using iterator
		Iterator<String> itr = allWindId.iterator();
		
		String childWindId = itr.next();
		
		//switch control to child window
		driver.switchTo().window(childWindId);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Switch to home window
		driver.switchTo().window(homePageId);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
				 	 	
	}

}
