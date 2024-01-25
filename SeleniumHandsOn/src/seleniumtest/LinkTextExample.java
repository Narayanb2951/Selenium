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

public class LinkTextExample {

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
		
		//NVAIGATE method instead of get method
		//Get method - does not support refresh, forward, back action
		//NVAIGATE - support refresh, forward, back action
		driver.navigate().to("https://leafground.com/link.xhtml");

		
		//Take me to dashboard
		WebElement sLink1 = driver.findElement(By.linkText("Go to Dashboard"));	
		sLink1.click();
		System.out.println("Title after clicking Take me to dashboard  is " + driver.getTitle() );
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("Title after clicking BACK button  is " + driver.getTitle() );		
		Thread.sleep(3000);
		
		
		
		//Find my destination
		WebElement sLink2 = driver.findElement(By.partialLinkText("Find the URL without clicking me."));	
		String sLinkWithOutClick = sLink2.getAttribute("href");
		System.out.println("Find my destination without clicking me is  " + sLinkWithOutClick );		
		Thread.sleep(3000);

		//Am I broken link?
		WebElement sLink3 = driver.findElement(By.linkText("Broken?"));	
		sLink3.click();
		String sTitleBrokenLink = driver.getTitle() ;
		if ( sTitleBrokenLink.contains("404"))
		{
			System.out.println("Title after 'Am I broken link'  is " + sTitleBrokenLink );	
		}
		else
		{
			System.out.println("Title after 'Am I broken link'  is " + sTitleBrokenLink + " NOT A Broken link");	
		}
		//System.out.println("Title after 'Am I broken link'  is " + driver.getTitle() );
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
		//System.out.println("Title after clicking BACK button  is " + driver.getTitle() );		
		Thread.sleep(3000);		
		
				
		//Duplicate Link	
		WebElement sLink4 = driver.findElement(By.xpath("//*[contains(text(),'Duplicate Link')]/following-sibling::div/div/a"));	
		sLink4.click();
		String sTitleduplicateLink = driver.getTitle() ;
		if ( sTitleduplicateLink.equals("Dashboard"))
		{
			System.out.println("Title after clicking Duplicate Link is " + sTitleduplicateLink );	
		}
		else
		{
			System.out.println("Title after clicking Duplicate Link is " + sTitleduplicateLink + " NOT DUPLICATE");		
		}
		//System.out.println("Title after 'Am I broken link'  is " + driver.getTitle() );
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		//LinkCount
		
		
		
		//Thread.sleep(10000);		
		
		driver.close();
		//driver.quit();

	}

}
