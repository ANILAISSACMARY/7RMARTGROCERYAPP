package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends BaseClass {
	
LoginPage lp;
HomePage hp;
ManageCategoryPage mp;
  @Test(priority=0)
 public void verifyUserIsAbleToAddNewCategoryWithValidDetails() throws IOException
  {
 lp=new LoginPage(driver);
hp=lp.loginByUsingExcelData();
mp=hp.clickOnManageCategoryButton().clickOnNewButton().enterCategoryName().selectGroups()
.clickOnChooseFile().selectTopMenuRadioButton().selectLeftMenuButton().clickOnSaveButton();
boolean expectedresult=true;
boolean actualresult=mp.alertMessageIsDisplayed();
Assert.assertEquals(expectedresult, actualresult,Constants.MP_verifyUserIsAbleToAddNewCategoryWithValidDetails);
  }
 
  @Test(priority=1)
 
  public void verifyUserIsAbleToSearchNonExistingCategoryItem() throws IOException 
  {
 	 lp=new LoginPage(driver);
 	 hp=lp.loginByUsingExcelData();
 	 mp=hp.clickOnManageCategoryButton().clickOnSearchButton().enterCategoryName2().clickOnSearchButton2();
      boolean expectedresult=true;
      boolean actualresult=mp.resultNotFoundMessageIsDisplayed();
      Assert.assertEquals(expectedresult, actualresult,Constants.MP_verifyUserIsAbleToSearchNonExistingCategoryItem);
   }
}
