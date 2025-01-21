package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageGiftAndVouchersPage;

public class ManageGiftAndVouchersTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	ManageGiftAndVouchersPage mgvp;
  @Test(groups="smoke")
  public void verifyUserIsAbleToAddNewAdminUsersInformationWithValidDatas() throws IOException {
	  
	  
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mgvp=hp.clickOnManageGiftVoucherButton().clickOnMoreInfo().clickOnNewTabButton().enterUserName()
	  .enterPassword() .selectusertype().clickOnSaveButton();	
	  boolean expectedresult=true;
	  boolean actualresult=mgvp.isAlertMessageIsDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.MGVP_verifyUserIsAbleToAddNewAdminUsersInformationWithValidDatas);
  }
  
  @Test
  public void verifyUserIsAbleToSearchNonExistingAdminUsers() throws IOException {
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  mgvp=hp.clickOnManageGiftVoucherButton().clickOnMoreInfo().clickOnSearchButton().enterUserNameOnSearch()
	  .selectTheUserType().clickOnSearchButton2();
	  boolean expectedresult=true;
	  boolean actualresult=mgvp.isResultNotFoundMessageIsDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.MGVP_verifyUserIsAbleToSearchNonExistingAdminUsers);
	  	  }
}
