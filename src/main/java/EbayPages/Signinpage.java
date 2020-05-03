package EbayPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import EbayBase.Testbase;

public class Signinpage extends Testbase {
	//page factory - OR:
		@FindBy(xpath="//*[@id=\"gh-ug-flex\"]/a")
		WebElement registration;
		
		@FindBy(xpath="//*[@id=\"firstname\"]")
		WebElement firstname;
		
		@FindBy(xpath="//*[@id=\"lastname\"]")
		WebElement lastname;
		
		@FindBy(xpath="//*[@id=\"email\"]")
		WebElement emailid;
		
		@FindBy(xpath="//*[@id=\"PASSWORD\"]")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"showPASSWORD\"]/ul/li/span[1]/input")
		WebElement showpassword;
		
		@FindBy(xpath="//*[@id=\"ppaFormSbtBtn\"]")
		WebElement createaccountbutton;
		

	    /*@FindBy(xpath="//*[@id='gh-ug']/a")
		WebElement signinclick;
		
		@FindBy(xpath="//*[@id='gh-logo']")
		WebElement ebaylogo;*/
		
		//Initializing the Page Objects:
		public Signinpage() {
			PageFactory.initElements(driver, this);
			}
		
		//Actions
		/*public String validateloginpagetitle() {
			return driver.getTitle();
		}
		
		public boolean validateebaylogo() {
		return ebaylogo.isDisplayed();
			}*/
		
		public void clickregister() {
			registration.click();
			
			//return new Loginpage();
			}

		public void registration(String fn, String ln, String email, String pwd) {
			
			firstname.sendKeys(fn);
			lastname.sendKeys(ln);
			emailid.sendKeys(email);
			password.sendKeys(pwd);
			showpassword.click();
			createaccountbutton.click();
			
		}

}
