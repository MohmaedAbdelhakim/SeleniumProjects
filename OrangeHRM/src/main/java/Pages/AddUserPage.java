package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends PageBase {

	public AddUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "systemUser_userType")
	WebElement userType;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement EmployeeName;

	@FindBy(id = "systemUser_userName")
	WebElement UserName;

	@FindBy(id = "systemUser_status")
	WebElement Status;

	@FindBy(id = "systemUser_password")
	WebElement Password;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id = "btnSave")
	WebElement btnSave;
	
	@FindBy(xpath = "//div[@class='ac_results']/ul/li[3]")
	WebElement employeeNameList;

	public void Add_User(String employee_name, String user_name, String password, String confirm_password) {
		SelectDropDown(userType, "ESS");
		setText(EmployeeName, employee_name);
		setText(UserName, user_name);
		click(employeeNameList);
		SelectDropDown(Status, "Enabled");
		setText(Password, password);
		setText(ConfirmPassword, confirm_password);
		click(btnSave);
	}

}
