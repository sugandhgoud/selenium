package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.spicejet.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		
		
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		
		dropdown.selectByIndex(5);
		dropdown.selectByVisibleText("4 Adults");
		dropdown.selectByValue("9");
		
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']")).click();
	}

}
