package Wikipedia.reusable;

public class reusable_Meths {

	
	
	public static void navigateMainPage() {
		webdriverInst.fd.get("https://www.wikipedia.org/");
	}
	public static void capgValidate() {
		String str=webdriverInst.fd.getTitle();
		
		if(str.equals("Capgemini - Wikipedia")) {
			System.out.println("Navigated to Capgemini Main Page");
		}else {
			System.out.println("Navigated to some other page");
		}
	}
	}
	
