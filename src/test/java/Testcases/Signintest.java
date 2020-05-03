package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import EbayBase.Testbase;
import EbayPages.Loginpage;
import EbayPages.Signinpage;
import Ebayutil.EbayDatautil;

import org.apache.log4j.Logger;


public class Signintest extends Testbase {
	Signinpage signin;
	Loginpage loginpage;
	String sheetName = "registration";
	
	public Signintest() {
		super();
	}
	
	Logger log = Logger.getLogger(Signintest.class);
	@BeforeMethod
	public void setup() {
		initialization();
	signin = new Signinpage();
	log.info("launching chrome");
	log.info("appn url");
	log.warn("it's a warning message");
	log.fatal("this is fatal error");
	log.error("it's a bug");
		}
	
	/*@Test(priority=1)
	public void loginpagetitletest() {
		String title = signin.validateloginpagetitle();
		System.out.println(title);
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}
	@Test(priority=2)
	public void ebaylogotest() {
		boolean flag = signin.validateebaylogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void signintest() {
		 loginpage = signin.clicksignin();
		
	}*/
	
	@DataProvider
	public Object[][] getebaytestdata() {
		Object data[][]  = EbayDatautil.getTestData(sheetName);
		return data;
	}
	
	@Test(dataProvider  = "getebaytestdata")
	public void register(String firstname, String lastname, String emailid, String password) {
		signin.clickregister();
		//signin.registration("kyk", "yk", "yash","kkk");
		signin.registration(firstname, lastname, emailid, password);
	}
	

	
	@AfterMethod
	 public void teardown() {
		driver.close();
	}

	
}
