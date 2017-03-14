package seleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		// Open browser
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("sugandhgoud@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Chikku4$");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		System.out.println("***********Successfully Login Into Gmail************");

	}

}
