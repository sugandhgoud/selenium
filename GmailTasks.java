
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTasks {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sugandh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");

		// Enter Email
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("sugandhgoud@gmail.com");
		Thread.sleep(5000);
		// Click on Next
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		Thread.sleep(5000);
		// Enter Password

		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("Chikku4$");
		Thread.sleep(5000);

		// Maximize browser
		driver.manage().window().maximize();

		// Click on sign in
		driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		Thread.sleep(5000);
		// click on Compose button
		driver.findElement(By.xpath("//*[@id=':io']/div/div")).click();
		Thread.sleep(5000);
		// Enter the recipient address
		driver.findElement(By.xpath(".//*[@id=':oh']")).sendKeys("sugandh.qa@gmail.com");

		Thread.sleep(5000);
		// Enter Subject

		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Please Find the Attachment");

		Thread.sleep(5000);
		// Enter the Message

		driver.findElement(By.xpath(".//*[@id=':p4']")).sendKeys("Hi, Please find the attached file. Thanks");

		// Click on the upload button
		driver.findElement(By.xpath(".//*[@id=':pu']")).click();

		Thread.sleep(5000);

		// Select the file in clipboard

		StringSelection ss = new StringSelection("D:\\CoverLetter.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// perform native keystrokes for control+V

		Robot robot = new Robot();

		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(6000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		
		System.out.println("Successfully Uploaded file");
		
		driver.findElement(By.xpath("//*[@id=':nr']")).click();
		
		System.out.println("Successfully sent file");

	}

}
