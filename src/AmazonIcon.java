import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIcon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workspace\\Selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/gp/product/B07WGNYCPN/ref=s9_acss_bw_cg_Budget_5b1_w?pf_rd_m=A1K21FY43GMZF8&pf_rd_s=merchandised-search-15&pf_rd_r=2WN6DNCKF71YCV4TP7BQ&pf_rd_t=101&pf_rd_p=a1245227-aca1-4c01-a524-8986fa59988c&pf_rd_i=1389401031&th=1");
		driver.manage().window().maximize();
		
		WebElement Name = driver.findElement(By.cssSelector(".sponsored-products-truncator-truncated"));
		System.out.println(Name.getText());
		
		WebElement Price = driver.findElement(By.xpath("(//span[contains(text(),'₹26,499.00')])[1]"));
		System.out.println(Price.getText());
		
		
		
	}

}
