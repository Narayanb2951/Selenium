package seleniumtest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");

		String sParentWindow = driver.getWindowHandle();
		
		
		//1st test case
		//Locate Open Button		
		WebElement sOpen = driver.findElement( By.xpath("//*[contains(text(),\"Click and Confirm new Window Opens\")]/following-sibling::button") );
		//Click Open Button
		sOpen.click();
		
		//store all window handles in a String SET
		Set<String> sAllWindows = driver.getWindowHandles();
		
		//Switch to new window		
		for (String string : sAllWindows) {
			driver.switchTo().window(string);
		} 
		
		//Read title and URL of child window
		System.out.println("Title in child window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl());
		Thread.sleep(3000);		
		
		//Close the child window
		driver.close();
		
		//Switch to Parent window
		driver.switchTo().window(sParentWindow);  
		//Switch to default window - Parent
		//driver.switchTo().defaultContent();
		
		//Read title and URL of parent window
		System.out.println("Title in parent window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl());

		
		//2nd test case
		Thread.sleep(5000);	
		
		WebElement sOpenMultiple = driver.findElement( By.xpath("//*[contains(text(),\"Find the number of opened tabs\")]/following-sibling::button") );
		//Click OpenMultiple Button
		sOpenMultiple.click();	
		//get all child windows
		sAllWindows = driver.getWindowHandles();
		System.out.println("Find the number of opened tabs # of child window is " + sAllWindows.size() );
				
			
		//Switch to new window		
		for (String string : sAllWindows) {
			//Read window title and URL for child windows and close the window
			if(!string.equals(sParentWindow))
			{
				driver.switchTo().window(string);
				System.out.println("Title in child window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl() + " and it will be closed" );				
				driver.close();
			}
			

		} 
		//Switch to parent window
		driver.switchTo().window(sParentWindow);	
		//Read title and URL of parent window
		System.out.println("Title in parent window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl());
	

		
		//3rd test case
		Thread.sleep(5000);			
		sOpenMultiple = driver.findElement( By.xpath("//*[contains(text(),\"Close all windows except Primary\")]/following-sibling::button") );
		//Click OpenMultiple Button
		sOpenMultiple.click();	
		//get all child windows
		sAllWindows = driver.getWindowHandles();
		System.out.println("Close all windows except Primary	: # of child window is " + sAllWindows.size() );
				
			
		//Switch to new window		
		for (String string : sAllWindows) {
			//Read window title and URL for child windows and close the window
			if(!string.equals(sParentWindow))
			{
				driver.switchTo().window(string);
				System.out.println("Title in child window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl() + " and it will be closed" );				
				driver.close();
			}
		} 		
		//Switch to parent window
		driver.switchTo().window(sParentWindow);
		
			
		//Read title and URL of parent window
		System.out.println("Title in parent window is " + driver.getTitle() + " URL is " + driver.getCurrentUrl());
		Thread.sleep(3000);		
		
		//Close the child window
		driver.quit();		
		
		
		
		
	
		
		
	}

}
