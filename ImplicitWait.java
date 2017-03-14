package seleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.*;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		String title = "Google";

		String atitle = "";

		// Implicit Wait

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		atitle = driver.getTitle();

		if (atitle.contentEquals(title)) {

			System.out.println("Test is passed");

		}

		else {

			System.out.println("Test is Failed");
		}

	}

}
