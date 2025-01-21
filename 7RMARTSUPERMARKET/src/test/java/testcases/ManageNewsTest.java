package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;

import pages.ManageNewsPage;

public class ManageNewsTest extends BaseClass {
	LoginPage lp;
	HomePage hp;
	ManageNewsPage mnp;
	
  @Test(groups="smoke")
  public void verifyUserIsAbleToAddNewNewsWithValidDetails() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mnp=hp.clickOnManageNewsButton().clickOnNewTab().enterNewsDetails().clickOnSaveButton();
	  boolean expectedresult=true;
	  boolean actualresult=mnp.isAlertMessageIsDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.MNP_verifyUserIsAbleToAddNewNewsWithValidDetails);  
	 }
  
   @Test(retryAnalyzer=retry.Retry.class)
  
  public void verifyUserIsAbleToSearchNonExistingNews() throws IOException
  {  lp=new LoginPage(driver);
  hp=lp.loginByUsingExcelData();
  mnp=hp.clickOnManageNewsButton().clickOnSearchButton().enterTheNewsDetails().clickOnSearchButton2();
  boolean expectedresult=true;
  boolean actualresult=true;
  Assert.assertEquals(expectedresult, actualresult,Constants.MNP_verifyUserIsAbleToSearchNonExistingNews);
	
  }
  
  
	 

}
 
 
 
 
 
 
 
 
 
 
 
