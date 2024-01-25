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

public class TableExample {

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
		driver.navigate().to("https://leafground.com/table.xhtml");

		//Fetch Date of Join, Representative, Country, Status
		//*[contains(text(),"Maria Adams")]	
		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Country")]
		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Country")]/following-sibling::span/text()
		
		WebElement sName = driver.findElement(By.xpath("//*[contains(text(),\"Izzy Smith\")]"));	
		sName.click();

		String sCountry, sRepresentative, sJoinDate, sStatus;
		
		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Country")]/following-sibling::span/text()

		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Representative")]/following-sibling::span/text()

		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Join Date")]/text()
		//td[contains(text(),"Maria Adams")]/following-sibling::td/span[contains(text(),"Status")]/following-sibling::span/text()
		
		
		
		WebElement        sCountryElement = driver.findElement(By.xpath("//td[contains(text(),\"Izzy Smith\")]/following-sibling::td/span[contains(text(),\"Country\")]/following-sibling::span"));		
		WebElement sRepresentativeElement = driver.findElement(By.xpath("//td[contains(text(),\"Izzy Smith\")]/following-sibling::td/span[contains(text(),\"Representative\")]/following-sibling::span"));		
		WebElement       sJoinDateElement = driver.findElement(By.xpath("//td[contains(text(),\"Izzy Smith\")]/following-sibling::td/span[contains(text(),\"Join Date\")]"));		
		WebElement         sStatusElement = driver.findElement(By.xpath("//td[contains(text(),\"Izzy Smith\")]/following-sibling::td/span[contains(text(),\"Status\")]/following-sibling::span"));		
		
		sCountry = sCountryElement.getText();
		sRepresentative = sRepresentativeElement.getText();
		sJoinDate = sJoinDateElement.getText();
		sStatus = sStatusElement.getText();
		
		System.out.println("Maria Adams ");
		System.out.println("Country " + sCountry);
		System.out.println("Representative " + sRepresentative);
		System.out.println("JoinDate " + sJoinDate);
		System.out.println("Status " + sStatus);
		
		driver.close();
		//driver.quit();

	}

}
