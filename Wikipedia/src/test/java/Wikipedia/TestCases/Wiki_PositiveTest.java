package Wikipedia.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Wikipedia.Pages.Wiki_LanguagePage;
import Wikipedia.Pages.Wiki_MainPage;
import Wikipedia.reusable.reusable_Meths;
import Wikipedia.reusable.webdriverInst;

public class Wiki_PositiveTest {

	@Test
	public void assignment_Meth() {
		
		webdriverInst webInst=new webdriverInst("https://www.wikipedia.org/");
		Wiki_LanguagePage wikiLangObj=PageFactory.initElements(webdriverInst.fd,Wiki_LanguagePage.class);
		wikiLangObj.clickOnEnglish();
		Wiki_MainPage wikiMainObj=PageFactory.initElements(webdriverInst.fd,Wiki_MainPage.class);
		wikiMainObj.wiki_MainPageValidate();
		wikiMainObj.typeintextBox_Positive();
		
		reusable_Meths.capgValidate();
		
		//Capg_MainPage capgMainObj=PageFactory.initElements(webdriverInst.fd,Capg_MainPage.class);
		//capgMainObj.capg_MainPageValidate();
	}
}
