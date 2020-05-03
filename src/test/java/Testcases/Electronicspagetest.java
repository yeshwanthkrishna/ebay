package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import EbayBase.Testbase;
import EbayPages.Electronicspage;
import EbayPages.Fashionpage;
import EbayPages.Loginpage;
import EbayPages.Signinpage;


public class Electronicspagetest extends Testbase {
	
	Signinpage signin;
	Loginpage login;
	Electronicspage electronics;
	Fashionpage fashion;
	public Electronicspagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		signin = new Signinpage();
		login = signin.clicksignin();
		electronics = login.credentials1(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void electronicstest() {

	fashion = electronics.addingtocart1(prop.getProperty("gadget"));
	
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
