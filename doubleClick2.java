package ActionsClass;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new FirefoxDriver();
		
	    driver.get("https://artoftesting.com/samplesiteforselenium");
	    
	    
	    driver.manage().window().maximize();
	   WebElement e1= driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	   e1.click();
	   
	   Actions a1= new Actions(driver);
	   a1.doubleClick(e1).perform();
	   
	   Thread.sleep(3000);
	   Alert a2=driver.switchTo().alert();
	   
	 String txt=a2.getText();
	 System.out.println(txt);
	 
	 a2.accept();
	  
	}

}
