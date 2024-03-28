package Pak2;
import java.util.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 WebElement SkillDropdown =driver.findElement(By.id("Skills"));
		 
		 Select SelectSkill = new Select(SkillDropdown);
		 
		 System.out.println(SelectSkill.getFirstSelectedOption().getText());
		 List <WebElement> option = SelectSkill.getOptions();
		 System.out.println(option.size());
		 
		 for(int i=0;i<option.size();i++)
		 {
			 System.out.println(option.get(i).getText());
		 }
		 
		SelectSkill.selectByIndex(4);
	}

}
