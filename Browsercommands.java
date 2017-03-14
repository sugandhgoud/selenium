package seleniumpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsercommands {

	public static void main(String[] args) {

		// create an object

System.setProperty("webdriver.gecho.driver","C://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		String url  = "http://www.toolsqa.com/";
		
		driver.get(url);

		driver.manage().window().maximize();

		String title= driver.getTitle();
		
		int titleLength = driver.getTitle().length();
		
		
		System.out.println("The title of the current page is " + title);
		System.out.println("The length of the title is " + titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(url)){
			
			System.out.println("Verification successfull: The webpage is opened ");
		}
			else{
				System.out.println("Verification is unsuccessfull: ");
				System.out.println("The actual url is " + actualUrl);
				System.out.println("The current url is " + url);
			}
			
			
		}
	}

