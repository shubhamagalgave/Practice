package Pak2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultileDropDown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement carDropDown = driver.findElement(By.id("multiselect1"));
		
		Select SelectSkill = new Select(carDropDown);
		System.out.println("is  dropdown is allow to select multipledropdown option  "+SelectSkill.isMultiple());
		
		List <WebElement> option = SelectSkill.getOptions();
		System.out.println(option.size());
        for(int i=0;i<option.size();i++)
        {
       	 System.out.println(option.get(i).getText());
        }
        SelectSkill.selectByIndex(0);
        SelectSkill.selectByIndex(1);
        SelectSkill.selectByIndex(2);
        SelectSkill.selectByIndex(3);
        //SelectSkill.selectByIndex(4);
        
        List <WebElement> SelectCar = SelectSkill.getAllSelectedOptions();
        System.out.println("Selected Cars count"+SelectCar.size());
      
        
        
      SelectSkill.deselectByIndex(1);
       SelectSkill.deselectAll();
       driver.close();
        
        
       

	}

}
