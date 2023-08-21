package ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class contaxtClick {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new FirefoxDriver();
//
//		driver.manage().window().maximize(); // Maximuz the Screen
//
//		driver.get("https://artoftesting.com/samplesiteforselenium");
//
//		WebElement e1=driver.findElement(By.xpath("//button[@id='idOfButton']"));
//	
//		
//		Actions a1=new Actions(driver);
//		
//		a1.contextClick(e1).perform();

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize(); // Maximuz the Screen

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement e1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions a1=new Actions(driver);
		a1.contextClick(e1).perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
		
		Alert a2=driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String gettxt=a2.getText();
		Thread.sleep(2000);
		System.out.println(gettxt);
		a2.accept();
	}

}
