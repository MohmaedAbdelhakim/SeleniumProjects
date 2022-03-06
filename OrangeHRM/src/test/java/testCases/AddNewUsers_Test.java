package testCases;

import org.testng.annotations.Test;

import Pages.AddUserPage;
import Pages.HomePage;
import Pages.UserManagmentPage;

public class AddNewUsers_Test extends TestBase {
	
	@Test
	public static void Add_User() {
		HomePage homePage=new HomePage(driver);
		homePage.openUsersPage();
		
		UserManagmentPage userManagmentPage=new UserManagmentPage(driver);
		userManagmentPage.click_AddBtn();
		
		AddUserPage addUserPage=new AddUserPage(driver);
		addUserPage.Add_User("a", "MohamedHak", "User_Admin1234567", "User_Admin1234567");	
		UserManagmentPage UserManagmentPage=new UserManagmentPage(driver);
		UserManagmentPage.Search_user("MohamedHak", "a");
	}
}
