package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Fileuploadutility;
import utilities.GenerallUtilities;

public class SubCategoryPage   {
	
WebDriver driver;
GenerallUtilities gu=new GenerallUtilities();
Fileuploadutility fu=new Fileuploadutility();
public SubCategoryPage(WebDriver driver){
// TODO Auto-generated constructor stub
this.driver=driver;
PageFactory.initElements(driver, this);}
	
@FindBy(xpath="//p[text()='Sub Category'] ") WebElement subcattegorybutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newtabbutton;
@FindBy(xpath="//select[@class='form-control selectpicker']") WebElement categorydropdown;
@FindBy(xpath="//input[@placeholder='Enter the Subcategory']") WebElement subcategory;
@FindBy(xpath="//input[@type='file']") WebElement choosefile;
@FindBy(xpath="//button[text()='Save']") WebElement savebutton;
@FindBy(xpath="//a[text()=' Search']") WebElement searchbutton;
@FindBy(xpath="//select[@class='form-control selectpicker']") WebElement selectfield;
@FindBy(xpath="//button[text()='Search']") WebElement searchbutton2;
@FindBy(xpath="//h4[text()='Search List Sub Categories']") WebElement searchtextfield;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultnotfoundmessagefield;

public SubCategoryPage clickOnNewTabButton()
{  
	newtabbutton.click();
	return this;
}

public SubCategoryPage selectCategory()
{   gu.selectDropdownWithIndex(categorydropdown, 6);
	return this;

}

public SubCategoryPage enterSubCategory()
{
	subcategory.sendKeys("Building Blocks"+gu.generateCurrentDateAndTime());
	return this;
	
}

public SubCategoryPage chooseFileImage()
{  fu.fileuploadSendkeys(choosefile,"C:\\Users\\VICTUS\\OneDrive\\Desktop\\build bl.png");
	return this;
}

public SubCategoryPage clickOnSaveButton()
{   
	savebutton.click();
	return this;
  }

public boolean isAlertMessageDisplayed()
{
	return alertmessage.isDisplayed();
}


public SubCategoryPage clickOnSearchButton()
{
	searchbutton.click();
	return this;
}

public SubCategoryPage enterTheSearchItems()
{ 
	gu.selectDropdownWithIndex(selectfield, 10);
	return this;
	
}
public SubCategoryPage clickOnSearchButton2()
{
   searchbutton2.click();
	return this;
}

public boolean isResultNotFoundMessageDisplayed()
{
	return resultnotfoundmessagefield.isDisplayed();
}
}


