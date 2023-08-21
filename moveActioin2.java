package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class moveActioin2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//a[@class='desktop-main']"));
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(e1).perform();
	
	}

}
