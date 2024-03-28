package Pak2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String currentdate = "Jun2022";
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]//tbody[1]/tr[3]//td[contains(text(),'12')]")).click();
		
		
                
		}

}
