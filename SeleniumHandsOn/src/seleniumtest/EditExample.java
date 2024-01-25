package seleniumtest;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");

		WebElement sYourName = driver.findElement( By.xpath("//*[@placeholder=\"Babu Manickam\"]") );
		sYourName.sendKeys("Narayana");
		
		
		WebElement sCity = driver.findElement( By.xpath("//*[@value=\"Chennai\"]") );
		sCity.sendKeys("India");

		WebElement sClear = driver.findElement( By.xpath("//*[@value=\"Can you clear me, please?\"]") );
		sClear.clear();
		
		
		WebElement sDisabledBox = driver.findElement( By.xpath("//*[contains(text(),\"Verify if text box is disabled\")]/following-sibling::div/div/input[1]") );
		
		boolean bEnabled = sDisabledBox.isEnabled() ;
				
		System.out.println("Text field is enabled " + bEnabled);	
		
		WebElement sRetrieve = driver.findElement( By.xpath("//*[contains(text(),\"Retrieve\")]/following-sibling::div/div/input[1]") );
		
		String sText = sRetrieve.getAttribute("value");
		System.out.println("Text field is " + sText);		
		//driver.quit();
		
		
	}

}
