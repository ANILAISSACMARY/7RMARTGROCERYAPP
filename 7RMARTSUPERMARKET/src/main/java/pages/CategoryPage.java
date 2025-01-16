package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenerallUtilities;

public class CategoryPage {
WebDriver driver;
GenerallUtilities gu=new GenerallUtilities();

public CategoryPage(WebDriver driver){
// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);}
@FindBy(xpath="//a[text()=' Search']") WebElement searchfield;
@FindBy(xpath="//input[@placeholder='Category']")WebElement entercategoryname;
@FindBy(xpath="//button[text()='Search']") WebElement searchname;
@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultnotfoundmessage;

public CategoryPage clickOnSearchButton()
	{
	   searchfield.click();
	   return this;
	}
	
public CategoryPage enterCategoryName()
	{
		entercategoryname.sendKeys("VegetablesAndNuts");
		return this;
	}
	
public CategoryPage  clickOnSearchButton2()

{ 
	searchname.click();
	return this;
		
	}

public boolean resultNotFoundMessageIsDisplayed()
{
	return resultnotfoundmessage.isDisplayed();
}
}












