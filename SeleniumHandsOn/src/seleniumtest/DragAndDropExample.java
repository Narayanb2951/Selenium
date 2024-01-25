package seleniumtest;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.* ;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.Select;

public class DragAndDropExample {

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
		
		driver.get("https://leafground.com/drag.xhtml");

		WebElement sDraggable = driver.findElement(By.xpath("//*[@id=\"form:conpnl_content\"]/span"));	
		
		Actions sActionDrag = new Actions(driver);
		
		//Using clickAndHold
		Thread.sleep(5000);
		sActionDrag.clickAndHold(sDraggable).moveByOffset(100, 0).release().build().perform();
		
		
		Thread.sleep(5000);		
		sActionDrag.clickAndHold(sDraggable).moveByOffset(150, 0).release().build().perform();

		//VALIDATION NOT COMPLETED as there is no change in element position : 22-Jan-2024
		//Using dragAndDrop	
		Thread.sleep(5000);
		/*
		 sActionDrag.dragAndDrop(sDraggable, sDraggable).moveByOffset(50, 0).release().build().perform();
		
		Thread.sleep(5000);
		sActionDrag.dragAndDrop(sDraggable, sDraggable).moveByOffset(-250, 0).release().build().perform();
		*/
	
		//		Thread.sleep(5000);
		//Example for Drag and Drop
		WebElement sDropFrom = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));	
		WebElement sDropTarget = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));	
		
		//Using clickAndHold method
		//sActionDrag.clickAndHold(sDropFrom).moveToElement(sDropTarget).release().build().perform();
		
		//Using dragAndDrop method
		sActionDrag.dragAndDrop(sDropFrom, sDropTarget).release().build().perform();
		
		
		//Draggable rows
		
		sDropFrom = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));	
		sDropTarget = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));	
		
		//Using clickAndHold method
		//sActionDrag.clickAndHold(sDropFrom).moveToElement(sDropTarget).release().build().perform();
		
		//Using dragAndDrop method
		sActionDrag.dragAndDrop(sDropFrom, sDropTarget).release().build().perform();	
		
		
			

	}

}
