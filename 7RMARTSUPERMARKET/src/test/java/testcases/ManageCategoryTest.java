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
  @Test
  public void createNewItemUnderManageCategoryPage() throws IOException
  {
 lp=new LoginPage(driver);
hp=lp.loginByUsingExcelData();
mp=hp.clickOnManageCategoryButton().clickOnNewButton().enterCategoryName().selectGroups()
.clickOnChooseFile().selectTopMenuRadioButton().selectLeftMenuButton().clickOnSaveButton();
boolean expectedresult=true;
boolean actualresult=mp.alertMessageIsDisplayed();
Assert.assertEquals(expectedresult, actualresult,Constants.MP_createNewItemUnderManageCategoryPage);
  }
}
