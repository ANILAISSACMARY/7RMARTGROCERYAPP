package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadutility
{
	
	
public WebDriver driver;
	public void fileuploadSendkeys(WebElement element,String filepath) 
	{
		  element.sendKeys(filepath);
		 
		
	}
	public void fileUploadUsingRobotKey() throws AWTException
	{
		
		
	    driver.navigate().to("https://demo.guru99.com/test/upload/");	
		Actions obj=new Actions(driver);
	    WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		obj.moveToElement(choosefile).click().perform();
		
		StringSelection ss=new StringSelection("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot 2024-07-04 193813.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot robot= new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	} 
}