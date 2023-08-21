package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementAmazoin {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=4619922533779964291&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062094&hvtargid=kwd-10573980&hydadcr=14453_2316415");

		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.xpath("//a[@id='icp-nav-flyout']"));
		
		Actions a2=new Actions(driver);
		a2.moveToElement(e1).perform();
		
		
	}

}
