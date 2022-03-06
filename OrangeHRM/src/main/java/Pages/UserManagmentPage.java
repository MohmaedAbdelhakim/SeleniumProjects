package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class UserManagmentPage extends PageBase {

	public UserManagmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "btnAdd")
	WebElement AddBtn;

	@FindBy(id = "searchSystemUser_userName")
	WebElement userName;

	@FindBy(id = "searchSystemUser_userType")
	WebElement userType;

	@FindBy(name = "searchSystemUser[employeeName][empName]")
	WebElement EmployeeName;

	@FindBy(id = "searchSystemUser_status")
	WebElement Status;

	@FindBy(id = "searchBtn")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@class='ac_results']/ul/li[3]")
	WebElement employeeNameList;
	

	public void click_AddBtn() {
		click(AddBtn);
	}

	public void Search_user(String user_name, String employee_name) {
		setText(userName, user_name);
		SelectDropDown(userType, "ESS");
		setText(EmployeeName, employee_name);
		click(employeeNameList);
		SelectDropDown(Status, "Enabled");
		click(searchBtn);
		//String username=userName.getText();
		AssertText(userName, user_name);
		//AssertText(employee_name, EmployeeName.getText());
	}

}
