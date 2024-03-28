package Pak2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Selinium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//create dropdownlist 
         WebElement SkillDropDown= driver.findElement(By.id("Skills"));	
         //create object select class and pass above elementinto constructor
         
         Select selectSkill = new Select(SkillDropDown);
         
         // Check dropdown is multiple or not
         
         System.out.println(" is  dropdown is allow to select multipledropdown option  "+selectSkill.isMultiple());
         
         System.out.println(selectSkill.getFirstSelectedOption().getText());
         List <WebElement> option = selectSkill.getOptions();    
         System.out.println(option.size());
         for(int i=0;i<option.size();i++)
         {
        	 System.out.println(option.get(i).getText());
         }
         //select    option from dropdown
         selectSkill.selectByIndex(4);
         //or Selectby value
        // selectSkill.selectByValue("C");
         //or select by visiblity
         //selectSkill.selectByVisibleText("Analytics");
       //  driver.close();
         
         
	
	
	}

}
