package seleniumTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ChangeLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		//setting the locale french : ‘fr’
		
		profile.setPreference("intl.accept_languages","eng");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.get("http://google.com");
	}

}
