package seleniumtest;

import java.util.List;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/select.xhtml");

		WebElement sYourName = driver.findElement( By.xpath("//*[@class=\"ui-selectonemenu\"]") );

		Select sDropdown = new Select(sYourName);
		
		sDropdown.selectByVisibleText("Playwright");
		Thread.sleep(5000);
		sDropdown.selectByIndex(1) ;
		Thread.sleep(5000);
		sDropdown.selectByIndex(3) ;
		Thread.sleep(5000);
		
		List<WebElement> sListOfOptions = sDropdown.getOptions();
		
		int sNumOfElements = sListOfOptions.size();
		System.out.println("Num of elements : " + sNumOfElements);
		//driver.quit();
		
		sYourName.sendKeys("C");
		
		
	}

}
