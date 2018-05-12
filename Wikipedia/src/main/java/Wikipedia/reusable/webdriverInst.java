package Wikipedia.reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverInst {
	
	public static WebDriver fd;
	public webdriverInst(String sitename) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
		fd=new ChromeDriver();
		fd.manage().window().maximize();
		fd.get(sitename);
	}
	

}
