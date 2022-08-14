package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;

public class LoginTest extends BaseTest {
	

	LoginPage lp;
	
	SoftAssert sa;
	

	@BeforeClass
	public void initObject() {
		
		lp= new LoginPage(driver);
		 sa=new SoftAssert();
		
	}
	
	@Test (priority=1)
	public void verifybuttontext() {
		
		sa.assertEquals(lp.buttonText(), "LOGIN");
		sa.assertFalse(true);
		sa.assertAll();
	}
	
	@Test (priority=2)
	public void login() {
		
		lp.enterCred("Admin", "admin123");
		lp.submit();
		
	}
	
	@Test (priority=3)
	public void Logoutfun() throws InterruptedException {
		
		lp.logout();
		Thread.sleep(3000);
		lp.logoutbtn();
	}
	
	

}
