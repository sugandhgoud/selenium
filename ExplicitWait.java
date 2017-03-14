package seleniumTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.get("https://www.google.com");

		String title = "Google";

		String atitle = "";

		atitle = driver.getTitle();
 
		if (atitle.contentEquals(title)) {

			System.out.println("Test is passed");

		}

		else {

			System.out.println("Test is Failed");
		}
		WebElement Gmail;
		
		Gmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")));
		Gmail.click();

		
	}

}
