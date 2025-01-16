
package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenerallUtilities {
	WebDriver driver;
	
	public void hoverOverElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
	public void clickOnElement(WebElement element) {
		element.click();
	}
	public void rightClick(WebElement element)
	{ Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
		
	}

	public void doubleClick(WebElement element)
	{Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
		
	}
	public void arrowUP(WebElement element)
	{Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_UP).perform();
	}

	public void arrowDown(WebElement element)
	{Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ARROW_DOWN).perform();
	}


	public void dragAndDrop(WebElement element)
	{Actions actions = new Actions(driver);
	actions.dragAndDrop(element, element);
		
	}

	public void clickUsingJavaScriptMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
	}
	public void scrollbottompage() {
		
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 

	}
	public void scrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public String generateCurrentDateAndTime() {

		Date date = new Date();

		SimpleDateFormat formatter = new

		SimpleDateFormat("ddMMyyhhmmss");

		return formatter.format(date);

		}
	public String selectDropdownWithValue(WebElement element, String value) {
		Select object = new Select(element);
		object.selectByValue(value);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}

	public String selectDropdownWithIndex(WebElement element, int indexNumber) {
		Select object = new Select(element);
		object.selectByIndex(indexNumber);
		WebElement selectedElement = object.getFirstSelectedOption();
		return selectedElement.getText();
	}
	public void selectDropdownWithVisibleText(WebElement element, String text) {
		Select object = new Select(element);
		object.selectByVisibleText(text);
		WebElement selectedElement = object.getFirstSelectedOption();
		selectedElement.click();
	}
	public void selectRadioButton(WebElement radioButton) {
		radioButton.click();
	}

	
}