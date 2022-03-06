package Pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PageBase {

	protected WebDriver driver;

	// create constructor
	public PageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// click on element
	public void click(WebElement element) {
		element.click();
	}

	// set text to an element
	public void setText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// move to element
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// move to element and click
	public void moveToElementClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	// select from drop down menu
	public void SelectDropDown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// asert that actual text equal expected text
	public void AssertText(WebElement element,String text) {
	  //Assert.assertEquals(actual, expected);
		Assert.assertTrue(element.getText().contains(text));
	}

}
