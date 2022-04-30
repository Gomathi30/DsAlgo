package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CommonLinks extends BaseClass {
	
public CommonLinks(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy (linkText ="NumpyNinja")
	@FindBy(xpath="//div//nav//a[@href='/home']")
	WebElement portalpagelnk;
	
	@FindBy (linkText ="Sign in")
	WebElement signIn;
	
	@FindBy (linkText ="Register")
	WebElement register;
	
	@FindBy (xpath= "//ul//a[2]")
	WebElement usernamelnk;
	
	@FindBy(xpath="//ul//a[3]")
	WebElement signoutlnk;
	
	@FindBy (linkText="Data Structures")
	WebElement dropdown;
	
	@FindBy (xpath="//div//a[@href=\"/graph\"]") 
	WebElement graph;

	
	public void clickOnSignInLink() {
		signIn.click();
	}
	
	public void clickOnSignOutLink() {
		signoutlnk.click();
	}
	
	public void clickOnRegisterLink() {
		register.click();
	}
	public void verifySignIn(String username) {
		//Todo assertions
		//Assert.assertEquals("https://dsportalapp.herokuapp.com/home",driver.getCurrentUrl());
		System.out.println("Username displayed is:"+usernamelnk.getText());
		Assert.assertEquals(usernamelnk.getText().toLowerCase(),username );
		Assert.assertEquals(signoutlnk.getText(),"Sign out" );
	}
	
	public void selectDSFromDropdown(String dataStructure)
	{
		clickonDSDropDown();
		graph.click();
	}
	

	private void clickonDSDropDown() {
		dropdown.click();
		
	}
	
	public void movetoPortalpage() {
		System.out.println("inside portal page");
		System.out.println(portalpagelnk.isDisplayed());
		portalpagelnk.click(); 
		System.out.println(portalpagelnk.getText());
		System.out.println("After portal page click");
	}
	public void waitOn()
	{
		
	}
}
