package DragDrop;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement activeObject = driver.switchTo().activeElement();
		String activeplaceholder = activeObject.getAttribute("placeholder");
		String expectedPlacehoder = "Username";
		if(activeplaceholder.equals(expectedPlacehoder))
		{
			System.out.println("Curser pointer validation is successful");
		}
		else
		{
			System.out.println("Curser pointer validation is failed");
		}
		//without inspecting active element login with actitime
		activeObject.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		
		
	}

}
