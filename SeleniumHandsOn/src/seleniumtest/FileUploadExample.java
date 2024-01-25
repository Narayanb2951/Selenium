package seleniumtest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class FileUploadExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws AWTException 
	 */

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/file.xhtml");

		
		//Identify Upload button
		WebElement sUpload = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));	
		sUpload.click();
		Thread.sleep(3000);
		
		String s = new String("C:\\Users\\ARUNA S\\Downloads\\SeleniumUpload\\picture.txt");
		
		//sUpload.sendKeys(s);
		
		StringSelection sClipBoard = new StringSelection(s);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sClipBoard,null);

		//Use Robot class to interact with windows control like browse
		Robot sRobot = new Robot();
		
		sRobot.keyPress(KeyEvent.VK_CONTROL);
		sRobot.keyPress(KeyEvent.VK_V);
		sRobot.keyRelease(KeyEvent.VK_V);
		sRobot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		sRobot.keyPress(KeyEvent.VK_ENTER);	
		sRobot.keyRelease(KeyEvent.VK_ENTER);	
		
		Thread.sleep(10000);		
		
		driver.close();
		//driver.quit();

	}

}
