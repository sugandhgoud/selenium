package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class playSelenium {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.gecho.driver","C://geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("www.facebook.com");
		
	}

}
