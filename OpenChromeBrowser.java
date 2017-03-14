package seleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/sugandh/Downloads/chromedriver_win32/chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);

		driver.get("https://www.gmail.com");

		System.out.println("***********Browser closed successfully*****");

	}

}
