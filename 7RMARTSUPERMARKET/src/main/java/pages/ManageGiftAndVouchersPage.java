package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenerallUtilities;

public class ManageGiftAndVouchersPage {
	
	WebDriver driver;
	GenerallUtilities gu=new GenerallUtilities();
	
	public  ManageGiftAndVouchersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//a[text()='More info ' and@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") WebElement moreinfofield;
@FindBy(xpath="//a[text()=' New']") WebElement newtabbutton;
@FindBy(xpath="//input[@id='username']") WebElement usernamefield;
@FindBy(xpath="//input[@id='password']") WebElement passwordfield;
@FindBy(xpath="//select[@name='user_type']") WebElement usertypefield;
@FindBy(xpath="//button[@type='submit'and@ name='Create']") WebElement savebutton;
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searachbutton;
@FindBy(xpath="//input[@type='text' and@id='un']") WebElement usernamefield2;
@FindBy(xpath="//select[@class='form-control' and@ id='ut']") WebElement selectusertypefield;
@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and@ name='Search']") WebElement searchbutton2;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultnotfoundmessagefield;


public  ManageGiftAndVouchersPage clickOnMoreInfo()
{  
	moreinfofield.click(); 
	return this;
}

public  ManageGiftAndVouchersPage clickOnNewTabButton()
{ 
	newtabbutton.click();
	return this;
}

public  ManageGiftAndVouchersPage enterUserName()
{
	usernamefield.sendKeys("AnilaIssacMaryShalu" +gu.generateCurrentDateAndTime());
	return this;
}

public  ManageGiftAndVouchersPage enterPassword()
{
	passwordfield.sendKeys("adminpassword");
	return this;
}
public  ManageGiftAndVouchersPage selectusertype()
{   gu.selectDropdownWithIndex(usertypefield, 2);
	return this;
}

public  ManageGiftAndVouchersPage clickOnSaveButton()
{  
	savebutton.click();
	return this;
}

public boolean isAlertMessageIsDisplayed()
{
	return alertmessage.isDisplayed();
}

public  ManageGiftAndVouchersPage clickOnSearchButton()
{  
	searachbutton.click();
	return this;
}

public  ManageGiftAndVouchersPage enterUserNameOnSearch()
{
	usernamefield2.sendKeys("Amrita");
	return this;
}

public  ManageGiftAndVouchersPage selectTheUserType()
{  
	gu.selectDropdownWithIndex(selectusertypefield, 0);
	return this;
}

public  ManageGiftAndVouchersPage clickOnSearchButton2()
{  
	searchbutton2.click();
	return this;
}

public boolean isResultNotFoundMessageIsDisplayed()
{
	return resultnotfoundmessagefield.isDisplayed();
}

}












