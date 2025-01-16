package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GenerallUtilities;
public class ManageNewsPage {
WebDriver driver;
GenerallUtilities gu=new GenerallUtilities();
	
public ManageNewsPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()=' New']") WebElement newtabbutton;
	@FindBy(xpath="//textarea[@id='news']") WebElement enternewsfield;
	@FindBy(xpath="//button[text()='Save']") WebElement savebutton;
	@FindBy(xpath="//a[text()=' Search']") WebElement searchbutton;
	@FindBy(xpath="//input[@placeholder='Title']")WebElement newstitlefield;
	@FindBy(xpath="//button[text()='Search']")WebElement searchbutton2;
	@FindBy(xpath="//a[text()=' Reset']") WebElement resetbutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alertmessage;
	@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement resultnotfoundmessagefield;
	
	public ManageNewsPage clickOnNewTab()
	{  
		newtabbutton.click();
		return this;
		}
	public ManageNewsPage enterNewsDetails()
	{
		enternewsfield.sendKeys("Summer Deals Started");
		return this;
	}
	
	public ManageNewsPage clickOnSaveButton()
	{    
		savebutton.click();
		return this;
	}
	public boolean isAlertMessageIsDisplayed()
	{
		return alertmessage.isDisplayed();
	}
	
	public ManageNewsPage clickOnSearchButton()
	{
		searchbutton.click();
		return this;
	}
	
	public ManageNewsPage enterTheNewsDetails()
	{  
	   newstitlefield.sendKeys("Summer Deals Started On November");
		return this;
	}
	
	public ManageNewsPage clickOnSearchButton2()
	{
		searchbutton2.click();
		return this;
	}
	public boolean isResultNotFoundMessageDisplayed()
	{
		return resultnotfoundmessagefield.isDisplayed();
	}

	
}










