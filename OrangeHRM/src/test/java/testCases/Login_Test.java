package testCases;


import org.testng.annotations.Test;

import Pages.AddUserPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserManagmentPage;

public class Login_Test extends TestBase {
	
	@Test
	public void user_Login() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.Login("Admin","admin123");
		
	}

}
