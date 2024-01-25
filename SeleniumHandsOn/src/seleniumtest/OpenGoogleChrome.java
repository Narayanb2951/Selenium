package seleniumtest;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;

public class OpenGoogleChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		//wait();
		driver.findElement(By.name("q")).sendKeys("LearnAutomationOnline" + Keys.ENTER );
		/*driver.quit();*/
		//
		
		
	}

}
