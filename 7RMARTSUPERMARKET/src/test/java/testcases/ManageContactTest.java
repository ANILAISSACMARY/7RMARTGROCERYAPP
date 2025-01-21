package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;

public class ManageContactTest extends BaseClass {
	

	LoginPage lp;
	HomePage hp;
	ManageContactPage mcp;
  @Test
  public void verifyUserIsAbleToUpdateContactWithValidDetails() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mcp=hp.clickOnManageContactButton().clickOnActionButton().enterPhoneNumberInField()
	  .enterEmailId().enterAddress().enterDeliveryTime().enterDeliveryCharge().clickOnUpdateButton();
	  boolean expectedresult=true;
	  boolean actualresult=mcp.isAlertMessageDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.MCP_verifyUserIsAbleToUpdateContactWithValidDetails);
	  
	  
	  
  }
}
