package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement e1=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[3]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		
		WebElement e2=driver.findElement(By.xpath("//a[contains(text(),'Monitors (2)')]"));
		e2.click();
		
		List<WebElement>list=driver.findElements(By.xpath("//img[@class='img-fluid']"));
		int count=list.size();
		
		System.out.println(count);
		


	}

}
