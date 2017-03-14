package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectalloptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecho.driver","C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		WebElement mySelectElm = driver.findElement(By.id("mySelectID")); 
		Select mySelect= new Select(mySelectElm);
		List<WebElement> options = mySelect.getOptions();
		for (WebElement option : options) {
		    System.out.println(option.getText()); //Prints "Option", followed by "Not Option"
		}
	}

}
