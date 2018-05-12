package Wikipedia.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Wikipedia.reusable.webdriverInst;
import junit.framework.Assert;

public class Wiki_MainPage {
	
	@FindBy(how=How.ID,using="searchInput") WebElement search_textBox;
	
	@FindBy(how=How.ID,using="In_the_news") WebElement inthenews_text;
	
	@FindBy(how=How.ID,using="Did_you_know...") WebElement didyouknow_text;
	
	@FindBy(how=How.ID,using="On_this_day...") WebElement onthisday_text;
	
	@FindBy(how=How.CSS,using="#From_today\\27 s_featured_article") WebElement fromtodaysfeaturedarticle_text;
	
	@FindBy(how=How.ID,using="searchButton") WebElement search_Button;
	
	
	public void wiki_MainPageValidate() {
		
		WebDriverWait wt1=new WebDriverWait(webdriverInst.fd,20);
		
		wt1.until(ExpectedConditions.titleContains("Wikipedia, the free encyclopedia"));
		
		System.out.println("Navigated to Wiki Page");
		
	}
	
	
	public void validateRendered_sections() {
		
		
		boolean exists1 = inthenews_text.getSize().getHeight()!=0;
		
		boolean exists2 = didyouknow_text.getSize().getHeight()!=0;
		
		boolean exists3 = onthisday_text.getSize().getHeight()!=0;
		
		boolean exists4 = fromtodaysfeaturedarticle_text.getSize().getHeight()!=0;
		
		
       /*if(exists1) {
			
			System.out.println("in the news text is rendered");
		}else {
			System.out.println("in the news text is not rendered");
		}	
		
		
		if(exists2) {
			
			System.out.println("did you know text is rendered");
		}else {
			System.out.println("did you know text is not rendered");
		}	
		
		if(exists3) {
			System.out.println("on this day text is rendered");
		}else {
			System.out.println("on this day text is not rendered");
		}
			
		
		if(exists4) {
			System.out.println("from todays featured article text is rendered");
		}else {
			System.out.println("from todays featured article text is not rendered");
		}*/
		
		Assert.assertEquals("in the news text is not rendered",true, exists1);
		
		Assert.assertEquals("did you know text is not rendered",true,exists2);
		
        Assert.assertEquals("on this day text is not rendered",true,exists3);
		
		Assert.assertEquals("from todays featured article text is not rendered",true,exists4);
		
				
		
	}
	
	public void typeintextBox_Positive() {
		
		search_textBox.sendKeys("Capgemini");
		
		search_textBox.sendKeys(Keys.ENTER);
		
       
	}
	
	
    public void typeintextBox_Negative() {
		
		search_textBox.sendKeys("see it comes back and search works");
		
		search_textBox.sendKeys(Keys.ENTER);
		
		
		
	}
	
	

}
