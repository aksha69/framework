package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
public class LoginPage extends TestBase	{
	
	@FindBy(xpath="//img[@alt='Kite']")	private	WebElement	kiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")	private	WebElement	zerodhaLogo;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	public void verifyKiteLogo() {
		
		kiteLogo.isDisplayed();
	}
	public void verifyZerodhaLogo() {
		
         zerodhaLogo.isDisplayed();
	}
}










