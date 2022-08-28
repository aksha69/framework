package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage login;
  @BeforeMethod
  public void setup()
  {
	  initialization();
	   login =new LoginPage();
  }
  
  @Test
  public void verifyKiteLogo() {
	  login.verifyKiteLogo();

}
  @Test
  public void verifyZerodaLogo() {
	  login.verifyZerodhaLogo();
	
  }
  @AfterMethod
  public void exit() {
	  driver.close();
  }
}
