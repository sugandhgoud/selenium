package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.com/");

		Thread.sleep(5000);

		// By id
		driver.findElement(By.id("nav-your-amazon")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("sugandhgoud@gmail.com");
		Thread.sleep(5000);
		// By name
		driver.findElement(By.name("password")).sendKeys("Sugandh4$");
		Thread.sleep(5000);
		// By class name
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(5000);
		// By Partial link text
		driver.findElement(By.partialLinkText("Conditions of Use")).click();
		Thread.sleep(5000);

		// By Xpath
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]")).click();

		System.out.println("**********Successfully Loaded****************");
	}

}
