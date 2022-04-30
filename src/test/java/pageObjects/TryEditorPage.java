package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditorPage extends BaseClass{
//div[@class='input']
	
	public TryEditorPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//div//div//form//div[@class='CodeMirror cm-s-default']")
	WebElement codemirror;
	@FindBy (xpath = "//button[@type='button']") WebElement runButton;
	public void sendCode() {
		/*(codemirror.clear();
		System.out.println("1."+codemirror.isDisplayed());
		System.out.println("2."+codemirror.isEnabled());
		codemirror.sendKeys("print 10");*/
		//String js_call = "window.editor.setValue(\"Hello World\"); ";
		String js_call = "window.editor.setValue(\"print(10)\"); ";
		//String js_call = window.editor.setValue(\"print("\"Hello World\"")\"); ;
		//href=\"/queue/implementation-lists/\"]
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript(js_call);

		
	}
	public void clickRunButton() {
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("inside run button click fn");
		runButton.click();
		
	}
	
	
	
	
}
