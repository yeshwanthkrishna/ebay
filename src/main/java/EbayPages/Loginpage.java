package EbayPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EbayBase.Testbase;

public class Loginpage extends Testbase {
	@FindBy(xpath="//*[@id=\"userid\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"sgnBt\"]")
	WebElement loginbutton;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
		}


	public Electronicspage credentials1(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new Electronicspage();
	}

	
	
}
