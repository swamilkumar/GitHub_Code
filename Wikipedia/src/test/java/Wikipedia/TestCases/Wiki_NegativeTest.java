package Wikipedia.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Wikipedia.Pages.Wiki_LanguagePage;
import Wikipedia.Pages.Wiki_MainPage;
import Wikipedia.reusable.reusable_Meths;
import Wikipedia.reusable.webdriverInst;

public class Wiki_NegativeTest {
	
	@Test
	public void wiki_NegTestMeth() {
		
		
		reusable_Meths.navigateMainPage();
		Wiki_LanguagePage wikiLangObj=PageFactory.initElements(webdriverInst.fd,Wiki_LanguagePage.class);
		wikiLangObj.clickOnEnglish();
		Wiki_MainPage wikiMainObj=PageFactory.initElements(webdriverInst.fd,Wiki_MainPage.class);
		wikiMainObj.wiki_MainPageValidate();
		wikiMainObj.typeintextBox_Negative();
		reusable_Meths.capgValidate();
		
	}

}
