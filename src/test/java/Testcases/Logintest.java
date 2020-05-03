package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import EbayBase.Testbase;
import EbayPages.Electronicspage;
import EbayPages.Loginpage;
import EbayPages.Signinpage;

public class Logintest extends Testbase {
	Signinpage signin;
	Loginpage login;
	Electronicspage electronics;
	public Logintest() {
		super();
	}
	
	@BeforeMethod
	public  void setup() {
		initialization();
		signin = new Signinpage();
		login = signin.clicksignin();
	}

	@Test
	public void logintest() {
		electronics = login.credentials1(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
