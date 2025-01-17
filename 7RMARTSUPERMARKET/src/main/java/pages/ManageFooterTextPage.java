package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenerallUtilities;

public class ManageFooterTextPage {
	
	WebDriver driver;
	GenerallUtilities gu=new GenerallUtilities();

	
	public ManageFooterTextPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']") WebElement actionfield;
	@FindBy(xpath="//textarea[@name='address']") WebElement addressfield;
	@FindBy(xpath="//input[@id='email']") WebElement emailidfield;
	@FindBy(xpath="//input[@name='phone']") WebElement phonenumberfield;
	@FindBy(xpath="//button[@name='Update']") WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
	
	public ManageFooterTextPage clickOnActionIcon()
	{ 
		actionfield.click();
	   return this;
	}
	
	public ManageFooterTextPage enterAddressDetail()
	{   
		addressfield.clear();
		addressfield.sendKeys("mukkadakattu");
		return this;
	}
	 
	public  ManageFooterTextPage enterEmailId()
	{
		emailidfield.clear();
		emailidfield.sendKeys("anilamaryissac@gmail.com");
		return this;
	}
	
	public ManageFooterTextPage enterPhoneNumber()
	{
		phonenumberfield.clear();
		phonenumberfield.sendKeys("7012150518");
		return this;
	}
	public ManageFooterTextPage ClickOnUpdateButton()
	{   updatebutton.click();
		return this;
	}
	public boolean isAlertMessageDisplayed()
	{
		return alertmessage.isDisplayed();
	}
}
