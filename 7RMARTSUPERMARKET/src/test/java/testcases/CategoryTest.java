package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import constants.Constants;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;

public class CategoryTest extends BaseClass {
	
	LoginPage lp;
	HomePage hp;
	CategoryPage cp;
 @Test(groups="smoke")
 public void verifyCategoryItemSearchIsPossible() throws IOException 
 {
	 lp=new LoginPage(driver);
	 hp=lp.loginByUsingExcelData();
	 cp=hp.clickOnCategoryButton().clickOnSearchButton().enterCategoryName().clickOnSearchButton2();
     boolean expectedresult=true;
     boolean actualresult=cp.resultNotFoundMessageIsDisplayed();
     Assert.assertEquals(expectedresult, actualresult,Constants.CP_verifyCategoryItemSearchIsPossible);
  }
}
