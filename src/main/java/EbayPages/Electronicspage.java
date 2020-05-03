package EbayPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EbayBase.Testbase;

public class Electronicspage extends Testbase{
	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a")
	WebElement eleclinkbutton;

	
	@FindBy(xpath="//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/ul/li[3]/a")
	WebElement laptops;
	
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement searchformacbook;
	
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")
	WebElement seeit;
	
	@FindBy(xpath="//*[@id=\"atcRedesignId_btn\"]")
	WebElement addtocart;
	
	public Electronicspage() {
		PageFactory.initElements(driver, this);
		}
	
	

	public Fashionpage addingtocart1(String gadget) {
		
		Actions action = new Actions(driver);
		action.moveToElement(eleclinkbutton).build().perform();
		laptops.click();
		
		searchformacbook.sendKeys(gadget);
		searchbutton.click();
		seeit.click();
		addtocart.click();
		
		return new Fashionpage();
	}
}
