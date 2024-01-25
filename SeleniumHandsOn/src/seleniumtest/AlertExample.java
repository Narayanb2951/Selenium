package seleniumtest;

import java.util.List;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Load chrome driver
		
		System.setProperty("webdriver.chrome.driver", "D:\\Moorthy\\Educational\\PT\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/alert.xhtml");

		//SimpleDialog		
		WebElement sAlertSimpleDialog = driver.findElement( By.xpath("//*[@id=\"simple_result\"]/preceding-sibling::button") );
		//Click SimpleDialog
		sAlertSimpleDialog.click();
		
		Thread.sleep(5000);
		//Switch to alert window from main window		
		Alert sAlert = driver.switchTo().alert();
		//Click Ok		
		sAlert.accept();
		
		//ConfirmDialog
		WebElement sAlertConfirmDialog = driver.findElement( By.xpath("//*[@id=\"result\"]/preceding-sibling::button") );

		sAlertConfirmDialog.click();
		Thread.sleep(5000);
		//Switch to alert window from main window
		Alert sAlertConfirm = driver.switchTo().alert();
		//Click Ok
		sAlertConfirm.accept();
		
		//Click ConfirmDialog		
		Thread.sleep(5000);
		sAlertConfirmDialog.click();
		Thread.sleep(5000);	
		//Switch to alert window from main window		
		sAlertConfirm = driver.switchTo().alert();
		//Click cancel		
		sAlertConfirm.dismiss();		
		
		
		
		//PromptDialog
		WebElement sAlertPromptDialog = driver.findElement( By.xpath("//*[@id=\"confirm_result\"]/preceding-sibling::button") );

		sAlertPromptDialog.click();
		Thread.sleep(5000);
		//Switch to alert window from main window
		Alert sAlertPrompt = driver.switchTo().alert();
		//Type Name in the prompt dialog
		sAlertPrompt.sendKeys("Narayana");
		Thread.sleep(5000);		
		//Click Ok
		sAlertPrompt.accept();		

		
		////*[contains(text(),'Sweet Alert (Simple Dialog)')]/following-sibling::button
		//Sweet Alert (SImple Dialog)
		
		WebElement sSweetAlertSimpleDialog = driver.findElement( By.xpath("//*[contains(text(),'Sweet Alert (Simple Dialog)')]/following-sibling::button") );

		sSweetAlertSimpleDialog.click();
		Thread.sleep(5000);
		//Switch to alert window from main window
		Alert sSweetAlert = driver.switchTo().alert();
		//Click Dismiss button
		//*[contains(text(),'Dismiss')]
		
/*TO BE FIXED */		
		WebElement sAlertDismissButton = ((RemoteWebDriver) sSweetAlert).findElement( By.xpath("//*[contains(text(),'Dismiss')]") );
		
		Thread.sleep(5000);
		//Click Dismiss button
		sAlertDismissButton.click();
	
		
		System.out.println("Num of elements : " );
		//driver.quit();
		
		//sYourName.sendKeys("C");
		
		
	}

}
