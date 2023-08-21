package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickANDHold {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");

		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("//div[@id='box1']"));
		
		Actions a2=new Actions(driver);
		a2.clickAndHold(e1).perform(); // Toclick and move 
		
		
	}

}
