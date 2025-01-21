package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="//span[text()='7rmart supermarket']") WebElement homePageText;
@FindBy(xpath="//p[text()='Sub Category']") WebElement subCategoryButton;
@FindBy(xpath="//p[text()='Manage Category']") WebElement managecategorybutton;
@FindBy(xpath="//p[text()='Manage Contact']") WebElement managecontactbutton;
@FindBy(xpath="//p[text()='Category']") WebElement categoryfield;
@FindBy(xpath="//p[text()='Manage Footer Text']") WebElement managefootertextbutton;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/' and@ class='active nav-link']") WebElement managegiftandvoucherbutton;
@FindBy(xpath="//p[text()='Manage News']") WebElement managenewsbutton;

public String getHomePageText()
{
	return homePageText.getText();
}

public SubCategoryPage clickOnSubCategoryButton()
{
	subCategoryButton.click();
	return new SubCategoryPage(driver);
}

public ManageCategoryPage clickOnManageCategoryButton()
{
	managecategorybutton.click();
	return new ManageCategoryPage(driver);
	
}
public ManageContactPage clickOnManageContactButton() {
	
	managecontactbutton.click();
	return new ManageContactPage(driver);
}

public ManageFooterTextPage clickOnManageFooterButton()
{
	managefootertextbutton.click();
	return new ManageFooterTextPage(driver);
}

public ManageGiftAndVouchersPage clickOnManageGiftVoucherButton()
{
	managegiftandvoucherbutton.click();
	return new ManageGiftAndVouchersPage(driver);
}

public ManageNewsPage clickOnManageNewsButton()
{
	
	managenewsbutton.click();
	return new ManageNewsPage(driver);
}
}
