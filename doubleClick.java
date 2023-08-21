package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
	    driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	    
	    
	    
	   WebElement e1= driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
	   
	   e1.click();
	    
	    Actions a1= new Actions(driver);
	    
	    a1.doubleClick(e1).perform();
	    
	    Alert al2=driver.switchTo().alert();
	    Thread.sleep(3000);
	    
	    al2.accept();
	
	}

}
