package seleniumtest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");

		driver.switchTo().frame(0); 
		
		//1st test case  //Click Me (Inside frame)
		//Locate ClickMe Button		
		WebElement sOpen = driver.findElement( By.xpath("//*[@id='Click']") );
		//Click ClickMe Button
		sOpen.click();
		
		System.out.println("Text after clickMe is " + sOpen.getText());
		//Click Again to reset
		sOpen.click();
		//Print the inner text after reset
		System.out.println("Text after clickMe is " + sOpen.getText());
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);	
		
		//3rd test case  //Click Me (Inside Nested frame)
		//Locate "Click Me (Inside Nested frame)" Button	
		driver.switchTo().frame(2); 
		driver.switchTo().frame("frame2");
		sOpen = driver.findElement( By.xpath("//*[@id='Click']") );
		//Click ClickMe Button
		sOpen.click();
		
		System.out.println("Text after clickMe is " + sOpen.getText());
		//Click Again to reset
		sOpen.click();
		//Print the inner text after reset
		System.out.println("Text after clickMe is " + sOpen.getText());
		
		
		driver.switchTo().defaultContent();	
		Thread.sleep(5000);	
		
		//2nd test case  //Count number of frames		
		List<WebElement> sListFrame = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total number of frames is " + 	sListFrame.size() );
	
		
		driver.quit();
		
	
		
		
	}

}
