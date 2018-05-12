package Wikipedia.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Wikipedia.reusable.webdriverInst;

public class Wiki_LanguagePage {
	
	@FindBy(how=How.XPATH,using="//*[@title='English — Wikipedia — The Free Encyclopedia']") 
	WebElement English;
	
	
	public void clickOnEnglish() {
		Actions act1=new Actions(webdriverInst.fd);
		act1.moveToElement(English).click().build().perform();
		
		
	}

}
