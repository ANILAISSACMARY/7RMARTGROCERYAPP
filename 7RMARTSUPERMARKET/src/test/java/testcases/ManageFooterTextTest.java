package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;

public class ManageFooterTextTest extends BaseClass{
	

	LoginPage lp;
	HomePage hp;
	ManageFooterTextPage mfp;
	
  @Test
  public void verifyUserIsAbleToUpdateFooterTextWithValidDetails() throws IOException {
	  
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mfp=hp.clickOnManageFooterButton().clickOnActionIcon().enterAddressDetail().enterEmailId()
	  .enterPhoneNumber().ClickOnUpdateButton();
	  boolean expectedresult=true;
	  boolean actualresult=mfp.isAlertMessageDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.MFP_verifyUserIsAbleToUpdateFooterTextWithValidDetails);
	 
  }
}
