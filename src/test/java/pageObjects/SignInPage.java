package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage extends BaseClass {

	
	public SignInPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	//input[@name='username']
	
	@FindBy (xpath = "//input[@name='username']")
	WebElement usernametxt;
	@FindBy (xpath="//input[@name='password']")
	WebElement passwordtxt;
	@FindBy (xpath = "//input[@value='Login']")
	WebElement loginbtn ;
	
	
	public void signIn(String username, String password) {
		 
		
		
		enterUsername(username);
		enterPassword(password);
	
		//username.sendKeys("gomathi");
		//password.sendKeys("NumpyNinja");
		
		loginbtn.click();
		
	}
	private void enterPassword(String password) {
		passwordtxt.clear();
		passwordtxt.sendKeys(password);
		
	}
	private void enterUsername(String username) {
		usernametxt.clear();
		usernametxt.sendKeys(username);
		
	}
	
}
