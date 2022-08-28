package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
       public static WebDriver driver;
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay mude\\eclipse-workspace\\27FebJavaProject\\chromedriver.exe");
		driver	=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(25,	TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
}
