package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "txtUsername")
	WebElement userName;
	
	@FindBy(id = "txtPassword")
	WebElement Password;
	
	@FindBy(id = "btnLogin")
	WebElement LoginBtn;
	
	public void Login(String user_name, String password) {
		setText(userName, user_name);
		setText(Password, password);
		click(LoginBtn);
	}

}
