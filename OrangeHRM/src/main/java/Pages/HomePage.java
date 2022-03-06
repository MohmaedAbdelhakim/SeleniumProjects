package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagment;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement users;
	
	public void openUsersPage() {
		moveToElement(Admin);
		moveToElement(userManagment);
		moveToElementClick(users);
	}

}
