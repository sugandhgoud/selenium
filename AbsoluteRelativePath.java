package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteRelativePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.walmart.com");

		// Relative xpath

		driver.findElement(By.xpath(".//*[@id='global-search-input']")).sendKeys("camera");

		// Absolute Xpath

		driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/nav[2]/div/div[1]/a[2]")).click();

		System.out.println("***********Test Carried successfully***********");
	}

}
