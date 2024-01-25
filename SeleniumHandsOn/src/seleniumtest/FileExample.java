package seleniumtest;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class FileExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/file.xhtml");

		
		//Identify download button
		WebElement sDownload = driver.findElement(By.xpath("//*[contains(text(),'Basic Download')]/following-sibling::button"));	
		sDownload.click();
		Thread.sleep(3000);
		
		File sLocalFileDownloadDirectory = new File("C:\\Users\\ARUNA S\\Downloads");
		File[] sListOfFiles = sLocalFileDownloadDirectory.listFiles();
		
		//sLocalFileDownloadDirectory.
		
		
		for (File file : sListOfFiles) {
			if(file.getName().equals("TestLeaf Logo.png"))
			{
			System.out.println("Download file name is " + file.getName());
			break;
			}
			else
			{
				System.out.println("Other Download file name is " + file.getName());			
			}
		}

	}

}
