package ActionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		e1.click();
		
		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		
		List<WebElement>box=driver.findElements(By.xpath("//li[contains(@class,'context-menu-item context-menu-icon ')]"));
		
		
		for(int i=0;i<box.size();i++) {
			WebElement e2=box.get(i);
			String OneByOne=e2.getText();
			String BoxList=box.get(i).getText();
			System.out.println(BoxList);
			if(OneByOne.equals("Edit")) {
				
			Thread.sleep(2000);
			a1.click(e2).perform();
			
			break;
			
			}
		}
		Alert a2=driver.switchTo().alert();
		Thread.sleep(2000);
		String txt=a2.getText();
		System.out.println(txt);
		a2.accept();
		
		
	}

}
