package constants;

public class Constants {
	
	public static final String CONFIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
    public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\Testdata\\GroceryAppDetails.xlsx";
    public static final String lp_verifyLoginWithValidCredentials ="login is not possible with valid datas";
	public static final String lp_verifyLoginWithInvalidUsernameAndValidPassword ="login is possible with invalid username and valid password ";
	public static final String lp_verifyLoginWithValidUsernameAndInvalidPassword ="login is possible with invalid password and valid username ";
	public static final String lp_verifyLoginWithInValidUsernameAndInvalidPassword ="login is possible with invalid username and invalid password";
	public static final String MP_verifyUserIsAbleToAddNewCategoryWithValidDetails="Category Created Successfully alert message is not displayed";
    public static final String MP_verifyUserIsAbleToSearchNonExistingCategoryItem="Category item and corresponding image is displayed in the table List Categories";
    public static final String MCP_verifyUserIsAbleToUpdateContactWithValidDetails="Contact Updated Successfully alert message is not displayed as expected";
    public static final String MFP_verifyUserIsAbleToUpdateFooterTextWithValidDetails="Footer Text Updated Successfully alert message is not displayed as expected";
    public static final String MGVP_verifyUserIsAbleToAddNewAdminUsersInformationWithValidDatas="User Created Successfully alert message is not displayed as expected";
    public static final String MGVP_verifyUserIsAbleToSearchNonExistingAdminUsers="Username is displayed in the table Admin Users";
    public static final String MNP_verifyUserIsAbleToAddNewNewsWithValidDetails="News Created Successfully alert message is not displayed";
    public static final String MNP_verifyUserIsAbleToSearchNonExistingNews="News is diaplayed in the table Manage News";
    public static final String SP_verifyUserIsAbleToAddNewSubCategoryWithValidDetails="Sub Category Created Successfully alert message is not displayed";
    public static final String  SP_verifyUserIsAbleToSearchNonExistingSubCategoryItem="Sub Category Name and corresponding details are displayed";
}







