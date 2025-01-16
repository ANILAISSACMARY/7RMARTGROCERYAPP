package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenerallUtilities;

public class ManageContactPage {
	
	
WebDriver driver;
GenerallUtilities gu=new GenerallUtilities();

public ManageContactPage(WebDriver driver)

{this.driver=driver;
	PageFactory .initElements(driver, this);
}

@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']") WebElement actionbutton;
@FindBy(xpath="//input[@name='phone']") WebElement phonenumberfield;
@FindBy(xpath="//textarea[@placeholder='Enter Delivery Time']") WebElement deliverytimefield;
@FindBy(xpath="//input[@id='del_limit']") WebElement deliverychargefield;
@FindBy(xpath="//input[@id='email']") WebElement emailidfield;
@FindBy(xpath="//textarea[@placeholder='Enter the Address']") WebElement addressfield;
@FindBy(xpath="//button[text()=' Update']")WebElement updatebutton;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;

public ManageContactPage clickOnActionButton()
{ 
	actionbutton.click();
   return this;
}

public ManageContactPage enterPhoneNumberInField() {
	
	phonenumberfield.clear();
	phonenumberfield.sendKeys("7012150518");
	return this;
}

public ManageContactPage enterEmailId()
{
	emailidfield.clear();
	emailidfield.sendKeys("anilaevan456@gmail.com");
	return this;
}

public ManageContactPage enterAddress()
{
	addressfield.clear();
	addressfield.sendKeys("Mukkadakattu House Anikad Po Mallapally");
	return this;
}

public ManageContactPage enterDeliveryTime()
{  
   deliverytimefield.clear();
   deliverytimefield.sendKeys("30");
	return this;

}

public ManageContactPage enterDeliveryCharge()
{
	deliverychargefield.clear();
	deliverychargefield.sendKeys("200");
	return this;
}
	
public ManageContactPage clickOnUpdateButton()
	{ 
	gu.scrollToElement(driver, updatebutton);
	  updatebutton.click();
	  return this;
	}
	
public boolean isAlertMessageDisplayed()
	{
		return alertmessage.isDisplayed();
	}

}




