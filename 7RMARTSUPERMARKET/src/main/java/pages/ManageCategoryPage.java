package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Fileuploadutility;
import utilities.GenerallUtilities;
import utilities.WaitUtilities;

public class ManageCategoryPage {
	
	WebDriver driver;
	GenerallUtilities gu=new GenerallUtilities();
	WaitUtilities   wu=new WaitUtilities();
	Fileuploadutility fu=new Fileuploadutility();
	public ManageCategoryPage(WebDriver driver)
	{ this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//a[text()=' New']") WebElement newbutton;
@FindBy(xpath="//input[@placeholder='Enter the Category']")WebElement categoryfield;
@FindBy(xpath="//li[@id='134-selectable']")WebElement  selectgroupsfield;
@FindBy(xpath="//input[@id='main_img']")WebElement choosefilefield;
@FindBy(xpath="//input[@name='top_menu' and@value='no']") WebElement topmenuradiobutton;
@FindBy(xpath="//input[@name='show_home'and@value='yes']") WebElement leftmenubutton;
@FindBy(xpath="//button[@type='submit' and@class='btn btn-danger']")WebElement savebutton;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
@FindBy(xpath="//a[text()=' Search']") WebElement searchfield;
@FindBy(xpath="//input[@placeholder='Category']")WebElement entercategoryname;
@FindBy(xpath="//button[text()='Search']") WebElement searchname;
@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultnotfoundmessage;

public ManageCategoryPage clickOnNewButton()
{   gu.clickOnElement(newbutton);
	return this;
}

public ManageCategoryPage enterCategoryName()
{
	categoryfield.sendKeys("DriedFruits" +gu.generateCurrentDateAndTime());
	return this;
}

public ManageCategoryPage selectGroups()

{  gu.clickOnElement(selectgroupsfield);
	return this;
}


public ManageCategoryPage clickOnChooseFile()
{   gu.scrollToElement(driver, choosefilefield);
	fu.fileuploadSendkeys(choosefilefield, "C:\\Users\\VICTUS\\OneDrive\\Desktop\\driedfruits.jpg");
    return this;
}

public ManageCategoryPage selectTopMenuRadioButton()

{  
  gu.scrollToElement(driver, topmenuradiobutton);
  gu.hoverOverElement(driver, topmenuradiobutton);
  gu.selectRadioButton(topmenuradiobutton);
  return this;

	}

public ManageCategoryPage selectLeftMenuButton()
{
	gu.scrollToElement(driver, leftmenubutton);
	wu.waitUntilElementIsVisible(driver, leftmenubutton);
	gu.hoverOverElement(driver,leftmenubutton);
	gu.selectRadioButton(leftmenubutton);
	 return this;
}

public ManageCategoryPage clickOnSaveButton()
{ 
	
   savebutton.click();
    return this;
	
}

public boolean alertMessageIsDisplayed()
{
	return alertmessage.isDisplayed();
}

public ManageCategoryPage clickOnSearchButton()
{
   searchfield.click();
   return this;
}

public ManageCategoryPage enterCategoryName2()
{
	entercategoryname.sendKeys("VegetablesAndNuts");
	return this;
}

public ManageCategoryPage  clickOnSearchButton2()

{ 
searchname.click();
return this;
	
}

public boolean resultNotFoundMessageIsDisplayed()
{
return resultnotfoundmessage.isDisplayed();
}
}

















