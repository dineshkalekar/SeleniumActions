package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Brand_Search_Misspells&gclid=EAIaIQobChMI45jjpvnngAMVw5pmAh0xfQnSEAAYASAAEgJ3gfD_BwE");

		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("(//a[@href=\"/shop/women\"])[1]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
	
	}

}
