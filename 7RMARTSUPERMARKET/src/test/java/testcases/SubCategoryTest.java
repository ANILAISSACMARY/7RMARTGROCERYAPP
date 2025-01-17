package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.SubCategoryPage;

public class SubCategoryTest extends BaseClass{
	LoginPage lp;
	HomePage hp;
	SubCategoryPage sp;
	
 @Test
  public void VerifyAddNewSubCategoryWithValidDetails() throws IOException {
	  
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  sp=hp.clickOnSubCategoryButton().clickOnNewTabButton().selectCategory().enterSubCategory()
	  .chooseFileImage().clickOnSaveButton();
	  boolean expectedresult=true;
	  boolean actualresult=sp.isAlertMessageDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.SP_VerifyAddNewSubCategoryWithValidDetails);
	  
	  	   }
  @Test
  
  public void VerifySubCategoryItemSearchPossible() throws IOException
  {
	  
	  lp=new LoginPage(driver);
	  hp=lp.loginByUsingExcelData();
	  sp=hp.clickOnSubCategoryButton().clickOnSearchButton().enterTheSearchItems().clickOnSearchButton2();
	  boolean expectedresult=true;
	  boolean actualresult=sp.isResultNotFoundMessageDisplayed();
	  Assert.assertEquals(expectedresult, actualresult,Constants.SP_VerifySubCategoryItemSearchPossible);
	
	  
  
}
}







