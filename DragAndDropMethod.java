package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");

		driver.manage().window().maximize();

		WebElement Source = driver.findElement(By.xpath("//div[@id='box1']"));
		
		WebElement Destination = driver.findElement(By.xpath("//div[@id='dropBox']"));
		
		Actions a2=new Actions(driver);
		
		a2.dragAndDrop(Source, Destination).perform();
	
	}

}
